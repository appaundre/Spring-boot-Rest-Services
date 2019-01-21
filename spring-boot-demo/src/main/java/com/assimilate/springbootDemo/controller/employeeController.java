package com.assimilate.springbootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.springbootDemo.entity.Registration;
import com.assimilate.springbootDemo.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class employeeController {

	@Autowired
	private EmployeeService empSer;

	@PostMapping("/registration")
	public ResponseEntity<ResponseConst> registration(@RequestBody Registration regi) {
		System.out.println("in registration controller");
		ResponseConst msg = empSer.registration(regi);
		// return msg;
		return new ResponseEntity<ResponseConst>(msg, HttpStatus.OK);
	}

	@GetMapping("/getEmployee")
	public ResponseEntity<List<Registration>> getEmployee() {
		System.out.println("inside get employee");
		List<Registration> list = empSer.getEmployee();
		return new ResponseEntity<List<Registration>>(list, HttpStatus.FOUND);
	}

	@GetMapping("/getOneEmployee/{id}")
	public Registration getOneEmployee(@PathVariable int id) {
		Registration emp = empSer.getOneEmployee(id);
		return emp;
	}

	@PutMapping("/updateEmployee/{id}")
	public String updateEmployee(@PathVariable int id, @RequestBody Registration emp) {
		String msg = empSer.updateEmployee(emp, id);
		return msg;
	}

	@DeleteMapping("/deleteEmployee/{id}")
	public String deleteEmployee(@PathVariable int id) {
		String msg = empSer.deleteEmployee(id);
		return msg;
	}
}
