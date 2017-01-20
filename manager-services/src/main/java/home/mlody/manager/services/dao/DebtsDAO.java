package home.mlody.manager.services.dao;

import java.util.List;

import org.bson.types.ObjectId;
import org.mongodb.morphia.dao.DAO;

import home.mlody.manager.services.domain.Debt;

public interface DebtsDAO extends DAO<Debt, ObjectId> {

	public List<Debt> getByReceiver(String receiver);

}
