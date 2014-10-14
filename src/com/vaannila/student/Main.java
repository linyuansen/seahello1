package com.vaannila.student;

import java.util.HashSet;
import java.util.Set;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.rc.dl.bean.FItem;
import com.vaannila.util.HibernateUtil;

public class Main {

	public static void main(String[] args) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Transaction transaction = null;
		try {
			transaction = session.beginTransaction();
			
//			Set<Phone> phoneNumbers = new HashSet<Phone>();
//			phoneNumbers.add(new Phone("house","32354353"));
//			phoneNumbers.add(new Phone("mobile","9889343423"));
//			
//			Student student = new Student("Eswar", phoneNumbers);
//			session.save(student);
			FItem item = new FItem("fashion item one");
			session.save(item);
			
			transaction.commit();
		} catch (HibernateException e) {
			transaction.rollback();
			e.printStackTrace();
		} finally {
			session.close();
		}

	}

}