package org.zerock;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Xsp2 {

    public static String RxpType(int choice){
        if (choice == 1) return "가위";
        else if(choice == 2) return "바위";
        else return "보";
    }

    public static void main(String[] args) {

        System.out.println("가위 바위 보");

        System.out.println("1 : 가위, 2 : 바위, 3 : 보");

        Scanner scanner = new Scanner(System.in);

        int comCnt = 0;
        int userCnt = 0;

        outer:
        while (true){

            int user = Integer.parseInt(scanner.nextLine());

            if (user > 3) {
                System.out.println("다시 고르시오!");
                continue;
            }

            Random random = new Random();

            int com = random.nextInt(3);

            String userCho = RxpType(user);
            String comCho = RxpType(com);

            System.out.println("user " + userCho);
            System.out.println("com " + comCho);


            int result = com - user;

            if (result < 0) {
                result = result + 3;
            }

            if (result == 1) {
                comCnt++;
                System.out.println("컴터 :" + comCnt);

            } else if (result == 2) {
                userCnt++;
                System.out.println("사람 :" + userCnt);

            } else if (result == 0) {
                System.out.println("무승부");
            }

            if (userCnt == 3 || comCnt == 3) {
                System.out.println("게임 끝");
                break outer;
            }
        }
    }
}
