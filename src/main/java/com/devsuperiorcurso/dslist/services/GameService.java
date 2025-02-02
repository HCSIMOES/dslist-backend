package com.devsuperiorcurso.dslist.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.devsuperiorcurso.dslist.dto.GameDTO;
import com.devsuperiorcurso.dslist.dto.GameMinDTO;
import com.devsuperiorcurso.dslist.entities.Game;
import com.devsuperiorcurso.dslist.repositories.GameRepository;


@Service
public class GameService {

    @Autowired
    private GameRepository gameRepository;

    //@Transactional é um anotation que garante a operação no banco de dados
    @Transactional(readOnly = true)
    //O argumento readOnly impossibilita inserção manual de dados no banco
    public GameDTO findById(Long id){
        Game result = gameRepository.findById(id).get();
        return new GameDTO(result);
    
    }
    @Transactional(readOnly = true)
    public List<GameMinDTO> findAll() {
        List<Game> result = gameRepository.findAll();
        return result.stream().map(x -> new GameMinDTO(x)).toList();

    }

    public List<GameMinDTO> findByGameList(Long listId) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

}
