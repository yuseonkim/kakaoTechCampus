package Chapter6.ch14;

import java.io.FileInputStream;
import java.io.IOException;

public class FileInputStreamTest3 {
    public static void main(String[] args) {
        int i;
        try(FileInputStream fis = new FileInputStream("/Users/yuling/Desktop/공부/카테캠/자바중급/자바중급/src/Chapter6/ch14/input2.txt")){

            byte[] bs = new byte[10];
            while( (i = fis.read(bs)) != -1){
                for(int j = 0;j<i;j++){
                    System.out.print((char)bs[j]);
                }
            }
        }catch(IOException e){
            System.out.println(e);
        }
    }
}
