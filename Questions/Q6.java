/* Write a program to take the 2 inputs of integer type from the user. 
Display the values separated by symbol ‘-’ if the values are positive otherwise display the message “Invalid Input”. */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        if(x>0 && y>0) {
            System.out.println(x + "-" + y);      // string concatenation
        }
        else {
            System.out.println("Invalid Input");
        }
        sc.close();
    }
}
