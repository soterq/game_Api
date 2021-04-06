package com.soter.api.domain;

import java.util.ArrayList;
import java.util.List;

public class Hero {

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

    private List<Skill> activeSkills = new ArrayList<>();
    

}
