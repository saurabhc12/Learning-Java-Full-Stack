package controller;

import java.util.List;

import entity.Candidate;
import services.Service;

public class Controller {
	
	public List<Candidate> getAllCandidate(){
		System.out.println("we r in controller layer");
		Service service = new Service();
		List<Candidate> allcandidate = service.getAllCandidate();
		
		return null;
	}

}
