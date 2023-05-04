package Chapter6.ch05;

import java.util.Arrays;
import java.util.stream.IntStream;

public class IntArraystreamTest {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
//        for(int num : arr){
//            System.out.println(num);
//        }

        Arrays.stream(arr).forEach(n-> System.out.println(n));
        IntStream is = Arrays.stream(arr);
    }

}
