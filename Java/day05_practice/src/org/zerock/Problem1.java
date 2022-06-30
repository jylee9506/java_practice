package org.zerock;

import java.util.Scanner;

public class Problem1 {

    public static void main(String[] args) {
        String[] arr = {"A", "B", "C", "D", "E"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("A, B, C, D, E 중에 하나를 입력하시오");

        String str = scanner.nextLine();

        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals(str)) {
                System.out.println(i);
            }
        }

    }
}
// int idx = -1;
//  for(int i = 0; i < arr.length; i++){
//        if(arr[i].equals(str)) {
//        idx = i;
//        }
//       System.out.println(idx);

// 이런식으로 변수 선언을 통해 하는 이유는 이 후에 저 변수를 통해서 무엇인가 할 수가 있다
// 그냥 i 이런식으로 하면 답은 맞지만 다시 사용이 불가능