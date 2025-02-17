package hibernateproject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Clientselect {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);
		
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		
		//use to get single candidate 
		// to get all candidate use criteria 
		Candidate object = session.load(Candidate.class, 1);
		System.out.println(object);
		
	}

}
