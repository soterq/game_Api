package com.soter.api.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GameObject {
    private Long id;
    private int placeInInventory;
    private String name;
}
