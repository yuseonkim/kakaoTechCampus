package Chapter2.ch16;

public class EmployeeTest {
    public static void main(String[] args){
        Employee employeeLee = new Employee();
        employeeLee.setEmployeeName("이순신");

        System.out.println(employeeLee.getEmployeeId());

        Employee employeeKim = new Employee();
        employeeKim.setEmployeeName("김유신");
        System.out.println(employeeKim.getEmployeeId());
    }
}
