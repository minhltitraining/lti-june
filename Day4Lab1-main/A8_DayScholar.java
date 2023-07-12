package assignment;

public class DayScholar extends Student{
    private String residentialAddress;
    public DayScholar(){};
    public DayScholar(int studentId, char studentType, String firstName, String lastName, double fee, String address){
        super(studentId, studentType, firstName, lastName);

    }

    public String getResidentialAddress(){
        return this.residentialAddress;
    }

    public void displayStudentDetails(){
        super.displayStudentDetails();
    }
}
