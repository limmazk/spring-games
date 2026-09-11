package io.github.limmazk.springboot2_essentials.repository;

import io.github.limmazk.springboot2_essentials.domain.Game;

import java.util.List;

public interface GameRepository {
    List<Game> listAll();
}
