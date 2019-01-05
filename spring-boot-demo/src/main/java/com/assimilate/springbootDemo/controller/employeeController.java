package com.assimilate.springbootDemo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
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
}
