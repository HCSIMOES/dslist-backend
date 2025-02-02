package com.devsuperiorcurso.dslist.dto;

import com.devsuperiorcurso.dslist.entities.GameList;

public class GameListDTO {

    //DTO (Data Transfer Object)
    private Long id;
    private String name;

    public GameListDTO(GameList entity){
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId(){
        return id;
    }

    public String getName(){
        return name;
    }

}