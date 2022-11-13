package com.aulaSpring.course.resource;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aulaSpring.course.entities.User;

//Controller
@RestController
@RequestMapping(value = "/users")
public class UserResource {
	@GetMapping
	public ResponseEntity<User> findAll() {
		User u = new User(1, "Jamilis Vitoria Pereira da Silva", "inesquecíveljamilis@gmail.com", "40028922",
				"lindademorrer");
		return ResponseEntity.ok().body(u);
	}

}
