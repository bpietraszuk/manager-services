package home.mlody.manager.services.debts;

import java.util.Date;
import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;

import home.mlody.manager.services.domain.Debt;

public class DebtsService extends BasicDAO<Debt, ObjectId> {

	public DebtsService(Class<Debt> entityClass, Datastore ds) {
		super(entityClass, ds);
	}

	public List<Debt> getDebts(String receiverName) {
		Debt debt = new Debt();
		debt.setReceiverName(receiverName);
		debt.setComment("aaaaaaaaaaa");
		debt.setDebtorName("aaaaaaaaaaaaaaaaaa1");
		debt.setPaid(false);
		debt.setEventTime(new Date());
		save(debt);
		Query<Debt> query = createQuery().field("receiverName").equal(receiverName);
		return query.asList();
	}
}
