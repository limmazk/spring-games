package io.github.limmazk.springboot2_essentials.repository;

import io.github.limmazk.springboot2_essentials.domain.Anime;

import java.util.List;

public interface AnimeRepository {
    List<Anime> listAll();
}
