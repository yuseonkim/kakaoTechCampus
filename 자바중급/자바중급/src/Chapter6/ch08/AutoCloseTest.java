package Chapter6.ch08;

public class AutoCloseTest {

    public static void main(String[] args) {
        AutoCloseable obj = new AutoCloseableObj();
        try(obj){

        }catch(Exception e){
            System.out.println();
        }
    }
    
}
