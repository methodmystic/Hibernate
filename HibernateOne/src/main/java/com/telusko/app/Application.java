package com.telusko.app;

import org.hibernate.cfg.Configuration;
import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import com.telusko.model.Student;

public class Application {

	public static void main(String[] args) {
		
		Configuration cfg = new Configuration();
		
		cfg.configure();
		
	    SessionFactory sessionfactory = cfg.buildSessionFactory();
	    
	   Session session =  sessionfactory.openSession();
	   
	   Transaction transaction =   session.beginTransaction();
	   
	   Student student = new Student();
	   
	   student.setId(1);
	   student.setName("Pranav");
	   student.setCity("Pune");
	   
	   session.save(student);
	   
	   transaction.commit();
	   
	   session.close();
	   
	   
	   
	   
	   
		

	}

}
