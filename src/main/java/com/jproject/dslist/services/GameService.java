package com.jproject.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jproject.dslist.dto.GameMiniDTO;
import com.jproject.dslist.entities.Game;
import com.jproject.dslist.repositories.GameRepository;

@Service
public class GameService {

	@Autowired
	private GameRepository gameRepository;

	public List<GameMiniDTO> findAll() {
		List<Game> result = gameRepository.findAll();
		return result.stream().map(x -> new GameMiniDTO(x)).toList();
	}
}
