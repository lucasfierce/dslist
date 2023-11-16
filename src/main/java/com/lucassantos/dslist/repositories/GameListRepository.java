package com.lucassantos.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.lucassantos.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long>{
    
}
