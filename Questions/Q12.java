/*Sonal built up a software code taking ratings on a product.
The product is supposed to be rated between 1 to 5. Create a program displaying an error "101" if the rating is greater than 5, else displaying "thanks".

Constraints:
Input can be floating point number or an integer.

Output Format:
Error or thanks should be displayed.
*/

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float R = sc.nextFloat();
        if(R<5 &R>0){
            System.out.println("thanks");      
        }
        else{
            System.out.println("101");
        }
        
    }
}
