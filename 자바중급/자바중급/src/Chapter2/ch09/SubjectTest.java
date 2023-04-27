package Chapter2.ch09;

public class SubjectTest {
    public static void main(String[] args) {
        Student studentKim = new Student(182990, "김유선");
        studentKim.setKoreaSubject("국어",100);
        studentKim.setMathSubject("수학",100);
        studentKim.showScoreInfo();

    }

}
