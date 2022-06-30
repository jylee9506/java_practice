package org.zerock.score;

import java.util.Arrays;

public class Ex3 {

    public static void main(String[] args) {

        ExamResult[] arr = new ExamResult[4];

        arr[0] = new ExamResult("국어",87);
        arr[1] = new ExamResult("영어",32);
        arr[2] = new ExamResult("수학",56);
        arr[3] = new ExamResult("과학",8);

        //성적순
//        Arrays.sort(arr, (a,b) -> a.score - b.score);
//
//        Arrays.sort(arr, (a,b) -> b.score - a.score);

        //과목명
//        Arrays.sort(arr, (a,b) -> a.subject.compareTo(b.subject));

        //특정점수와 비교

        int target = 70;
        Arrays.sort(arr, (a,b) -> Math.abs(a.score - target)
                                - Math.abs(b.score - target) );


        System.out.println(Arrays.toString(arr));

    }
}
