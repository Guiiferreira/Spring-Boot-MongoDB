package com.example.demo.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.domain.User;

@RestController // --- recurso rest --- 
@RequestMapping(value= "/users") // ---caminho do endpoint
public class UserResource {

	@RequestMapping(method= RequestMethod.GET)	
	public  ResponseEntity<List<User>> findAll(){
		User marta = new User("1", "Marta Sebastiana", "marta@gmail.com");
		User guilherme = new User("2", "Guilherme Ferreira", "gui@gmail.com");
		
		List<User> list = new ArrayList<>();
		list.addAll(Arrays.asList(marta, guilherme));
		return ResponseEntity.ok().body(list);
		
	}
}
//recurso rest