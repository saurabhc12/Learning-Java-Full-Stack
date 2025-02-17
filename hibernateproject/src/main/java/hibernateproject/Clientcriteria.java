package hibernateproject;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Clientcriteria {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);
		
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		
		//select * from candidate
		Criteria criteria = session.createCriteria(Candidate.class);  // (get all candidates)
		
		//gt- greater than, eq- equals to, ge- greater than or equals to 
		criteria.add(Restrictions.gt("age",50));
		criteria.add(Restrictions.like("partyname", "BJP"));
												
		List<Candidate> listofcandidates = criteria.list();
		
		for (Candidate candidate : listofcandidates) { 	
//			System.out.println(candidate.getAge());    //to get only age
			System.out.println(candidate);
			
		}
		
	}

}
