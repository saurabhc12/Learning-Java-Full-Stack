package hibernatesStudentProject;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class ClientMapping1to1 {
public static void main(String[] args) {
        
		Configuration cfg = new Configuration();
		
		cfg.configure();
		cfg.addAnnotatedClass(Student.class);
		cfg.addAnnotatedClass(Address.class);
		cfg.addAnnotatedClass(Orders.class);
		
		SessionFactory factory = cfg.buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Address add=new Address (101,"Pune","MH",401);
		
		session.save(add);
		Student s1 =new Student(1,"Jay",88);
		
		session.save(s1);
		
		Orders o1 = new Orders("poha",25);
		Orders o2 = new Orders("Upma",40);
		Orders o3 = new Orders("poha",10);
		List<Orders> l1=new ArrayList<Orders>();
		l1.add(o1);
		l1.add(o2);
		l1.add(o3);
		
		session.save(o1);
		session.save(o2);
		session.save(o3);
        s1.setAddress(add);

		s1.setOrder(l1);
		
		tx.commit();
		session.close();
 
	}

}
