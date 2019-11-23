
package acme.features.authenticated.shout;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import acme.entities.shouts.Shout;
import acme.framework.components.Model;
import acme.framework.components.Request;
import acme.framework.entities.Authenticated;
import acme.framework.services.AbstractListService;

@Service
public class AuthenticatedShoutListService implements AbstractListService<Authenticated, Shout> {

	//internal
	@Autowired
	AuthenticatedShoutRepository repository;
	// interface


	@Override
	public boolean authorise(final Request<Shout> request) {
		assert request != null;
		return true;
	}

	@Override
	public void unbind(final Request<Shout> request, final Shout entity, final Model model) {
		assert request != null;
		assert entity != null;
		assert model != null;
		request.unbind(entity, model, "author", "text", "moment");
	}

	@Override
	public Collection<Shout> findMany(final Request<Shout> request) {
		assert request != null;
		Collection<Shout> result;
		result = this.repository.findMany();
		return result;
	}
}