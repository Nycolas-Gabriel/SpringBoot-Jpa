package com.aulaSpring.course.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.aulaSpring.course.entities.User;
import com.aulaSpring.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner {
	@Autowired
	private UserRepository userRepository;
/*injeção de dependencias no banco*/
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Jamilis Vitoria Pereira da Silva", "inesquecíveljamilis@gmail.com", "40028922",
				"lindademorrer");
		User u2 = new User(null, "Pedro Jhonsons", "pedro@gmail.com", "99999999",
				"123456@r");
		userRepository.saveAll(Arrays.asList(u1,u2));
	}

}
