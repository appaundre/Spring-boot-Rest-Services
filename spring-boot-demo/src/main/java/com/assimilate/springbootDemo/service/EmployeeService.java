package com.assimilate.springbootDemo.service;

import java.util.List;

import com.assimilate.springbootDemo.controller.ResponseConst;
import com.assimilate.springbootDemo.entity.Registration;

public interface EmployeeService {


	ResponseConst registration(Registration regi);

	List<Registration> getEmployee();

	Registration getOneEmployee(int id);

	String updateEmployee(Registration emp, int id);

	String deleteEmployee(int id);

}
