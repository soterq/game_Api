package com.soter.api.domain;

import java.util.ArrayList;
import java.util.List;

public class Team {
    private Long id;
    private String name;

    List<Hero> heroes = new ArrayList<>();
}
