package com.demo.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.demo.beans.Customer;
import com.demo.beans.Employee;

public class TestMappedSuperClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf=new Configuration().configure().buildSessionFactory();
		Employee e=new Employee(1212,"xxxyy","333366","hr","mgr");
		Customer c=new Customer(1314,"yyyxx","444477","baner","Rajesh");
		//Person p=new Person(141,"zzz","3333");
		Session sess=sf.openSession();
		Transaction tr=sess.beginTransaction();
		sess.save(e);
		sess.save(c);
		
		tr.commit();
		sess.close();
		sf.close();
	}

}
