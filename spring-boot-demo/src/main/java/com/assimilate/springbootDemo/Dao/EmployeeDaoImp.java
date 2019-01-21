package com.assimilate.springbootDemo.Dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

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

	@Override
	public List<Registration> getEmployee() {
		Session session = sessionFactory.getCurrentSession();
		List<Registration> list = session.createCriteria(Registration.class).list();
		System.out.println(list);
		return list;
	}

	@Override
	public Registration getOneEmployee(int id) {
		Session session = sessionFactory.getCurrentSession();
		Registration list = session.get(Registration.class, id);
		return list;
	}

	@Override
	public String updateEmployee(Registration emp, int id) {
		Session session = sessionFactory.getCurrentSession();
		Registration regi = session.get(Registration.class, id);
		regi.setFirstName(emp.getFirstName());
		regi.setLastName(emp.getLastName());
		regi.setUsername(emp.getUsername());
		regi.setSalary(emp.getSalary());
		session.update(regi);
		return "Employee Updated successfully";

	}

	@Override
	public String deleteEmployee(int id) {
		Session session = sessionFactory.getCurrentSession();
		Registration empDelete = getOneEmployee(id);
		session.delete(empDelete);
		return "Employee Delete";
	}
}
