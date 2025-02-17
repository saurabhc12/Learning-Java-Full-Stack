package hibernateproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Clientsaveorupdate {

	public static void main(String[] args) {
        Configuration cfg = new Configuration();
		
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);
		
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		// it will help to insert data by beginning transactions
		Transaction tx = session.beginTransaction();
		
		Candidate candidate = new Candidate(2021, "Shiva", "BE", "PUNE", "MH", "Male",55);
		
		// use to save/insert if candidate is not in table and update details if any changes have done
		session.saveOrUpdate(candidate);
		tx.commit();
		session.close();

	}

}
