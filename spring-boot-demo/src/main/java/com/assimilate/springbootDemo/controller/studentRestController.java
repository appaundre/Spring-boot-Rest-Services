package com.assimilate.springbootDemo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.assimilate.springbootDemo.model.Student;
import com.assimilate.springbootDemo.serviceImp.studentImp;

@RestController
@RequestMapping("/student")
public class studentRestController {

	@Autowired
	studentImp studentimp;

	List<Student> students = new ArrayList<>();

	@GetMapping("/getAll")
	public List<Student> getAll() {
		List<Student> stud = studentimp.getAllStudent();
		return stud;
	}

	@PostMapping("/save")
	public Student save(@RequestBody Student student) {
		Student stud = studentimp.saveStudent(student);
		return stud;
	}

	@PutMapping("/update")
	public String update(@RequestBody Student stud) {

		return studentimp.updateStudent(stud);
	}

	@DeleteMapping("delete/{stdId}")
	public String delete(@PathVariable Integer stdId) {

		return studentimp.deleteStudent(stdId);
	}
}
