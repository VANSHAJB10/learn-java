/* Write a program to check whether two strings are ANAGRAM or not. 
Strings will be anagram if they have same set of characters same number of times. Your program should take the input of two strings of length greater than 2.
If the length of the any string is less than equal 2 then display the message “Invalid Input” without taking any more input.

Input Format:
Your program should take the input of two strings.

Constraints:
Length of strings should be greater than 2.

Output Format:
Your program should display the “ANAGRAM” or “NOT ANAGRAM” depending on the input strings. */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc= new Scanner(System.in);
        
        String str1 = sc.next();
        int len1 = str1.length();
        if (len1 < 3){
            System.out.println("Invalid Input");
            break;
        }
        else {
            String str2 = sc.next();
            int len2 = str2.length();
        }
        
        
        if(len2 < 3){
            System.out.println("Invalid Input");
        }
        else{
            str1 = str1.toLowerCase();
            str2 = str2.toLowerCase();

            // check if length is same
            if(str1.length() == str2.length()) {

              // convert strings to char array
              char[] charArray1 = str1.toCharArray();
              char[] charArray2 = str2.toCharArray();

                  // sort the char array
                    Arrays.sort(charArray1);
                    Arrays.sort(charArray2);
        
                    boolean result = Arrays.equals(charArray1, charArray2);
                    if(result) {
                        System.out.println("ANAGRAM");
                        }
                    else {
                        System.out.println("NOT ANAGRAM");
                    }
            }
            else {
                System.out.println("NOT ANAGRAM");
                }
            
        }
        
    }
}
