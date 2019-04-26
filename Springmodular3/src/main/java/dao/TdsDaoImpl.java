package dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import model.TDSMaster;

public class TdsDaoImpl implements ITdsDao {
	@PersistenceContext
	EntityManager entityManager;
	public TDSMaster getById(int id) {
		TDSMaster tds=entityManager.find(TDSMaster.class, id);
		return tds;
		
	}

}
