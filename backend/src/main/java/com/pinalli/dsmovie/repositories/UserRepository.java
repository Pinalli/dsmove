package com.pinalli.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pinalli.dsmovie.entities.User;

//objeto responsável por acessar user(usuario) no BD
public interface UserRepository extends JpaRepository<User, Long>{
	
	User findByEmail(String email) ;

}
