package assignment;

public class CourseRegistration {
    static protected int regId;
    protected String courseName;
    public CourseRegistration(){
        regId++;
    }
    public CourseRegistration(String cName){
        this();
        courseName = cName;
    }

    public void displayDetails(){
        System.out.println("Registration ID: " + regId);
        System.out.println("Course nane: " + courseName);
    }
}
