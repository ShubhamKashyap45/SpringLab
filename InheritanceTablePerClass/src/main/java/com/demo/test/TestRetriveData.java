package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Customer;
import com.demo.beans.Employee;

public class TestRetriveData {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SessionFactory sf = new Configuration().configure().buildSessionFactory();

		Session sess = sf.openSession();
		Transaction tr = sess.beginTransaction();
		Employee e1 = sess.get(Employee.class, 121);
		System.out.println(e1);
		Customer c1 = sess.get(Customer.class, 131);
		System.out.println(c1);
//		System.out.println(c2);
		tr.commit();
		sess.close();
		sf.close();

	}

}
