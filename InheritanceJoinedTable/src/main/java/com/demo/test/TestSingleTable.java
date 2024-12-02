package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Customer;
import com.demo.beans.Employee;

public class TestSingleTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Employee e = new Employee(12,"xxx","3333","hr","mgr");
		Customer c= new Customer(13,"yyy","222222","pune","aaaaaaa");
		Session sess1 = sf.openSession();
		Transaction tr = sess1.beginTransaction();
		sess1.save(e);
		sess1.save(c);
		tr.commit();
		sess1.close();
		sf.close();
		
	}

}
