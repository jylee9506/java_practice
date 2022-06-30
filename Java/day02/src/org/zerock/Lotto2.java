package org.zerock;

import java.util.Arrays;
import java.util.Random;

public class Lotto2 {

    public static void main(String[] args) {

        Random random = new Random();
        int[] values = new int[6];

        for (int i = 0; i < 6; i++) {
            int value = random.nextInt(45) + 1;
            System.out.println(value);

            //배열의 내용물들을 확인
            boolean duplicated = false;

            for(int j = 0; j < values.length; j++){
                if(values[j] == 0){
                    break;
                }
                if(values[j] == value){
                    System.out.println("중복된 숫자");
                    duplicated = true;
                    break;
                }
            }

            if(duplicated){
                i--;
                continue;
            }
            values[i] = value;
        }//end for

        System.out.println(Arrays.toString(values));

    }//end main
}