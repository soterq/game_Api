package com.soter.api.domain;

import com.soter.api.enums.ClassType;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
public class Consumable extends GameObject{
//    @Id
    private Long id;
    private boolean forHero;
    private int impactPoints;
    private ClassType classType;
}
