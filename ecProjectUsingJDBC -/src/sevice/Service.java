package sevice;

import java.util.List;

import dao.Dao;
import entity.Candidate;

public class Service {
	Dao dao=null;
	public List<Candidate> getAllCandidates(){
		System.out.println("we are in service layer");
		dao =new Dao();
		List<Candidate> allcandidate=dao.getAllCandidates();
		
		
		
		return allcandidate;
	}

}
