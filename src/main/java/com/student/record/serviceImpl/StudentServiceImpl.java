package com.student.record.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.record.domain.Student;
import com.student.record.repository.StudentRepository;
import com.student.record.service.StudentService;

@Service
@Transactional
public class StudentServiceImpl implements StudentService {

	@Autowired
	StudentRepository studentRepository;
	
	public void add(Student student) {
		studentRepository.save(student);

	}

	@Override
	public List<Student> allStudentList() {
		return  (List<Student>) studentRepository.findAll();
	}

	@Override
	public void delete(long id) {
		//Integer ids = (int)id;
		studentRepository.delete(id);
	}

	@Override
	public Student edit(long id) {
		return studentRepository.findOne(id);
	}

	


	
	


}
