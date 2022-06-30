package org.zerock;

import java.util.Arrays;

public class Problem3 {
    public static void main(String[] args) {

        int[] arr = {1, 9, 4, 3, 7, 5, 2};

        int[] target = new int[arr.length];

        int min = Integer.MAX_VALUE; // 넣은 이유 질문 하기

        for(int i = 0; i < target.length; i++){

            if(arr[i] < min){

                target[i] = arr[arr.length - i - 1];
            }//end if

        }// end for
        System.out.println(Arrays.toString(target));

    }
}
