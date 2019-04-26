package service;

import org.springframework.beans.factory.annotation.Autowired;

import dao.ITdsDao;
import model.TDSMaster;

public class ServiceTdsImpl implements IServiceTds {
	
	@Autowired
	ITdsDao dao;
	
	public TDSMaster getByID(int id) {
		return dao.getById(id);
	}

}
