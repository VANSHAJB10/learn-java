/*
Keshav is Store owner. 
In order to increase his sale he imposed a restriction on buying the Pencil, there is a restriction that the customer cant buy Pencil alone, 
the customer has to purchase eraser first then only he can buy Pencil but single eraser can be buyied individually.
Develop a program in order to increase his sale.

Input Format:
First line will contain an integer N representing number of items purchased.
Second line will contain N space separated 1 or 2. 1 means eraser and 2 means pencil purchased.

Constraints:
N can't be negative.
Pencil cant be buyed without eraser. After fisrt line in the input the value should either be 1 or 2, otherwise output will be printed Invalid Input

Output Format:
Valid Purchase/Invalid Purchase/ Invalid Input
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
       
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int arr[] = new int[n];
        int count = 0;
        for(int i=0;i<n;i++) {
            int val = scan.nextInt();
            if(val != 1 && val != 2) {
                System.out.println("Invalid Input");
                return;
            }
            if(val == 1)
                count++;
            if(val == 2) {
                if(count <= 0) {
                    System.out.println("Invalid Purchase");
                    return;
                }
                count--;
            }
            arr[i] = val;
        }
        System.out.println("Valid Purchase");
        
    }
}
