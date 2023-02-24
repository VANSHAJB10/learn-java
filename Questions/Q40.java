/*Babu and Goli are two friends and they meet after a long time. They have decided to do a party. 
They went in a restaurant and ordered some items and enjoyed the food. Babu has host the party but Goti 
have decided to pay half of the bill. Then they decided that Babu will pay 75% amount of bill and Goli will pay rest of the amount.
 Write a program using constructor and methods to calculate the amount Babu and Goli have to pay when total bill amount is available.

Input Format:
One Double value representing Total Bill amount.

Constraints:
Total bill will be between 200.00 and 4000.00

Output Format:
Two space seperated double value first representing amount paid by Babu and another by Goli. */

import java.util.Scanner;
import java.text.DecimalFormat;
public class solution_Day_29_2{    
    private static final DecimalFormat df = new DecimalFormat("0.00");
    public static void main(String[] args) {
    double am1,am2;
    Scanner sc = new Scanner(System.in);
    double bill =  sc .nextDouble();
    if((bill>=200.00)&&(bill<=4000.00)){
        am1 = 0.75*bill;
        am2 = 0.25*bill;
        System.out.print(df.format(am1) + " " + df.format(am2));
    }
    else{
        System.out.println("Invalid Input");
    }
    sc.close();
    }
}
