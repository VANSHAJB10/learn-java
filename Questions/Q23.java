/* Neha and Nisha are playing a game.
Nisha ask Neha to enter the number N from given range of 0 to 99 .
Now Nisha need to print the number till N and once it exceed the number from N then Print "Games End".
If Neha enter the number less then 0 print Invalid input.

Input Format:
Program should take the input for Number N.

Constraints:
0>=N<100

Output Format:
Print the number till N and if the range of N exceed print "Games End”.If Neha enter the number less then 0 print "Invalid Input". */


import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int k = -1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            if((n>=0)&&(n<99)){
                for(int i=0;i<=n;i++){
                    k++;
                        System.out.println(k);
                }
                System.out.println("Games End");
            }
        else{
            System.out.println("Invalid Input");
        }
    }
}
