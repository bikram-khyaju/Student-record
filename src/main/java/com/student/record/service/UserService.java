package com.student.record.service;

import java.util.List;

import com.student.record.domain.Student;
import com.student.record.domain.User;

public interface UserService {

	public List<User> allUser();

	public void save(User user);

	public User chkUserAndPassword(String name, String password);

	public void delete(long id);

	public User findById(long id);

	
}
