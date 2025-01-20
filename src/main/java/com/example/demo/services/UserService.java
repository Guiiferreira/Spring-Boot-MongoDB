package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.domain.User;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {

	@Autowired //procura definição do objeto e vai instanciar 
	private UserRepository repo;
	
	public List<User> findAll() {
		return repo.findAll(); //retorna todos os objetos encontrados user
		
	}
}

