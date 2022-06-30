package org.zerock.score;

import java.util.Arrays;

public class Ex2 {

    public static void main(String[] args) {


        Integer[] arr ={ 100, 32, 40, 52, 68, 86};

        int score = 50;

        Arrays.sort(arr, (a,b) -> {
            int gap1 = Math.abs(a - score);
            int gap2 = Math.abs(b - score);
            return gap1 - gap2;
        });

        System.out.println(Arrays.toString(arr));

    }
}
