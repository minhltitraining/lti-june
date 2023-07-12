package assignment;

public class DynamicEx {
    public static void main(String[] args) {
        Student dayScholar = new DayScholar();
        dayScholar.setStudentIt(1001);
        dayScholar.setStudentType('D');
        dayScholar.setStudentName("Thomas");
        ((DayScholar) dayScholar).setResAddress("USA");
        dayScholar.getDetails();
    }
}
