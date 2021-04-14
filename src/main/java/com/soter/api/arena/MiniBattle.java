package com.soter.api.arena;

import com.soter.api.domain.Champion;
import com.soter.api.domain.Hero;

import java.util.List;

public class MiniBattle {

    public Champion battle(Champion attacker, Champion defender){


        return null;
    }


    public void start(Champion attacker, Champion defender){
        List<Hero> attackerHero = attacker.getHeroes();
        List<Hero> defendHero = defender.getHeroes();

        for (int i =0 ; i<4;i++){
            double aSpeedTeam=0;
            double dSpeedTeam =0;
            aSpeedTeam += attackerHero.get(i).getSpeed();
            dSpeedTeam += defendHero.get(i).getSpeed();
            if(aSpeedTeam>dSpeedTeam){
                attacker.setStart(true);
            }else if(aSpeedTeam<dSpeedTeam){
                defender.setStart(true);
            }else {
                attacker.setStart(true);
            }
        }


    }
}
