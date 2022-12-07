package com.luv2code.hibernate.demo.app;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.luv2code.hibernate.demo.entity.Student;



public class ReadStudentDemo {

	public static void main(String[] args) {
	
		// create session factory
		SessionFactory factory = new Configuration()
								.configure("hibernate.cfg.xml")
								.addAnnotatedClass(Student.class)
								.buildSessionFactory();
		
		
		
		// create session
		Session session = factory.getCurrentSession();
		
		try {
			
			// start a transaction
			session.beginTransaction();
			
			// query students
			List<Student> theStudents = session.createQuery("from Student").list();
			
			// display the students
			displayStudents(theStudents);
			
			// query students: lastName='3000'
			theStudents = session.createQuery("from Student s where s.lastName='3000'").list();
			
			// display filtered students
			System.out.println("\n\nStudents who have last name of 3000");
			displayStudents(theStudents);
			
			
			// query students: lastName='3000' OR firstName='Paul'
			theStudents = 
					session.createQuery("from Student s where s.lastName='3000' OR firstName='Paul'").list();
			
			System.out.println("\n\nStudents who have last name of 3000 OR fist name Paul: ");
			
			displayStudents(theStudents);
			
			// query students where email LIKE '%luv2code.com'
			theStudents = session.createQuery("from Student s where"
					+ " s.email LIKE '%gmail.com'").list();
			
			System.out.println("\n\nStudents whose email ends with gmail.com");
			displayStudents(theStudents);
			
			// commit the transaction
			session.getTransaction().commit();
				
			System.out.println("Done!");
		}
		finally {
			factory.close();
		}
		
		
		
	}

	private static void displayStudents(List<Student> theStudents) {
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);	
		}
	}

}
