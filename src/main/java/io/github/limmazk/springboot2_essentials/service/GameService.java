package io.github.limmazk.springboot2_essentials.service;

import io.github.limmazk.springboot2_essentials.domain.Game;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GameService {

    public List<Game> listAll(){
        return  List.of(new Game(1L, "The Last of Us"), new Game(2L,"Red Dead Remdeption 2"));
    }
}
