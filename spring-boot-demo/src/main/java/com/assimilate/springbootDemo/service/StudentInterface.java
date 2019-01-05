package com.assimilate.springbootDemo.service;

import java.util.List;

import com.assimilate.springbootDemo.model.Student;

public interface StudentInterface {

	public List<Student> getAllStudent();

	public Student saveStudent(Student stud);

	public String updateStudent(Student stud);

	public String deleteStudent(Integer stdId);
}
