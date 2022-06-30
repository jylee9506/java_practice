package org.zerock;

public class CalcTest {

    public static void main(String[] args) {

        int x1 = 1;
        int y1 = 2;

        int x2 = 10;
        int y2 = 10;

        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println(distance);


    }

}
