package com.soter.api.domain;

import java.util.ArrayList;
import java.util.List;

public class Champion<T extends GameObject> {

    private Long id;

    private String name;
    private String type;

    private double hp;
    private double mana;

    private double physicalAttack;
    private double magicAttack;

    private double physicalResist;
    private double magicResist;

    private double lifeSteal;

    List<Hero> heroes = new ArrayList<>();

    List<T> inventory = new ArrayList<>();
}
