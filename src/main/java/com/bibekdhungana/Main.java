package com.bibekdhungana;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.bibekdhungana.entity.UserLoginDetails;

public class Main {

	public static void main(String[] args) {
		System.out.println("Project Started");
		
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction transaction = session.beginTransaction();
		
		UserLoginDetails user = new UserLoginDetails();
		user.setId(1);
		user.setPassword("Lubbock");
		user.setUsername("bd4557");
		
		session.save(user);
		transaction.commit();
		
		
		System.out.println("Operation Sucessful");
	}

}
