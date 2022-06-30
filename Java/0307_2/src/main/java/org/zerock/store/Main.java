package org.zerock.store;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {

        StoreLoader loader = null;
        try {
            loader = new StoreLoader();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        StoreDTO[] dtos = loader.getStores();

        for (StoreDTO dto: dtos) {

            System.out.println(dto);
        }//end for

    }
}
