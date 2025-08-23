package com.javaprojeto.dslist.services;

import com.javaprojeto.dslist.dto.GameDTO;
import com.javaprojeto.dslist.dto.GameListDTO;
import com.javaprojeto.dslist.dto.GameMinDTO;
import com.javaprojeto.dslist.entities.Game;
import com.javaprojeto.dslist.projections.GameMinProjection;
import com.javaprojeto.dslist.repositories.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(GameMinDTO::new).toList();
    }

    @Transactional(readOnly = true)
    public GameDTO findById(Long id) {
        return new GameDTO(gameRepository.findById(id).get());
    }

    public List<GameMinDTO> findByList(Long listId) {
        List<GameMinProjection> result = gameRepository.searchByList(listId);
        return result.stream().map(GameMinDTO::new).toList();
    }

}
