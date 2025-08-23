package com.javaprojeto.dslist.dto;

import com.javaprojeto.dslist.entities.GameList;

public class GameListDTO {
    Long id;
    String name;

    public GameListDTO() {
    }

    public GameListDTO(GameList entity) {
        id = entity.getId();
        name = entity.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
