package com.luv2code.hibernate.demo.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;

public class PrimaryKeyDemo {

	public static void main(String[] args) {
		
		// create session factory
			SessionFactory factory = new Configuration()
									.configure("hibernate.cfg.xml")
									.addAnnotatedClass(Student.class)
									.buildSessionFactory();
			
			
			
			// create session
			Session session = factory.getCurrentSession();
			
			try {
				// create three student objects
				System.out.println("Creating new student objects...");
				Student tempStudent1= new Student("Biggie", "Smalls", "biggie@luv2code.com");
				Student tempStudent2 = new Student("Busta", "Bust", "busta@luv2code.com");
				Student tempStudent3 = new Student("Andre", "3000", "andre@luv2code.com");
				
				
				// start a transaction
				session.beginTransaction();
				
				
				// save the student object
				System.out.println("Saving the student...");
				session.save(tempStudent1);
				session.save(tempStudent2);
				session.save(tempStudent3);
				
				
				// commit the transaction
				session.getTransaction().commit();
				
				System.out.println("Done!");
			}
			finally {
				factory.close();
			}

	}

}
