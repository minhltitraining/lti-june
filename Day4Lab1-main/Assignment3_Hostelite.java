package assignment;

public class Hostelite extends Student{
    private String hostelName;
    private int roomNumber;
    public Hostelite(){};

    public Hostelite(int studentId, char studentType, String firstName, String lastName, String hostelName, int roomNumber) {
        super(studentId, studentType, firstName, lastName);
        this.hostelName = hostelName;
        this.roomNumber = roomNumber;
    }

    public String getHostelName(){
        return this.hostelName;
    }

    public int getRoomNumber(){
        return this.roomNumber;
    }

    public void displayStudentDetails(){
        super.displayStudentDetails();
    }


}
