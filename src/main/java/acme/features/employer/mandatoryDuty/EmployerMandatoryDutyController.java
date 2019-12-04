
package acme.features.employer.mandatoryDuty;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.mandatoryDuties.MandatoryDuty;
import acme.entities.roles.Employer;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;

@Controller
@RequestMapping("/employer/mandatory-duty/")
public class EmployerMandatoryDutyController extends AbstractController<Employer, MandatoryDuty> {

	//	Internal state ------------

	@Autowired
	private EmployerMandatoryDutyListService	listService;

	@Autowired
	private EmployerMandatoryDutyShowService	showService;


	//	Constructors -------------

	@PostConstruct
	private void initalise() {
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
	}
}
