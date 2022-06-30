public class ArrayUtil {

    public static int findIndex(String[] arr, String keyword){
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
// return은 한번만 나오는게 좋은 코드
// result = -1; 이라는 변수를 두어 풀어 나가는게 함수형 풀이 방식