package com.aulaSpring.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.aulaSpring.course.entities.User;
import com.aulaSpring.course.repositories.UserRepository;
@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	
     public List<User> findAll (){
    	 return repository.findAll();
     }
     public User findById(Integer id) {
    	 Optional<User> obj = repository.findById(id);
    	 return obj.get();
    			
     }
}
