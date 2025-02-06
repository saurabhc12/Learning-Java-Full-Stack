package services;

import java.util.List;

import dao.Dao;
import entity.Candidate;

public class Service {
	
	public List<Candidate> getAllCandidate(){
		System.out.println("we r in service");
		Dao dao = new Dao();
		List<Candidate> allcandidate=dao.getAllCandidate();

		return null;
	}

}
