package Chapter6.ch04;

public class StringConcatTest {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "world";
        StringConcatImpl strImpl = new StringConcatImpl();
        strImpl.makeString(s1,s2);

        StringConcat concat = (s,v)->{
            System.out.println(s+","+v);
        };

        concat.makeString("he","lo");


        StringConcat concat2 = new StringConcat() {
            @Override
            public void makeString(String s1, String s2) {
                System.out.println(s1+"..."+s2);
            }
        };
        concat2.makeString(s1,s2);



    }
}
