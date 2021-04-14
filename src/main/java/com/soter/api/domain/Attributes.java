package com.soter.api.domain;

import com.soter.api.enums.AttributesType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Attributes {
    private Long id;
    private String name;
    private AttributesType attributesType;
    private double points;
}
