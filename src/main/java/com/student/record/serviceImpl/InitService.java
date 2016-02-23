package com.student.record.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
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
	private RoleRepositiory roleRepositiory;
	
	@PostConstruct
	public void init(){
		Role roleUser = new Role();
		roleUser.setName("ROLE_USER");
		roleRepositiory.save(roleUser);
		
		Role roleAdmin = new Role();
		roleAdmin.setName("ROLE_Admin");
		roleRepositiory.save(roleAdmin);
		
		User userAdmin = new User();
		userAdmin.setName("Admin");
		List<Role> roles = new ArrayList<>();
		roles.add(roleAdmin);	
		roles.add(roleUser);
		userAdmin.setRoles(roles);
		userRepository.save(userAdmin);
	}
	

}
