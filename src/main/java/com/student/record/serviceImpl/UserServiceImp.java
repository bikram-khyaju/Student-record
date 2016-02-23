package com.student.record.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.record.domain.User;
import com.student.record.repository.UserRepository;
import com.student.record.service.UserService;

@Service
@Transactional
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepository;

	@Override
	public List<User> allUser() {

		return userRepository.findAll();
	}

	@Override
	public void save(User user) {
		userRepository.save(user);
	}

	@Override
	public User chkUserAndPassword(String name, String password) {

		return userRepository.findByNameAndPassword(name, password);
	}

	@Override
	public void delete(long id) {
		userRepository.delete(id);

	}

	@Override
	public User findById(long id) {
		return userRepository.findById(id);
	}

}
