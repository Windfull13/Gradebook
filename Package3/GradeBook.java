package Package3;

import java.util.Scanner;

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
    public void determineClassAverage()
    {
        Scanner input = new Scanner(System.in);

        int total;
        int gradeCounter;
        int grade;
        int average;

        total = 0;
        gradeCounter = 1;

        while (gradeCounter <= 10)
        {
            System.out.print("Enter grade: ");
            grade = input.nextInt();
            total = total + grade;
            gradeCounter = gradeCounter + 1;
        }
        average = total / 10;
        System.out.println("\n Total of all 10 grades is: " + total);
        System.out.println("Class average is: " + average);
    }
    public void determineClassAverage2()/*sentinel methods */ {
        Scanner input = new Scanner(System.in);

        int total;
        int gradeCounter;
        int grade;
        double average;

        total = 0;
        gradeCounter = 0;

        System.out.print("Enter grade or -1 to quit: ");
        grade = input.nextInt();

        while (grade != -1) {

            total = total + grade;
            gradeCounter = gradeCounter + 1;

            System.out.print("Enter grade or -1 to quit: ");
            grade = input.nextInt();
        }
        if (gradeCounter != 0)
        {
            average = (double) total / gradeCounter;
            System.out.println("Total of the " + gradeCounter + " grades entered is: " + total);
            System.out.println("Class average is " + average);
        }
        else System.out.println("No grades were entered");
    }

}