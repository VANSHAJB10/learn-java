/*Mehar is in Pre-Nursery and she is learning counting. 
Her mother wants to test her so she gives her a number and asks her to count the number of digits in that number. Help Mehar by generating the program.

Input Format:
Integer number should be taken as input

Constraints:
Number should be a positive integer only.

Output Format:
Number Of digits(integer value)*/

/* ****  Answer may not be correct **** */

import java.util.Scanner;
public class solution{    
public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int x = scan.nextInt();
        int digit = 0;
    if(x<0){
        System.exit(0);
    }
    else{
        while(x != 0)
        {
            int n = x % 10;
            digit++;
            x = x / 10;
        }
        System.out.print(digit);
    }
        scan.close();

    }
}
