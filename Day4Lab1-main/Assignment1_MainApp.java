package assignment;

public class MainApp {
    public static void main(String[] args) {
        Hostelite h = new Hostelite(1, 'F',"Minh", "Nguyen", "Hostelite", 20);
        System.out.println("Student name: " + h.getStudentName());
        System.out.println("Student id: " + h.getStudentId());
        System.out.println("Student type: " + h.getStudentType());
        System.out.println("Hostel name: " + h.getHostelName());
        System.out.println("Room number: " + h.getRoomNumber());

    }
}
