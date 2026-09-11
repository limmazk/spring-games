package io.github.limmazk.springboot2_essentials.controller;

import io.github.limmazk.springboot2_essentials.domain.Game;
import io.github.limmazk.springboot2_essentials.service.GameService;
import io.github.limmazk.springboot2_essentials.util.DateUtil;
import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("anime")
@Log4j2
@RequiredArgsConstructor
public class GameController {
    private final DateUtil dateUtil;
    private final GameService gameService;

    @GetMapping
    public List<Game> list(){
        log.info(dateUtil.formatLocalDateTimeToDatabaseStyle(LocalDateTime.now()));
        return gameService.listAll();
    }

}