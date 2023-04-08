/* Create a class Student having attributes name (String), rollNo (int) and department (String). 
Create a functional interface Predicate with an abstract method test with following signature: boolean test(Student t); 
Write a test program to filter all the Students who is from ‘CSE’ department’ by using above test method with the help of lambda expression.

Input Format:
Your program should take 2 types of inputs. 
First will represents the number of Students and second will be the attributes of students in the order (name, rollNo, department). 
If the number of students will be less than equal 1 then display the message “Invalid” without asking for any input

Constraints:
Number of students should be greater than 1

Output Format:
Your program should display rollNo of the students in separate lines which are from ‘CSE’ department.
*/

import java.io.*;
import java.util.*;
@FunctionalInterface
interface InterFace {
    boolean test(Student t);
}
class Student {
    String name, department;
    int rollNo;
}
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if(n <= 1) {
            System.out.println("Invalid");
            return;
        }
        InterFace IF = (s)-> {
            if(s.department.equals("CSE"))
                return true;
            return false;
        };
        Student s[] = new Student[n];
        for(int i=0;i<n;i++) {
            s[i] = new Student();
            s[i].name = scan.next();
            s[i].rollNo = scan.nextInt();
            s[i].department = scan.next();
            if(IF.test(s[i]))
                System.out.println(s[i].rollNo);
        }
    }
