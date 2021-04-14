package com.soter.api.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
public class Champion{

    private Long id;

    private String name;
    private String type;
    private boolean start;
//    private double hp;
//    private double mana;
//
//    private double physicalAttack;
//    private double magicAttack;
//
//    private double physicalResist;
//    private double magicResist;
//
//    private double lifeSteal;

    List<Hero> heroes = new ArrayList<>();

    List<GameObject> inventory = new ArrayList<>();
}
