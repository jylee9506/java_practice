package org.zerock;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        String[] array = {"AAA", "BBB", "CCC", "DDD", "FFF"};
        String str = "DDD";

       int result =  ArrayUtil.findIndex(array, str);

       System.out.println(result);


//        Store store = new Store("우래옥", 34.277, 32.113);
//        System.out.println(store);
//        원래는 레퍼런스가 나와야하는데 바로 데이터값이 나옴(롬복 떄문임)

//        Store [] stores = {
//                new Store("우래옥", 37,127),
//                new Store("청진식당", 38,127),
//                new Store("원흥", 37,128),
//        };
//
//        System.out.println(Arrays.toString(stores));

    }
}
