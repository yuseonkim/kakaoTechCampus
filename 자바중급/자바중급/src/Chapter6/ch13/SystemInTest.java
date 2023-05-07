package Chapter6.ch13;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest {
   public static void main(String[] args) {


        System.out.println("알파벳 여러개를 쓰고 엔터 클릭");
        int i;
        try {
            InputStreamReader irs = new InputStreamReader(System.in);
            while((i = irs.read())!= '\n') {
                System.out.print((char) i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
