package org.zerock;

import java.sql.SQLOutput;
import java.util.Random;
import java.util.Scanner;

public class Xsp {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int comCnt = 0;
        int userCnt = 0;
        boolean keep = true;

        while (keep){
            System.out.println("가위 : 0, 바위 : 1, 보 : 2");

            int user = Integer.parseInt(scanner.nextLine());

            System.out.println("user " + user);

            Random random = new Random();

            int com = random.nextInt(3);

            System.out.println("com " + com);

            int result = com - user;

            if (result < 0) {
                result = result + 3;
            }

            switch (result){
                case 1 :{
                  comCnt++;
                  System.out.println("컴퓨터 이긴 횟수 : " + comCnt);
                  break;
                } case 2 :{
                    userCnt++;
                    System.out.println("사람이 이긴 횟수 : " +userCnt);
                    break;
                } case 3 :{
                    System.out.println("무승부");
                    break;
                }
            }

            if(userCnt == 3){
                System.out.println("사람승");
                keep = false;

            }else if (comCnt == 3){
                System.out.println("컴터승");
                keep = false;
            }
        }
    }
}
