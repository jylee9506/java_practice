package org.zerock;

import org.zerock.save.PiggySave;
import org.zerock.save.PiggyUI;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {

        File storeFile = new File("C:\\zzz\\store.txt"); //파일 데이터를 컨버팅해서 객체 형태로 만든것

        System.out.println(storeFile);

        Scanner scanner = new Scanner(storeFile);

        String first = scanner.nextLine();
        System.out.println(first);

        String[] arr = first.split(",");
        System.out.println(Arrays.toString(arr));

        int sno = Integer.parseInt(arr[0]);
        String name = arr[1];
        double lat = Double.parseDouble(arr[2]);
        double lng = Double.parseDouble(arr[3]);


        Store store = new Store(sno,name,lat,lng);
        System.out.println(store);

//        PiggySave save = new PiggySave();
//        PiggyUI piggyUI = new PiggyUI(save);
//        piggyUI.greeting();

    }
}
