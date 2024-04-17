package Package3;

import java.util.Scanner;

public class AverageClassGradeBook {
    static Scanner keyboard = new Scanner(System.in);

    public static void main(String[] args) {

        GradeBook myGradeBook = new GradeBook("CS101 Introduction to Java Programming");
        myGradeBook.displayMessage();
        myGradeBook.determineClassAverage();

    }
}