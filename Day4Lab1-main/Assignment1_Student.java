package assignment;

public class Student {
    private int studentId;
    private char studentType;
    private String studentName;
    private double feesPerMonth;


    public Student() {
    }

    public Student(int studentId, char studentType, String firstName, String lastName) {
        this.studentId = studentId;
        this.studentType = studentType;
        this.studentName = firstName + " " + lastName;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }

    public void setStudentName(String firstName, String lastName) {
        this.studentName =  firstName + " " + lastName;
    }

    public void setFeesPerMonth(double feesPerMonth) {
        this.feesPerMonth = feesPerMonth;
    }

    public int getStudentId() {
        return studentId;
    }

    public char getStudentType() {
        return studentType;
    }

    public String getStudentName() {
        return studentName;
    }

    public double getFeesPerMonth() {
        return feesPerMonth;
    }
}
