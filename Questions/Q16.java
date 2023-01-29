/*Write a program to take one input of int type from the user. 
If the value is positive convert it into double and display it, otherwise display the message “Invalid Input”.

Input Format:
Your program should take one input of int type.

Constraints:
Input should be positive integer

Output Format:
If the input value is positive number (including 0) display the value in double type otherwise display the message “Invalid Input”.*/

import java.util.*;
public class hackerrank {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        if(x>0){
        System.out.println((double)x);
        }
        else {
        System.out.println("Invalid Input");
        }
        scan.close();    
        }
    }
