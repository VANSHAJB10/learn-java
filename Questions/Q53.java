/* 

Kunal inaugrated his shop last year and had Men's Collection only. 
Now in order to improve his business he added Kids Collection and Ladies Collection too. 
As the customer enters for buying clothes he advertises his new collection of ladies as well as kids. 
Some customers buys kids or ladies goods also whereas some dont even acknowledge for the newly added collection. 

When customer does not show interest to buy ladies or kids collection then the program should throw an OnlyMenzShoppingException 
else print welcome to ladies or kids section. Handle this exception with message intersted only in menz shopping.


Input Format:
String valued Yes or No

Constraints:
Entry should be in Yes or No else print inavlid input

Output Format:
welcome to ladies or kids section/intersted only in menz shopping/invalid input

*/

import java.util.Scanner;

class OnlyMenzShoppingException extends Exception {
    public OnlyMenzShoppingException(String message) {
        super(message);
    }
}

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            String response = sc.nextLine();

            if (!response.equalsIgnoreCase("yes") && !response.equalsIgnoreCase("no")) {
                throw new OnlyMenzShoppingException("invalid input");
            } else if (response.equalsIgnoreCase("yes")) {
                System.out.println("welcome to ladies or kids section");
            } else {
                System.out.println("intersted only in menz shopping");
            }
        } catch (OnlyMenzShoppingException e) {
            System.out.println(e.getMessage());
        }
    }

}

/* EXPLANATION */

/* Code for how to use a custom exception class to handle specific scenarios where errors or unexpected behavior may occur in a program.

The code defines a custom exception class called "OnlyMenzShoppingException" that extends the standard "Exception" class. 
This custom exception class is used to handle a specific scenario where a user input is invalid because they are interested only in shopping for men's items.

The main function of the program starts by creating a new Scanner object to read user input from the console. 
It then uses a try-catch block to handle any exceptions that might be thrown during execution.

Inside the try block, the program prompts the user for input and reads the response using the Scanner object. 
If the response is not "yes" or "no" (case insensitive), the program throws an instance of the custom exception class with the message "invalid input". 
If the response is "yes", the program prints "welcome to ladies or kids section" and if the response is "no", the program prints "interested only in menz shopping".

If an instance of the custom exception class is thrown, the catch block is executed and the message associated with the exception is printed to the console.
*/
