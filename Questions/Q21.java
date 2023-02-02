/* Ashmita is in standared 7th,and not able to remember multiple of any number. 
So , help her to display the multiple of particular digit upto 10, which is entered by her.

Input Format:
First line display a number which is entered by ashmita.

Constraints:
only integer numbers are acceptable.

Output Format:
Multiple of particular number is displayed upto 10 */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=10;i++){
            System.out.println(n +" x "+i+" = "+(n*i)); //String concatenation
        }
    }
}
