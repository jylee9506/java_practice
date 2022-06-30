package org.zerock.game;

import lombok.AllArgsConstructor;
import lombok.ToString;

@ToString
@AllArgsConstructor
public class Monster {

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    private String name;
    private int hp;



}
