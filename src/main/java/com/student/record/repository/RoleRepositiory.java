package com.student.record.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.student.record.domain.Role;

@Repository
public interface RoleRepositiory  extends JpaRepository<Role, Long>{

	Role findByName(String name);

}
