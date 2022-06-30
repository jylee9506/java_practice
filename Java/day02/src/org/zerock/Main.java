package org.zerock;

public class Main {

    public static void main(String[] args) {
//        int[] arr = {1, 2, 3, 4, 5};

//        int[] arr = new int[5];
//        arr[1] = 2;
//        arr[5] = 10; 배열의 범위를 벗어난 입력

        int[] arr = {14, 18, 85, 9, 45, 74};

//        for(int i = 0; i < arr.length; i++){}

        int min = arr[0];
        int max = arr[0];

        // var = arr[i]
        for (int val:arr) {
            System.out.println(val);

            if(val < min){
                min = val;
            }

            if(val > max){
                max = val;
            }
        }

        System.out.println("-------------------");
        System.out.println(min);
        System.out.println(max);
//        for each 성능은 for each가 좋음 but 전체 돌릴 때만 쓰임


        System.out.println("-------------------");


    }
}
