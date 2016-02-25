package com.student.record.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.record.domain.Role;
import com.student.record.domain.User;
import com.student.record.repository.RoleRepositiory;
import com.student.record.repository.UserRepository;
import com.student.record.service.UserService;

@Service
@Transactional
public class UserServiceImp implements UserService {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepositiory roleRepository;

	@Override
	public List<User> allUser() {

		return userRepository.findAll();
	}

	@Override
	public void save(User user) {
		/*user.setEnabled(true);
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		user.setPassword(encoder.encode(user.getPassword()));
		
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleRepository.findByName("ROLE_USER"));
		user.setRoles(roles);*/
		
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
