package courseregistration;

class Student {
    protected int studentId;
    protected char studentType;
    protected String studentName;
    public void setStudentId(int sId){
        this.studentId = sId;
    }

    public void setStudentType(char sType){
        this.studentType = sType;
    }

    public void setStudentName(String sName){
        this.studentName = sName;
    }

    public void getDetails(){
        System.out.println("Student ID: " + studentId);
        System.out.println("Student name: " + studentName);
        System.out.println("Student Type: " + studentType);
    }
}

class PackageEx {
    public static void main(String[] args) {
        Student student = new Student();
        student.setStudentId(1001);
        student.setStudentType('D');
        student.setStudentName("Thomas");
        student.getDetails();
    }
}
