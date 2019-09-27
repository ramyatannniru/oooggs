package com.entity;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.entity.*;
import com.factory.CdFactory;


public class CdDetailsDaoimpl implements CdDao {
	
	private static Session session=null;
	{
		session=CdFactory.getMySession();
	}

	public void createcd( CdDetails CdDetails) {
		
		session.getTransaction().begin();
		session.persist(CdDetails);
		session.getTransaction().commit();
	}

}
