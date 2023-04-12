package ch04;

public class StudentTest {
    public static void main(String[] args){
        Student a = new Student();
        a.studentID = 182990;
        a.setStudentName("Yuseon");
        a.address= "광주광역시 북구;";
        a.showStudentInfo();

        Student b = new Student();
        b.studentID = 214042;
        b.setStudentName("Mina");
        b.address= "신창동";
        b.showStudentInfo();;

    }
}
