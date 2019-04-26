package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import exceptions.IdnotFound;
import model.TDSMaster;
import service.IServiceTds;

public class HomeController {
	
	@Autowired
	IServiceTds service;
	
	@GetMapping("/getById/{id}")
	public TDSMaster getById(@PathVariable int id) throws IdnotFound {
		TDSMaster tdsDetails=service.getByID(id);
		if(tdsDetails==null) {
			throw new IdnotFound("ID not found wrong ID : "+id);
		}
		else
			return tdsDetails;
	}

}
