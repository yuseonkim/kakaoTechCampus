package Chapter6.ch08;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThorwException {

    public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
        FileInputStream fis = new FileInputStream(fileName);
        Class c = Class.forName(className);
        return c;
    }
    public static void main(String[] args) {

        ThorwException test=  new ThorwException();
        try {
            test.loadClass("a.txt","abc");
        } catch (ClassNotFoundException e) {
            System.out.println(e);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch(Exception e){
            System.out.println("error");
        }

    }
}
