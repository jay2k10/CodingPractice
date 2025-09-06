package _ex24082025;

public class EmployeeData {
    private int ssn;
    private String empName;
    private int empAge;

    public int getSsn() {
        return ssn;
    }

    public void setSsn(int ssn) {
        this.ssn = ssn;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public static void main(String[] args) {
        EmployeeData emp = new EmployeeData();
        emp.setEmpName("Jay");
        emp.setSsn(1030);
        emp.setEmpAge(34);
        System.out.println("Employee age is: "+emp.getEmpAge());
        System.out.println("Employee name is: "+emp.getEmpName());
        System.out.println("Employee ssn no is: "+emp.getSsn());

    }
}
