package org.zerock;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Lotto4 {

    public static void main(String[] args) {

        Random random = new Random();

        Scanner scanner = new Scanner(System.in);

        System.out.println("투입 금액을 적어주세요(1000, 2000, 3000, 4000, 5000)");

        int money = Integer.parseInt(scanner.nextLine()) / 1000;

        int[][] LottoPaper = new int[money][];

        for(int i = 0; i < money; i++){

            int[] values = new int[6];


            outer:
            for(int j = 0; j < 6; j++){
                int value = random.nextInt(45) + 1;

                for(int k= 0; k < j; k++){
                    if(values[k] == value){
                        System.out.println("중복 발생");
                        j--;
                        continue outer;
                    }
                }//end for
                values[j] = value;

            }//end for

            LottoPaper[i] = values;
            System.out.println(Arrays.toString(LottoPaper[i]));
        }//end for

    }//end main
}

//다차원 배열에 넣어보기