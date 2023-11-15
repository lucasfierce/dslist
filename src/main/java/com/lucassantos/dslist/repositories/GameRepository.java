package com.lucassantos.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucassantos.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {
    
}
