/* Sajal and Ruhi are playing a game.
Sajal is going to tell one number and one operation (Even, Odd, Prime and Factorial), Ruhi have to apply the operation and tell the output.

Input Format:
Space seperated numbers, first number on which need to apply operation and second number will be 1 for checking the number is even or not, 2 for checking number is odd or not, 3 for checking number is prime or not and 4 for calculating factorial of number.

Constraints:
First number will be positive integer value. Second number can be in range of 1 to 4.

Output Format:
Yes / No for first three operations and an integer value if operation four is performed. */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int fact = 1;
        switch(n2){
            case 1:
                {
                    if(n1%2==0){
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println("No");
                    }
                    break;
                }
            case 2:
                {
                    if(n1%2!=0){
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println("No");
                    }
                    break;
                }
            case 3:
                {
                    if((n1%1==0)&&(n1%n1==0)){
                        System.out.println("Yes");
                    }
                    else{
                        System.out.println("No");
                    }
                    break;
                    }
            case 4:
                {
                    for(int i=1;i<=n1;i++){    
                        fact=fact*i;    
                    }    
                    System.out.println(fact);   
                    break;
                }
                }
        }
}
