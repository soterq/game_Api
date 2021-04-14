package com.soter.api.domain;

import com.soter.api.enums.ClassType;

import java.util.ArrayList;
import java.util.List;

public class Hero {

    private Long id;
    private ClassType classType;
    private String name;
    private String type;

    private int lvl;

    private double hp;
    private double mana;

    private double physicalAttack;
    private double magicAttack;

    private double physicalResist;
    private double magicResist;

    private double lifeSteal;
    private double speed;

    private List<Skill> activeSkills = new ArrayList<>();


}
