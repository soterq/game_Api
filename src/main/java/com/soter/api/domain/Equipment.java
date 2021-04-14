package com.soter.api.domain;

import com.soter.api.enums.ClassType;
import com.soter.api.enums.EquipmentType;

import java.util.ArrayList;
import java.util.List;

public class Equipment extends GameObject{
        private Long id;
        private String name;
        private EquipmentType equipmentType;
        private ClassType classType;
        List<Attributes> attributes = new ArrayList<>();

}
