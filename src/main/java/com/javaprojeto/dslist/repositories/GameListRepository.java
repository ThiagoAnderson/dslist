package com.javaprojeto.dslist.repositories;

import com.javaprojeto.dslist.entities.GameList;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
