package com.Product_Consumer_Management_System;

import java.util.List;
import org.hibernate.Criteria;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.NativeQuery;

public class App {
//	private static final Restrictions Restrication = null;

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {

		SessionFactory sf = new Configuration().configure().addAnnotatedClass(Products.class)
				.addAnnotatedClass(Consumer.class).buildSessionFactory();
		Session session = sf.openSession();
		Transaction trans = session.beginTransaction();

		Query query = session.createQuery("from Products");
		List<Products> flist = query.list();
		for (Products f : flist) {
			System.out.println(f);
		}

//		NativeQuery nativeQuery =session.createNativeQuery("select * from Products");
//	    NativeQuery nativeQuery1 = session.createNativeQuery("INSERT INTO Products value (1,'apple',200)");
//		int executeUpdate = nativeQuery.executeUpdate();
//		System.out.println(executeUpdate);

		// To Fetch List of Products
//		Criteria criteria =session.createCriteria(Products.class);
//		List<Products> list= criteria.list();
//		for(Products f: list) {
//			System.out.println(f);
//		}

		trans.commit();
		session.close();
	}
}