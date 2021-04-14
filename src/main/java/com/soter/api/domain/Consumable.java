package com.soter.api.domain;

import javax.persistence.Entity;
import javax.persistence.Id;

//@Entity
public class Consumable extends GameObject{
//    @Id
    private Long id;
    private boolean forHero;
    private int impactPoints;

}
