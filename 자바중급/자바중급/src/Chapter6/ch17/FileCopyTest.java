package Chapter6.ch17;

import java.io.*;
import java.net.Socket;

public class FileCopyTest {
    public static void main(String[] args) {
        long millisecond = 0;
        try (BufferedInputStream bis = new BufferedInputStream(new FileInputStream("a.zip"));
             BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("copy.zip"))) {

            millisecond = System.currentTimeMillis();

            int i;
            while ((i = bis.read()) != -1) {
                bos.write(i);
            }
            millisecond = System.currentTimeMillis() - millisecond;
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(millisecond);

        Socket socket = new Socket();
//        try {
////            new BufferedReader(new InputStreamReader(socket.getInputStream()
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
   }
}
