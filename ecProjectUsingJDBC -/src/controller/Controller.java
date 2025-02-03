package controller;

import java.util.List;

import entity.Candidate;
import sevice.Service;

public class Controller {
	Service service = null;
	public List<Candidate> getAllCandidate (){
		System.out.println("we are in contoller layer");
		service =new Service();
		List<Candidate> allcandidate = service.getAllCandidates();

		return allcandidate;
	}

}
