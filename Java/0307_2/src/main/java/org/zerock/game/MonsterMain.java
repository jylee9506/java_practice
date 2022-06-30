package org.zerock.game;

public class MonsterMain {

    public static void main(String[] args) {

        MonsterFactory factory = new MonsterFactory();
        MonsterUI ui = new MonsterUI(factory);

        ui.playGame();


    }
}
