package assignment;

public class Student {
    protected int studentId;
    protected char studentType;
    protected String studentName;
    protected int semesterFees;
    protected int feesPerMonth;

    public Student (int studentId){
        this.studentId = studentId;
    }

    public Student (int studentId, char studentType, String studName, int semFees){
        super();
        this.studentType = studentType;
        studentName = studName;
        semesterFees = semFees;
    }


    public String toString() {
        return "Student{" +
                "studentId=" + studentId +
                ", studentType=" + studentType +
                ", studentName='" + studentName + '\'' +
                ", semesterFees=" + semesterFees +
                ", feesPerMonth=" + feesPerMonth +
                '}';
    }

    public void displayDetails(){
        System.out.println("Called from student:");
        System.out.println( "Student{" +
                "studentId=" + studentId +
                ", studentType=" + studentType +
                ", studentName='" + studentName + '\'' +
                ", semesterFees=" + semesterFees +
                ", feesPerMonth=" + feesPerMonth +
                '}');
    }
}
