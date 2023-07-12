package assignment;

public class DayScholar extends Student{
   private String residentialAddress;
   public DayScholar (int studentId, char studentType, String studName, int semFees, String residentialAddress){
       super(studentId, studentType, studName, semFees);
       this.residentialAddress = residentialAddress;

   }


    public String toString() {
        return "DayScholar{" +
                "residentialAddress='" + residentialAddress + '\'' +
                '}';
    }

    public void displayDetails(){
       super.displayDetails();
       System.out.println("Called from day scholar");
       System.out.println(this.toString());

   }
}
