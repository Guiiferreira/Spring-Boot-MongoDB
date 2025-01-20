package com.example.demo.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.example.demo.domain.Post;
import com.example.demo.domain.User;
import com.example.demo.repository.PostRepository;
import com.example.demo.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private PostRepository postRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		sdf.setTimeZone(TimeZone.getTimeZone("GTM"));
		
		
		userRepository.deleteAll();
		postRepository.deleteAll();
		
		User marta = new User(null, "Marta Sebastiana", "marta@gmail.com");
		User gui = new User(null, "Guilherme Ferreira", "gui@gmail.com");
		User erik = new User(null, "Erik Ferreira", "erik@gmail.com");
		
	
		Post post1 = new Post(null, sdf.parse("21/03/2018"), "Partiu viagem", "Vou viajar para são paulo. Abraçpa!", marta);
		Post post2 = new Post(null, sdf.parse("23/03/2018") , "Bom dia", "Acordei feliz hoje!", marta);
		
		
		
		userRepository.saveAll(Arrays.asList(marta, gui, erik));
		postRepository.saveAll(Arrays.asList(post1, post2));
	}

}
