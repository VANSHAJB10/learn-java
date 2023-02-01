/*Pranjal and little raghav are playing a game where Pranjal gives three strings to raghav and raghav has to find the greatest string among them.
Write a program to help the raghav to find the greatest string among the three.

Input Format:
First line will contain first String statement
Second line will contain second String statement
Third line will contain third String statement

Constraints:
Maximum length of string can be 50.

Output Format:
one ineteger number representing length of largest string. if all the strings have same length then output should be -1. */


/* Concept-->
   String str= sc.nextLine();    --> used to reads string 
   str.length()  --> used to find the length of string  */

import java.util.Scanner;
public class hackerrank {    
public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.nextLine();
        String b = scan.nextLine();
        String c = scan.nextLine();
        int x = a.length();
        int y = b.length();
        int z = c.length();
        if(x >= 50 || y >= 50||z>=50){
            System.exit(0);
        }
        else if(x==y& y==z){
            System.out.println("-1");
        }
        else{
            if( x >= y && x >= y){
                System.out.println(x);
            }
            else if (y >= x && y >= z)
                System.out.println(y);

            else
                System.out.println(z);
        }
        scan.close();

    }
}
