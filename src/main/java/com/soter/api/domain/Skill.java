package com.soter.api.domain;

import com.soter.api.enums.ClassType;
import com.soter.api.enums.SkillDamageType;
import com.soter.api.enums.SkillType;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Skill {
    private Long id;
    private String name;
    private ClassType classType;
    private int impact;
    private int lvl;
    private boolean isMassEffect;
    private int damage;
    private boolean isAttached;
    private Hero hero;
    private SkillType skillTypes;
    private SkillDamageType skillDamageType;

}
