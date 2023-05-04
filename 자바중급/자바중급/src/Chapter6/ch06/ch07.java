package Chapter6.ch06;

import java.util.Arrays;
import java.util.function.BinaryOperator;

public class ch07 implements BinaryOperator<String> {
    public static void main(String[] args) {
        String greetings[] = {"안녕하세요~~~", "hello", "Good morning", "반갑습니다람지"};
        System.out.println(Arrays.stream(greetings).reduce("",(s1,s2)->{
            if(s1.getBytes().length>=s2.getBytes().length) return s1;
            else return s2;
        }));
    }

    @Override
    public String apply(String s, String s2) {
        return null;
    }
}
