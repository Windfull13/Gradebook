public class GradeBook {
    public static void main(String[] args) {
        GradebookTest gradeBook1 = new GradebookTest("CS101 Introduction to Java Programming");
        GradebookTest gradeBook2 = new GradebookTest("CS102 Data Structures in Java");

        gradeBook1.displayMessage();
        gradeBook2.displayMessage();
}
}