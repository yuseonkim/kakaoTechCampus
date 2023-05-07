package Chapter6.ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest2 {
    public static void main(String[] args) {
        int i;
        try(FileInputStream fis = new FileInputStream("/Users/yuling/Desktop/공부/카테캠/자바중급/자바중급/src/Chapter6/ch14/input.txt")){
            while((i = fis.read()) != -1){
                System.out.println((char)i);
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
