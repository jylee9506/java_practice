package org.zerock;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("x, y, z 를 순서대로 입력하시오");

        int x = scanner.nextInt();
        int y = scanner.nextInt();
        int z = scanner.nextInt();

        // 주어진 것
        // 1. 가로(x), 세로(y), 높이(z) 길이 11cm, 10cm, 7cm
        // 2. m² 가격 1000원

        // 해야할 것
        // 1. 단위 통일
        // 2. 정육면체 겉면적 구하기

        int price = 1000;
        double squrSurface = (x * y) * 2 + (x * 2 + y * 2) * z;
        double result = (squrSurface/100) * price;

        System.out.println(squrSurface);
        System.out.println(result);
    }

}
