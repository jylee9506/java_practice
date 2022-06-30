package org.zerock;

import java.util.Scanner;

public class StringSwitch {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println(" 혈액형 뭐에요?");

        String type = scanner.nextLine();

        switch (type){

            case "A" :
                System.out.println("소심");
                break;
            case "B" :
                System.out.println("괴짜");
                break;
            case "O" :
                System.out.println("4차원");
                break;
            case "AB":
                System.out.println("천재 or 또라이");
                break;
        }

    }
}
