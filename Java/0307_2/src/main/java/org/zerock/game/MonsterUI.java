package org.zerock.game;

import lombok.AllArgsConstructor;

@AllArgsConstructor

public class MonsterUI {


    MonsterFactory factory;

    public void playGame(){

        Monster monster = factory.makeSlim();

        System.out.println(monster);


    }
}
