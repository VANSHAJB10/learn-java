/*
Consider a physical trainer is arranging the students for physical training in a school. There are N students standing in a row for physical training.
He wants to insert a student with average height between the two students who are having odd height standing in consecutive.
Write a program for a physical trainer so that he can get the desired sequence of students.

Example: if the 5 students are having values: 3 6 5 9 7 then 5 and 9 are the students with odd height so the student with 
height 7 (average of 5 and 9) should be inserted between 5 and 9. Similarly, 9 and 7 are the 2 students with
odd heights so student with height 8 should be inserted between 9 and 7.
Output: 3 6 5 7 9 8 7

Input Format:
The first line will be containing one Integer representing a number of students N. 
The second line will contain N integers representing the heights of the students.

Constraints:
N>2 && N<20

Output Format:
The desired sequence of students after inserting students having the average height of two students with odd height
standing in consecutive in between them.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution
{
  public static void main(String args[]) throws Exception
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n>2&&n<20)
    {
      int arr[]=new int[n];
      for (int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      System.out.print(arr[0]+" ");
      for(int i=1;i<n;i++)
      {
        if(arr[i]%2==1&&arr[i-1]%2==1)
        {
          System.out.print(((arr[i-1]+arr[i])/2)+" "+arr[i]+" ");
        }
        else
        {
          System.out.print(arr[i]+" ");
        }
      }
    }
    else
    {
      System.out.println("Invalid Input");
    }
  }
}
