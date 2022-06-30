package org.zerock;

import java.util.Scanner;

public class Degree {

    public static void main (String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("몇시 몇분 인지 순서대로 입력하시오");

        int hour = scanner.nextInt();
        int minutes = scanner.nextInt();

        // 시계 각도 구하기

        // 주어진 것
        // 1. 원은 360도 12시간, 60분 => 1시간당 30도, 1분당 6도
        // 2. 입력 받은 시간

        // 해야할 것
        // 1. 가중치 구하기 => 시침과 분침은 같이 움직인다
        // 2. 나온 값이 음수, 양수 경우 고려

        float hd = (360 / 12) * hour;
        int md = (360 / 60) * minutes;
        float weight = (float) (0.5 * minutes);
        float degree = hd + weight - md;

        if (degree < 0) {
            if (hd + weight >= 180 || md >= 180) {
                degree = 360 -(md - (hd + weight));
                System.out.println("둘 사이의 작은 각도는? " + degree);
            } else {
                System.out.println("둘 사이의 작은 각도는? " + degree);
            }
        }else {
            System.out.println("둘 사이의 작은 각도는? " + degree);
        }

    }
}
