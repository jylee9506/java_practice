package org.zerock;

import java.util.Arrays;

import static java.lang.Math.*;

public class MArr2 {

    public static void main(String[] args) {

        int[][] arr = {{1, 1}, {5, 5}, {10, 10}, {1, 10}};

        int[] target = {9, 9};

        double min = Double.MAX_VALUE;
        double max = Double.MIN_VALUE;

        int[] minLocation = null;
        int[] maxLocation = null;

        for (int i = 0; i < arr.length; i++) {

            int[] tempArr = arr[i];

            double distance =
                    sqrt(pow(tempArr[0] - target[0], 2) + pow(tempArr[1] - target[1], 2));

            if (distance < min) {
                min = distance;
                minLocation = tempArr;
            }

            if (distance > max) {
                max = distance;
                maxLocation = tempArr;
            }

        }//end for
        System.out.println("최소길이 좌표는 : " + Arrays.toString(minLocation));
        System.out.println("최소길이는 : " + min);

        System.out.println("최장길이 좌표는 : " + Arrays.toString(maxLocation));
        System.out.println("최장길이는 : " + max);

    }

}
// 최대 길이 좌표, 길이 추가