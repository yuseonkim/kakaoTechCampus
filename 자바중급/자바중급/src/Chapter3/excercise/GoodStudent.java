package Chapter3.excercise;

public class GoodStudent extends Student {

    int GoodStudentDate;

    public GoodStudent(int studentId, String studentName, int goodStudentDate) {
        super(studentId, studentName);
        GoodStudentDate = goodStudentDate;
    }

    @Override
    void showInfo() {
        super.showInfo();
        System.out.println(GoodStudentDate);
    }
}
