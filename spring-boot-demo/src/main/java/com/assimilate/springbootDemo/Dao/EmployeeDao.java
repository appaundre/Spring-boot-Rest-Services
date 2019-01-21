package com.assimilate.springbootDemo.Dao;

import java.util.List;

import com.assimilate.springbootDemo.entity.Registration;

public interface EmployeeDao {

	String addUser(Registration regi);

	List<Registration> getEmployee();

	Registration getOneEmployee(int id);

	String updateEmployee(Registration emp, int id);

	String deleteEmployee(int id);

}
