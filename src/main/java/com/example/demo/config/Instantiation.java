package com.example.demo.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		
		userRepository.deleteAll();
		
		
		User marta = new User(null, "Marta Sebastiana", "marta@gmail.com");
		User gui = new User(null, "Guilherme Ferreira", "gui@gmail.com");
		User erik = new User(null, "Erik Ferreira", "erik@gmail.com");
		
		userRepository.saveAll(Arrays.asList(marta, gui, erik));
	}

}
