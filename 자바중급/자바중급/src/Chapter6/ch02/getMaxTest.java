package Chapter6.ch02;

public class getMaxTest {
    public static void main(String[] args) {
        getMax max = (int a,int b)-> a > b?a:b;
        System.out.println(max.getMax(5,4));

    }




}
