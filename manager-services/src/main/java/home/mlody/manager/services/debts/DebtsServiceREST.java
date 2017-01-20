package home.mlody.manager.services.debts;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import home.mlody.manager.services.domain.Debt;
import home.mlody.manager.services.mongo.MorphiaService;

@Path("/debts/")
@RequestScoped
public class DebtsServiceREST {

	@Inject
	private MorphiaService morphiaService;

	private DebtsService service;

	@PostConstruct
	public void initialize() {
		service = new DebtsService(Debt.class, morphiaService.getDatastore());
	}

	@GET
	@Path("/get/{receiverName}")
	@Produces("application/json")
	public List<Debt> getDebts(@PathParam("receiverName") String receiverName) {
		return service.getDebts(receiverName);

	}

}
