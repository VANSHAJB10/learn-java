/*Shan is playing a game with little raghav. 
Shan provide a string and a char to raghav and raghav counts the occurrence of same char in the string.
Write a program to help the raghav to find the occurrence of the char in the string.

Input Format:
First line will contain String statement
second line will contain single character

Constraints:
Maximum length of string can be 50.

Output Format:
one ineteger number represent the count of character .*/

import java.io.*;
import java.util.*;
public class Main
{
  public static void main(String args[])
  {  
    Scanner sc = new Scanner(System.in);
    String input;
    input = sc.nextLine();
    char search;
    search = sc.next().charAt(0);
  int count=0;
  for(int i=0; i<input.length(); i++)
  {
      if(input.charAt(i) == search)
      count++;
  }
  System.out.println(count);
  }
}
