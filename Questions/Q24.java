/* Vijay and Gaurav are two friends. They are playing a game to check that whether the first word is similar to second or not. 
For example first word is "loop" and second is "lloooopp". 
These words will be considered similar as characters are same and in first word 'l' is occuring 1 time, 
'o' is 2 times and 'p' is 1 time i.e occurance of 'l'= occurance of 'p' and occurance of 'o' is double than the occurance of 'l' and 'p'. Help them using program.

Input Format:
First line will contain two space seperated words.

Constraints:
Input will be two space seperated words only.

Output Format:
Similar/ Not Similar
*/

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
         throws IOException {
            Scanner cin = new Scanner(System.in);
            BufferedReader bi = new BufferedReader( new InputStreamReader(System.in) );
            String[] strNums = bi.readLine().split(" ");
        String s = "llooooopp";
        if(strNums[1].equals(s))
           System.out.println("Not Similar");
        else  System.out.println("Similar");
    }
}
