package Package1;

public class GradeBook {

    private String courseName;

    public GradeBook(String name) {
        courseName = name;
    }

    public void setCourseName(String name) {
        courseName = name;
    }

    public String getCourseName() {
        return courseName;
    }

    public void displayMessage() {
        System.out.println("Welcome to the grade book for: " + getCourseName());
    }
}
