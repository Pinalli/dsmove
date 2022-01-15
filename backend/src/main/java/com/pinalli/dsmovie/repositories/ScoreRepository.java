package com.pinalli.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pinalli.dsmovie.entities.Score;
import com.pinalli.dsmovie.entities.ScorePK;


public interface ScoreRepository extends JpaRepository<Score, ScorePK>{

}
