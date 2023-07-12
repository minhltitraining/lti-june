package assignment;

public class Student {
    protected int studentId;
    protected char studentType;
    protected String studentName;

    protected int semesterFees = 12000;
    protected int feesPerMonth;
    public void setStudentIt(int sId){
        this.studentId = sId;
    }

    public void setStudentType(char sType){
        this.studentType = sType;
    }

    public void setStudentName(String fName, String lName){
        this.studentName = fName + lName;
    }

    public void getDetails(){
        System.out.println("Student ID:" + studentId);
        System.out.println("Student Type:" + studentType);
    }

    public void calculateFees(){
        this.feesPerMonth = this.semesterFees/ 6;
    }
}
