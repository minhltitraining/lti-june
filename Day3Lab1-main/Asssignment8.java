package assignment;
public class Student {
    private int studentId;
    private char studentType;
    private String studentName;
    private String residentialStatus;
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
        this.studentName = firstName + " " + lastName;
    }

    public void setResidentialStatus(String residentialStatus) {
        this.residentialStatus = residentialStatus;
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

    public String getResidentialStatus() {
        return residentialStatus;
    }

    public double getFees() {
        return feesPerMonth;
    }

    public void calculateFees(double semesterFees ){
        this.feesPerMonth = semesterFees/6.0;
    }

    public void calculateFees(double semesterFees, double hostelFees){
        this.feesPerMonth = semesterFees / 6.0 + hostelFees;
    }

    public static void main(String[] args) {
        int studentId = Integer.parseInt(args[0]);
        String residentialStatus = args[1];
        int semesterFee = Integer.parseInt(args[2]);
        int hostelFee = Integer.parseInt(args[3]);
        Student s = new Student(studentId, 'F', "Minh", "Nguyen");
        s.setResidentialStatus(residentialStatus);
        if (s.getResidentialStatus() == "Day Scholar"){
            s.calculateFees(semesterFee);
        } else {
            s.calculateFees(semesterFee, hostelFee);
        }

        System.out.println(s.getFees());
    }
}
