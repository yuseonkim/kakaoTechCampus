package Chapter3.excercise;

public class Student {
    private int studentId;
    private String studentName;

    public Student(int studentId, String studentName) {
        this.studentId = studentId;
        this.studentName = studentName;
    }

    void showInfo(){
        System.out.println(studentId + " ," + studentName);
    }


}

