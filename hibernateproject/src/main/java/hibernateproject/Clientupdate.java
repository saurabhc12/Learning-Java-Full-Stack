package hibernateproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Clientupdate {

	public static void main(String[] args) {
        Configuration cfg = new Configuration();
		
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);
		
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		// it will help to insert data by beginning transactions
		Transaction tx = session.beginTransaction();
		
		Candidate candidate = new Candidate(2020, "Diva", "BJP", "Nashik", "MH", "Female",55);
		// use to update candidate details
		session.update(candidate);
		tx.commit();
		session.close();

	}

}
