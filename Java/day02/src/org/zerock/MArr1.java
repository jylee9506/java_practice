package org.zerock;

import java.lang.reflect.Type;
import java.util.Arrays;

import static java.lang.Math.*;

public class MArr1 {
    public static void main(String[] args) {


//        int[][] arr = {{1, 2}, {3, 4}, {5, 6 ,7}};
//
//        System.out.println(arr[0]);
//
//        int[] first = arr[0];
//
//        System.out.pmrintln(first);
//
//        System.out.println(arr[0][0]);
//        System.out.println(first[0]);

        int[][] arr = {{1, 1}, {5, 5}, {10, 10}, {1, 10}};

        int[] target = {9, 9};

        double min = Double.MAX_VALUE;

        int[] minLocation = {};

        for (int[] tempArr :arr) {

            double distance =
                    sqrt(pow(tempArr[0] - target[0], 2) + pow(tempArr[1] - target[1], 2));

            if (distance < min) {
                min = distance;
                minLocation = tempArr;
            }



//      거리의 최솟값 구하기

//      필요한 것들
//      1. 9,9 의 좌표
//      2. target 과 각 tempArr 간의 거리를 계산한다.

        }

        System.out.println(Arrays.toString(minLocation));
        System.out.println(min);


    }
}
