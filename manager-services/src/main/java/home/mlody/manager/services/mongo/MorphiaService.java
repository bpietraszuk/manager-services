package home.mlody.manager.services.mongo;

import javax.ejb.Singleton;
import javax.enterprise.inject.Produces;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

import com.mongodb.MongoClient;

@Singleton
public class MorphiaService {

	private Datastore ds;

	@Produces
	public Datastore getDatastore() {
		// Lazy load the datastore
		if (ds == null) {
			try {
				Morphia morphia = new Morphia();
				ds = morphia.createDatastore(new MongoClient("127.0.0.1:27017"), "home-manager");
				// ... Other datastore options
			} catch (Exception e) {
				// Handle it
			}
		}
		return ds;
	}
}