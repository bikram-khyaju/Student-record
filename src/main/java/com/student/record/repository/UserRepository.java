package com.student.record.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.student.record.domain.User;


@Repository
public interface UserRepository extends JpaRepository<User, Long>{

	@Query("")
	public User findByNameAndPassword(@Param("name") String name,@Param("password") String password);
	
	@Query("")
	public User findById(@Param("id") Long id);

	User findByName(String name);
}
