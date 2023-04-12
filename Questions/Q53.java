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
