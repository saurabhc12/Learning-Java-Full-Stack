package client;

import dao.Dao;

public class jdbcclient {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Dao dao = new Dao();
		dao.getAllCandidates();
	}

}
