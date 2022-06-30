package org.zerock;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

public class Lotto3 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] values = new int[6];

        outer:
        for (int i = 0; i < 6; i++) {
            int value = random.nextInt(45) + 1;
            System.out.println(value);

            for(int j= 0; j < i -1; j++){
                if(values[j] == value){
                    System.out.println("중복 발생");
                    i--;
                    continue outer;
                }
            }
            values[i] = value;

        }//end for

        System.out.println(Arrays.toString(values));

    }//end main
}