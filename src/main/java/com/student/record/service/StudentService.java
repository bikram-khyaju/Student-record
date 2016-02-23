package com.student.record.service;

import java.util.List;


import com.student.record.domain.Student;


public interface StudentService {
	public void add(Student student);
	public void delete(long id);
	public List<Student> allStudentList();
	public Student edit(long id);
	

}
