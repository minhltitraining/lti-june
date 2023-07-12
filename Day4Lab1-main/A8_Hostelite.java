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

    public void calculateFees(double semesterFee){
        this.feesPerMonth = semesterFee / 6.0;
        this.feesPerMonth += 1200;
    }

    public static void main(String[] args) {
        Student s;
        String type = args[0];
        if (type == "hostelite"){
            s = new Hostelite(1, 'D', "John", "Walker", "11 Main St", 20);
            ((Hostelite) s).calculateFees(1000);
            s.displayStudentDetails();

        } else {
            s = new DayScholar(1, 'D', "John", "Walker", 1000,"11 Main st" );
            s.calculateFee(1000);
            s.displayStudentDetails();
        }


    }


}
