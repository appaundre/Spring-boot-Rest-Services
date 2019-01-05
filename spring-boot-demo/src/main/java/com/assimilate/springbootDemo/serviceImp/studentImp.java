package com.assimilate.springbootDemo.serviceImp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.assimilate.springbootDemo.model.Student;
import com.assimilate.springbootDemo.service.StudentInterface;

@Repository
public class studentImp implements StudentInterface {

	// @Autowired
	// Student student;
	private List<Student> students = new ArrayList<>();

	public List<Student> getAllStudent() {

		System.out.println("inside student imp");
		Student stud = new Student();
		stud.setId(2);
		stud.setName("appa");
		stud.setMobNo(9890);
		stud.setAddress("pune");
		return students;
	}

	public Student saveStudent(Student stud) {
		students.add(stud);
		return stud;
	}

	@Override
	public String updateStudent(Student stud) {
		String result = null;

		for (Student student : students) {
			if (stud.getId() == (student.getId())) {
				student.setAddress(stud.getAddress());
				student.setName(stud.getName());
				student.setMobNo(stud.getMobNo());
				result = "student update successfully";
				return result;
			} else {
				result = "failed to save";
			}
		}
		return result;
	}

	@Override
	public String deleteStudent(Integer stdId) {
		String result = null;
		System.out.println("student id:" + stdId);
		for (Student student : students) {
			if (stdId == (student.getId())) {
				students.remove(student);
				result = "student remove successfully";
				return result;
			} else {
				result = "student not found";
			}

		}
		return "student not found";

	}

}
