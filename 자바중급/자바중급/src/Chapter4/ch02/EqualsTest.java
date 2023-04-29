package Chapter4.ch02;

public class EqualsTest {
    public static void main(String[] args) {
        Student std1 = new Student(100,"Lee");
        Student std2 = new Student(100,"Lee");

        System.out.println(std1);
        std1.setStudentNum(200);
        Student copyStd1 = std1.clone();
        System.out.println(copyStd1);

//
//        System.out.println(std1.equals(std2));
//
//
//        String str1 = new String("abc");
//        String str2 = new String("abc");
//
//        System.out.println(str1.equals(str2));
//        System.out.println(std1.hashCode());
//        System.out.println(std2.hashCode());
//
//
//        System.out.println(System.identityHashCode(std1));
//        System.out.println(std1);
//        Student copyStd1 = std1.clone();
//        System.out.println(System.identityHashCode(copyStd1));
    }
}
