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

public class Clientprojection2 {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		
		cfg.configure();
		cfg.addAnnotatedClass(Candidate.class);
		
		SessionFactory factory = cfg.buildSessionFactory();

		Session session = factory.openSession();
		
		//select * from candidate
		Criteria criteria = session.createCriteria(Candidate.class);  // (get all candidates)
		
	    Projection projection1 = Projections.property("name");
	    
	    //select name form candidate
	    criteria.setProjection(projection1);
	    
		criteria.add(Restrictions.gt("age",50));
												
		List<String> nameofcandidates = criteria.list();
		
		for (String name : nameofcandidates) { 	
			System.out.println(name);
			System.out.println("----------");
			
		}
		
	}

}
