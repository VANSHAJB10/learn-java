/* It's PTM tomorrow in Cambridge School.Teachers want to show the grades from(A to E) depending on the percentage of the student. 
Help the teacher's by developing the program for the same.To find the grade of a student, given the marks of N subjects. 
Given the marks of N subjects, we have to print the grade of a student based on the following grade slab.

If Percentage Marks > 90, Grade is A+ If 70 <= Percentage Marks <= 89, Grade is A If 60 <= Percentage Marks <= 69, Grade is B If 50 <= Percentage Marks <= 59, Grade is C If Percentage Marks <= 40, Grade is D

Input Format:
Integer Value to enter number of subjects, count Enter marks of subjects depending upon the the total number of subjects

Constraints:
Number of subjects should not exceed 7

Output Format:
Character output to show grades */

import java.util.Scanner;

public class Grade{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numSubjects = input.nextInt();
        
 if (numSubjects < 1 || numSubjects > 7) {
            System.out.println("Invalid");
            return;
        }

        int[] marks = new int[numSubjects];
        for (int i = 0; i < numSubjects; i++) {
            marks[i] = input.nextInt();
        }
        int totalMarks = 0;
        for (int i = 0; i < numSubjects; i++) {
            totalMarks += marks[i];
        }
        double percentageMarks = (double) totalMarks / (numSubjects * 100) * 100;
        String grade;
        if (percentageMarks > 90) {
            grade = "A+";
        } else if (percentageMarks >= 70) {
            grade = "A";
        } else if (percentageMarks >= 60) {
            grade = "B";
        } else if (percentageMarks >= 50) {
            grade = "C";
        } else {
            grade = "D";
        }
        System.out.printf(grade);
    }
}
