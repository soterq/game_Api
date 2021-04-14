package com.soter.api.domain;

import com.soter.api.enums.AccessoriesType;

import java.util.ArrayList;
import java.util.List;

public class HeroAccessories {
    private Long id;
    private String name;
    private AccessoriesType accessoriesType;

    List<Attributes> attributes = new ArrayList<>();

}
