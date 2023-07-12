package assignment;

public final class DayScholar extends Student{
    private String residentialAddress;

    public DayScholar(){};
    public DayScholar(int sId, char sType, String sName,
                        String sAddress){
        this.studentId = sId;
        this.studentName = sName;
        this.studentType = sType;
        this.residentialAddress = sAddress;
    };
    public void setResAddress(String resAddress){
        this.residentialAddress = resAddress;
    }

    public void displayDaySDetails(){
        super.getDetails();
        System.out.println("Student Name " + studentName);
        System.out.println("Residential Address" + residentialAddress);
    }

    public static void main(String[] args) {
        DayScholar d = new DayScholar(1, 'D', "David", "USA");
        d.calculateFees();
        d.getDetails();
        d.displayDaySDetails();
    }
}
