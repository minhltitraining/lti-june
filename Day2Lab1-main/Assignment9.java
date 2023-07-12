public class Student {
    private int studentId;
    private char studentType;
    private String studentName;

    public Student(char sType, String fname, String lname){
        this.studentId = 550;
        this.studentName = fname + lname;
    }

    public static void displayDetails(Student s) {
        System.out.println("Student ID: " + s.studentId + " " +
                            "student type: " + s.studentType + " " +
                            "student name: " + s.studentName);
    }
    public int getStudentId() {
        return studentId;
    }
    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }
    public char getStudentType() {
        return studentType;
    }
    public void setStudentType(char studentType) {
        this.studentType = studentType;
    }
    public String getStudentName() {
        return studentName;
    }
    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
   
    
    public static void main(String[] args) {
        Student studentOne = new Student ('D', "Bony", "Thomas");
        displayDetails(studentOne);
        Student studentTwo = new Student ('H', "Dinil", "Bose");
        displayDetails(studentTwo);

    }
}
