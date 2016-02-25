package com.student.record.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.student.record.domain.Role;
import com.student.record.domain.User;
import com.student.record.repository.RoleRepositiory;
import com.student.record.repository.UserRepository;

@Transactional
@Service
public class InitService {
	
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private RoleRepositiory roleRepository;
	
	@PostConstruct
	public void init(){
/*		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepository.save(roleUser);
		
		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_ADMIN");
		roleRepository.save(roleAdmin);
		
		User userAdmin = new User();
		userAdmin.setEnabled(true);
		userAdmin.setName("admin");
		BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
		userAdmin.setPassword(encoder.encode("admin"));
		List<Role> roles = new ArrayList<Role>();
		roles.add(roleUser);
		roles.add(roleAdmin);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);*/
	}
	

}
