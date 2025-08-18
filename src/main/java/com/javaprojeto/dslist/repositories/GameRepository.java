package com.javaprojeto.dslist.repositories;

import com.javaprojeto.dslist.entities.Game;
import org.springframework.data.jpa.repository.JpaRepository;

public interface GameRepository extends JpaRepository<Game,Long> {

}
