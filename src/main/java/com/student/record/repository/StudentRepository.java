package com.student.record.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.student.record.domain.Student;
import com.student.record.domain.User;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {

}
