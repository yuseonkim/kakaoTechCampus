package Chapter6.ch08;

public class Test {

    public static void main(String[] args) {

        AutoCloseableObj obj = new AutoCloseableObj();

        try(obj){
            throw new Exception();
        }catch(Exception e){
            System.out.println("exception");
        }

        System.out.println("end");

    }
}
