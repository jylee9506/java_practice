package org.zerock;

import java.util.Scanner;

public class MultiTable {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("구구단");

        for(int i = 1; i <= 9; i++){
            for(int j = 1; j <= 9; j++){
                System.out.print(j + " * " + i + " = " + String.format("%,2d",i * j));
                System.out.print("   ");
            }
            System.out.println();
        }
    }
}
