package org.zerock;

public class ArrayUtil {

    public static int findIndex(String[] arr, String keyword){

        System.out.println("findIndex...");

        int result = -1;

        for (int i = 0; i < arr.length; i++) {

            if(arr[i].equals(keyword)){
                result = i;
                break;

            }//end if

        }// end for

        return result;
    }

}
// 순수로직 방식
// return은 한번만 나오는게 좋은 코드,
