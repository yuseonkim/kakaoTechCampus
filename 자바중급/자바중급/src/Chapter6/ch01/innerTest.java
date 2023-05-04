package Chapter6.ch01;


class OutClass{
    private int num = 10;
    private static  int sNum = 20;
     InClass inClass;

    public OutClass(){
        inClass = new InClass();
    }

    class InClass{
        int iNum = 100;
        void inTest(){
            System.out.println("OutClass num = "+ num + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = "+sNum + "(외부 클래스의 스태틱 변수");
            System.out.println("InClass inNum = "+iNum+"(내부 클래스의 인스턴스 변수");

        }
    }

    public void usingClass(){
        inClass.inTest();
    }

    static class inStaticClass{
        int iNum = 100;
        static int sinNum = 200;


        void inTest(){
            System.out.println("InClass num = "+ iNum + "(외부 클래스의 인스턴스 변수)");
            System.out.println("OutClass sNum = "+sNum + "(외부 클래스의 스태틱 변수");
            System.out.println("InClass inNum = "+sinNum+"(내부 클래스의 스태틱 변수");

        }

        static void Test(){
            System.out.println("OutClass sNum = "+sNum + "(외부 클래스의 스태틱 변수");
            System.out.println("InClass inNum = "+sinNum+"(내부 클래스의 스태틱 변수");

        }
    }
}


public class innerTest {

    public static void main(String[] args) {
        OutClass.inStaticClass sInClass = new OutClass.inStaticClass();
        sInClass.inTest();
        OutClass a = new OutClass();
        OutClass.inStaticClass.Test();







    }



}
