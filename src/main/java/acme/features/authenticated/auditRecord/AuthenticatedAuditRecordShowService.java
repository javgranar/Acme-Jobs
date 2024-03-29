
package acme.features.authenticated.auditRecord;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.auditRecords.AuditRecord;
import acme.entities.roles.Auditor;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.entities.Principal;
import acme.framework.services.AbstractShowService;

@Service
public class AuthenticatedAuditRecordShowService implements AbstractShowService<Authenticated, AuditRecord> {

	// Internal State ------------------------------------------------------

	@Autowired
	AuthenticatedAuditRecordRepository repository;


	// AbstractListService<Auditor, AuditorRecord> interface ------------

	@Override
	public boolean authorise(final Request<AuditRecord> request) {
		assert request != null;
		boolean result;
		int auditorRecordId;
		AuditRecord auditRecord;
		Auditor auditor;
		Principal principal;

		auditorRecordId = request.getModel().getInteger("id");
		auditRecord = this.repository.findOneById(auditorRecordId);
		auditor = auditRecord.getAuditor();
		principal = request.getPrincipal();
		result = auditor.getUserAccount().getId() == principal.getAccountId() || auditRecord.getPublished() == true;

		return result;
	}

	@Override
	public void unbind(final Request<AuditRecord> request, final AuditRecord entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;

		request.unbind(entity, model, "title", "creationMoment");
		request.unbind(entity, model, "body", "published");

	}

	@Override
	public AuditRecord findOne(final Request<AuditRecord> request) {
		assert request != null;

		AuditRecord result;
		int id;

		id = request.getModel().getInteger("id");
		result = this.repository.findOneById(id);

		return result;
	}

}
