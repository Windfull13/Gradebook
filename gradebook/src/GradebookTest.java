public class GradebookTest {

    private String courseName;

    /**
     * @return the courseName
     */
    public String getCourseName() {
        return courseName;
    }

    /**
     * @param courseName the courseName to set
     */
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public GradebookTest(String courseName) {
        this.setCourseName(courseName);
    }

    public void displayMessage() {
        System.out.println("course name is: " + this.getCourseName());
    }
}