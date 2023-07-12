package assignment;

public class MainApp {
    public static void main(String[] args) {

        int studentId = Integer.parseInt(args[0]);
        char studentType = args[1].toCharArray()[0];
        String firstName = args[2];
        String lastName = args[3];
        String residentialStatus = args[4];
        if (residentialStatus == "hostelite"){
            String hostelName = args[5];
            int roomNumber = Integer.parseInt(args[6]);
            Hostelite h = new Hostelite(studentId, studentType, firstName, lastName, hostelName, roomNumber);
            System.out.println(h);
        } else {
            double fee = Double.parseDouble(args[5]);
            String address = args[6];
            DayScholar d = new DayScholar(studentId, studentType, firstName, lastName, fee, address);
            System.out.println(d);
        }
    }
}
