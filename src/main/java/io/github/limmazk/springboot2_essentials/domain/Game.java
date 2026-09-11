package io.github.limmazk.springboot2_essentials.domain;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Game {

    private Long id;
    private String name;

}
