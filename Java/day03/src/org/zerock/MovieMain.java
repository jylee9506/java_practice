package org.zerock;

import java.util.Scanner;

public class MovieMain {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Movie m1 = new Movie("노팅힐" ,11,2);
        Movie m2 = new Movie("노트북" ,13,1);
        Movie m3 = new Movie("내 머리속의 지우개" ,9,1);
        Movie m4 = new Movie("조폭마누라" ,2,10);
        Movie m5 = new Movie("아이언맨" ,1,6);
        Movie m6 = new Movie("배트맨" ,3,5);

        Movie[] arr = new Movie[6];

        arr[0] = m1;
        arr[1] = m2;
        arr[2] = m3;

        arr[3] = m4;
        arr[4] = m5;
        arr[5] = m6;


        System.out.println("영화의 kiss, kick 을 입력해주세요(1 ~ 99 사이)");


        int[] target = new int [2];

        target[0] = Integer.parseInt(scanner.nextLine());
        target[1] = Integer.parseInt(scanner.nextLine());


        double min = Double.MAX_VALUE;
        String minMovie = null;

        for (Movie m : arr) {

            double distance = Math.sqrt(Math.pow(m.kissNum - target[0],2) +
                                        Math.pow(m.kickNum - target[1],2));


//            System.out.println(m.movieName+ " : " + distance);

            if(distance < min){
                min = distance;
                minMovie = m.movieName;
            }// end if

        }// end for


        if(target[0] == target[1]) {

            System.out.println("액션반 로맨스반");

            } else if(target[0] > target[1]){

            System.out.println("이 영화는 로맨스 장르입니다");
            System.out.println("가장 가까운 영화는 : " + minMovie);

            } else {

            System.out.println("이 영화는 액션 장르입니다");
            System.out.println("가장 가까운 영화는 : " + minMovie);

            }//  if end
    }
}
