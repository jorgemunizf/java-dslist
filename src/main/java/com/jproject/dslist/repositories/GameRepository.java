package com.jproject.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jproject.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
