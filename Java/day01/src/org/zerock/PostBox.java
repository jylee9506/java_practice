package org.zerock;

import java.util.Scanner;

public class PostBox {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.println("중량(kg)을 입력하시오");
        double weight = scanner.nextDouble();

        System.out.println("1 - 동일권 , 2 - 타권, 3 - 제주권 고르시오");
        int num = scanner.nextInt();

        // 주어진 것
        // 1. 입력 받은 중량
        // 2. 1번 - 동일권 , 2번 - 타권, 3번 - 제주권

        // 해결해야할 것
        // 1. 중량 입력시 g 과 kg 을 구별을 하는 로직
        // 2. 동일권, 타권, 제주권 가격 객체 생성?!

        System.out.println(weight + " kg");

        if (weight >= 20) {
            switch (num) {
                case 1: {
                    System.out.println("10,000원");
                    break;
                }
                case 2: {
                    System.out.println("11,000원");
                    break;
                }
                case 3: {
                    System.out.println("13,000원");
                    break;
                }
            }
        } else if (weight >= 15) {
            switch (num) {
                case 1: {
                    System.out.println("8,800원");
                    break;
                }
                case 2: {
                    System.out.println("9,800원");
                    break;
                }
                case 3: {
                    System.out.println("11,800원");
                    break;
                }
            }
        } else if (weight >= 10) {
            switch (num) {
                case 1: {
                    System.out.println("7,800원");
                    break;
                }
                case 2: {
                    System.out.println("8,800원");
                    break;
                }
                case 3: {
                    System.out.println("11,800원");
                    break;
                }
            }
        } else if (weight >= 7) {
            switch (num) {
                case 1: {
                    System.out.println("7,000원");
                    break;
                }
                case 2: {
                    System.out.println("8,000원");
                    break;
                }
                case 3: {
                    System.out.println("10,500원");
                    break;
                }
            }
        } else if (weight >= 5) {
            switch (num) {
                case 1: {
                    System.out.println("6,500원");
                    break;
                }
                case 2: {
                    System.out.println("7,500원");
                    break;
                }
                case 3: {
                    System.out.println("10,500원");
                    break;
                }
            }
        } else if (weight >= 4) {
            switch (num) {
                case 1: {
                    System.out.println("5,400원");
                    break;
                }
                case 2: {
                    System.out.println("5,900원");
                    break;
                }
                case 3: {
                    System.out.println("8,900원");
                    break;
                }
            }
        } else if (weight >= 3) {
            switch (num) {
                case 1: {
                    System.out.println("5,000원");
                    break;
                }
                case 2: {
                    System.out.println("5,500원");
                    break;
                }
                case 3: {
                    System.out.println("8,500원");
                    break;
                }
            }
        } else if (weight >= 2) {
            switch (num) {
                case 1: {
                    System.out.println("4,900원");
                    break;
                }
                case 2: {
                    System.out.println("5,400원");
                    break;
                }
                case 3: {
                    System.out.println("8,400원");
                    break;
                }
            }
        } else if (weight >= 1.5) {
            switch (num) {
                case 1: {
                    System.out.println("4,600원");
                    break;
                }
                case 2: {
                    System.out.println("5,100원");
                    break;
                }
                case 3: {
                    System.out.println("8,100원");
                    break;
                }
            }
        } else if (weight >= 1) {
            switch (num) {
                case 1: {
                    System.out.println("4,300원");
                    break;
                }
                case 2: {
                    System.out.println("4,800원");
                    break;
                }
                case 3: {
                    System.out.println("7,800원");
                    break;
                }
            }
        } else if (weight >= 0.9) {
            switch (num) {
                case 1: {
                    System.out.println("4,000원");
                    break;
                }
                case 2: {
                    System.out.println("4,500원");
                    break;
                }
                case 3: {
                    System.out.println("7,500원");
                    break;
                }
            }
        } else if (weight >= 0.8) {
            switch (num) {
                case 1: {
                    System.out.println("3,900원");
                    break;
                }
                case 2: {
                    System.out.println("4,400원");
                    break;
                }
                case 3: {
                    System.out.println("7,400원");
                    break;
                }
            }
        } else if (weight >= 0.7) {
            switch (num) {
                case 1: {
                    System.out.println("3,800원");
                    break;
                }
                case 2: {
                    System.out.println("4,300원");
                    break;
                }
                case 3: {
                    System.out.println("7,300원");
                    break;
                }
            }
        } else if (weight >= 0.6) {
            switch (num) {
                case 1: {
                    System.out.println("3,700원");
                    break;
                }
                case 2: {
                    System.out.println("4,200원");
                    break;
                }
                case 3: {
                    System.out.println("7,200원");
                    break;
                }
            }
        } else {
            System.out.println("just free");
        }

    }
}