package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Employee;

public class TestRetrieveData {
	public static void main(String[] args) {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		Session sess= sf.openSession();
		Employee e=sess.get(Employee.class,12);
		System.out.println(e);
		Transaction tr= sess.beginTransaction();
		tr.commit();
		sess.close();
		sf.close();
	    	
	}
}
