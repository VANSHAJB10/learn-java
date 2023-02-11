/*
Consider Aman is visiting Nehru Zoo. She has seen there are N elephants standing in a row. 
She wants to remove the elephants having the same height standing in consecutive.
Write a program for Aman so that she can get the desired sequence of elephants.

Input Format:
The first line will be containing one Integer representing a number of elephants N.
The second line will contain N integers representing the heights of the elephants.

Constraints:
N>2 && N<30

Output Format:
The desired sequence of elephants after removing elephants having the same height standing in consecutive.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
public class Solution
{
  public static void main(String args[])
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n>2&&n<30)
    {
      int arr[]=new int[n];
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      for(int i=0;i<n-1;i++)
      {
        if(arr[i]!=arr[i+1])
        {
          System.out.print(arr[i]+" ");
        }
      }
      System.out.println(arr[n-1]);
    }
    else
    {
      System.out.println("Invalid Input");
    }
  }
}
