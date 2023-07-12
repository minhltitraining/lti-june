package assignment;

public class DayScholar extends Student{
   private String residentialAddress;
   public DayScholar (int studentId, char studentType, String studName, int semFees,
                      String residentialAddress, String cName){
       super(studentId, studentType, studName, semFees, cName);
       this.residentialAddress = residentialAddress;

   }


    @Override
    public String toString() {
        return "DayScholar{" +
                "residentialAddress='" + residentialAddress + '\'' +
                '}';
    }

    public void displayDetails(){
       super.displayDetails();
        System.out.println("DayScholar{" +
                "residentialAddress='" + residentialAddress + '\'' +
                '}');

   }
}
