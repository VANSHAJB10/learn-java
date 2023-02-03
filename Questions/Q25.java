/* Jimmy has to develop a Kids Learning App as his mini-project of Java subject where any 
State name is entered by the user and it displays the name of its capital as per the following list:

Assam : Dispur
Bihar : Patna
Madhya Pradesh : Bhopal
Manipur : Imphal
Mizoram : Aizawl
Sikkim : Gangtok
Uttar Pradesh: Lucknow
Uttarakhand : Dehradun

If any other input is given, then the output must be No Record Found
Help him to implement the logic using switch-case.

Input Format:
Reads the name of the state

**Example: **Manipur

Constraints:
NA

Output Format:
Prints the name of the Capital or No Record Found */

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String state =sc.nextLine(); /*Taking input from user*/
        
        /*Using switch-case statemets */
        switch(state){
            case "Assam":
                {
                    System.out.println("Dispur");
                    break;
                }
            case "Bihar":
                {
                    System.out.println("Patna");
                    break;
                }
            case "Madhya Pradesh":
                {
                    System.out.println("Bhopal");
                    break;
                }
            case "Manipur":
                {
                    System.out.println("Imphal");
                    break;
                }
            case "Mizoram":
                {
                    System.out.println("Aizawl");
                    break;
                }
           case "Sikkim":
                {
                    System.out.println("Gangtok");
                    break;
                }
            case "Uttar Pradesh":
                {
                    System.out.println("Lucknow");
                    break;
                }
            case "Uttarakhan":
                {
                    System.out.println("Dehradun");
                    break;
                }
            default:
            {
            System.out.println("No Record Found ");
            break;
            }
        }

    }
}
