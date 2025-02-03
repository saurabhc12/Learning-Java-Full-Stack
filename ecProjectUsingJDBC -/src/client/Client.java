package client;

import java.util.List;

import controller.Controller;
import entity.Candidate;

public class Client {
	public static void main(String[] args) {
		System.out.println("we are in client layer");
		
		Controller controller = null;
		controller =new Controller();
		List<Candidate> allcandidate = controller.getAllCandidate();
		
		System.out.println("we are bake in client");
		
		System.out.println(allcandidate);
	}

}
