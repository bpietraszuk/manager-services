package home.mlody.manager.services.dao;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.dao.BasicDAO;
import org.mongodb.morphia.query.Query;

import home.mlody.manager.services.domain.Debt;

public class DebtsDAOImpl extends BasicDAO<Debt, ObjectId> implements DebtsDAO {

	public DebtsDAOImpl(Class<Debt> entityClass, Datastore ds) {
		super(entityClass, ds);
	}

	@Override
	public List<Debt> getByReceiver(String receiver) {
		Query<Debt> query = createQuery().field("receiver").equal(receiver);
		return query.asList();
	}
}