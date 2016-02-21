package com.student.record.domain;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Role {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@ManyToMany
	private List<StudentLogin> users;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<StudentLogin> getUsers() {
		return users;
	}

	public void setUsers(List<StudentLogin> users) {
		this.users = users;
	}

}
