package client;

import java.util.List;

import controller.Controller;
import entity.Candidate;

public class Client {
	public static void main(String[] args) {
		Controller controller = new Controller();
		List<Candidate> allcandidate = controller.getAllCandidate();
	}

}
