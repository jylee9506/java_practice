package org.zerock.save;

import java.util.Scanner;

public class PiggyUI {


    Scanner scanner;
    PiggySave piggySave;

    public PiggyUI(PiggySave piggySave) {
        this.piggySave = piggySave;
        this.scanner = new Scanner(System.in);
    }// 나 piggysave 없으면 UI 못만든다 이런 의미

    public void greeting(){

        outer:
        while(true){
            System.out.println("1. 입금, 2. 출금, 3. 종료");

            String oper = scanner.nextLine();

            switch (oper) {
                case "1":
                    this.input();
                    break;
                case "3":
                    break outer;

            }
        }// end while



    }// end greeting



    private void input(){

        System.out.println("얼마 입금 하실려고?");

        this.piggySave.deposit();

    }// end input

    private void output(){


    }// end output
}
