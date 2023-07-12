package assignment;

public class Student extends CourseRegistration{
    protected int studentId;
    protected char studentType;
    protected String studentName;
    protected int semesterFees;
    protected int feesPerMonth;

    public Student (int studentId, String cName){
        super(cName);
        this.studentId = studentId;
    }
    public Student (int studentId, char studentType, String studName, int semFees, String cName){
        super(cName);
        this.studentType = studentType;
        studentName = studName;
        semesterFees = semFees;
    }

    @Override
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
        super.displayDetails();
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
