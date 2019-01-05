package com.assimilate.springbootDemo.Dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assimilate.springbootDemo.controller.ResponseConst;
import com.assimilate.springbootDemo.entity.Registration;

@Repository
public class EmployeeDaoImp implements EmployeeDao {

	@Autowired
	private SessionFactory sessionFactory;

	@Override
	public String addUser(Registration regi) {
		
		Session session = sessionFactory.getCurrentSession();
		session.save(regi);
		 return "success";
	}
}
