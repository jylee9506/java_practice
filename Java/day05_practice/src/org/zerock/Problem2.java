package org.zerock;

public class Problem2 {
    public static void main(String[] args) {
        int [] scores = {10, 30, 23, 43, 43, 22, 44, 75};
        int sum = 0;
        double average = 0;

        for(int i = 0; i < scores.length; i++){
            sum += scores[i];
        }// end for

        average = (double)sum / scores.length;

        System.out.println("합은 : " + sum);
        System.out.println("평균은 : " + average);



    }
}
