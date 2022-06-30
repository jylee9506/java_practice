package org.zerock;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lotto {

    public static void main(String[] args) {

        Random random = new Random();
        int[] values = new int[6];

        outer:
        for (int i = 0; i < 6; i++) {
            int value = random.nextInt(45) + 1;
            System.out.println(value);

            int count = i - 1;
            //count 값이 음수라면 검사할 필요가 없다.
            if(i == 0){
                values[i] = value;
                continue;
            }
            //중복검사
            //count = 2
            for(int j= 0; j <=count;j++){
                System.out.println("j:"+ j);
                if(values[j] == value) {
                    System.out.println("중복 발생:" +value);
                    i--;
                    continue outer;
                }
            }//검사 끝
            values[i] = value;

        }//end for

        System.out.println(Arrays.toString(values));

    }//end main
}