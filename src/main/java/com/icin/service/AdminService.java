package com.icin.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icin.dao.AdminRepo;
import com.icin.dao.MyRepo;
import com.icin.model.Admin;
import com.icin.model.User;

@Service
public class AdminService {
	@Autowired
com.icin.dao.MyRepo repo;
	
	@Autowired
	AdminRepo adminrepo;
	
	public List<User> getAllUsers(){
		return (List<User>) repo.findAll();
		
	}
	
	public User getUserById( long id) {
		return repo.findById(id);
		
	}
	
	public void deleteById(long id) {
		repo.delete(repo.findById(id));
		
	}

	public Admin addadmin(Admin admin) {
		// TODO Auto-generated method stub
		return adminrepo.save(admin);
	}	
	
}
