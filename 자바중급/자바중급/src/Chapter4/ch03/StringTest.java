package Chapter4.ch03;

public class StringTest {
    public static void main(String[] args) {
        String java = new String("java");
        String android = new String("android");

        System.out.println(System.identityHashCode(java));
        java = java.concat(android);


        System.out.println(System.identityHashCode(java));

        String a = "a";
        String b = "b";
        System.out.println(System.identityHashCode(a));

        a = a.concat(b);
        System.out.println(System.identityHashCode(a));

    }
}
