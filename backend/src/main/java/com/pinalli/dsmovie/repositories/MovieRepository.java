package com.pinalli.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pinalli.dsmovie.entities.Movie;

//objeto responsável por acessar movie(filmes) no BD
public interface MovieRepository extends JpaRepository<Movie, Long>{

}
