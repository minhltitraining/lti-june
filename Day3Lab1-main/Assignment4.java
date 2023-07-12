package assignment;

public class Student {
    private int studentId;
    private char studentType;
    private String studentName;
   
    
    public Student() {
        this.studentId = 10;
        this.studentType = 'F';
    }
    
    
    
    public Student(int studentId, char studentType, String firstName, String lastName) {
		super();
		this.studentId = studentId;
		this.studentType = studentType;
		this.studentName = firstName + lastName;
	}

    public void setStudentName(String firstName, String lastName) {
    	this.studentName = firstName + lastName;
    }

    public String getStudentName() {
    	return studentName;
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
    
    @Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentType=" + studentType + ", studentName=" + studentName
				+ "]";
	}



	public static void main(String[] args) {
		Student s = new Student(10, 'F', "Minh", "Nguyen");
		System.out.println(s);
	}
}
