package Package1;

import java.io.PrintStream;
import java.util.Scanner;

public class GradeBookTest {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        GradeBook gradeBook1 = new GradeBook(
                "CS101 Introduction to Java Programming");
        GradeBook gradeBook2 = new GradeBook(
                "CS102 Data Structures in Java");
        System.out.println( "gradeBook1 course name is: " + gradeBook1.getCourseName());
        System.out.println("gradeBook2 course name is: " + gradeBook2.getCourseName());
    }
}