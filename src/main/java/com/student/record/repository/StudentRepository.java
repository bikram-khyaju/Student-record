package com.student.record.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.student.record.domain.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {

	
}