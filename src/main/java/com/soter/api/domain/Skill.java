package com.soter.api.domain;

import com.soter.api.enums.SkillDamageType;
import com.soter.api.enums.SkillType;

public class Skill {
    private Long id;
    private String name;
    private String type;
    private boolean isMassEffect;
    private int damage;
    private boolean isAttached;
    private Hero hero;
    private SkillType skillTypes;
    private SkillDamageType skillDamageType;

}
