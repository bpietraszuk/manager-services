package home.mlody.manager.services;

import home.mlody.manager.services.mongo.MorphiaService;

public abstract class BaseService {

	protected MorphiaService morphiaService;

	public BaseService() {
		morphiaService = new MorphiaService();
	}
}
