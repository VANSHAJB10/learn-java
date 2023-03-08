/* Puneet and Virat are playing a game. Virat tells some numbers to Puneet. Puneet needs to find sum of all numbers which are odd and discard even numbers. 
Write a program in which implement a method public int sumOddNumbers(int... n) which will return the sum of all odd numbers.

Input Format:
Some integer values representing numbers given by Virat.

Constraints:
Number will lie between 20 and 400.

Output Format:
Sum according to the value returned by the method or will print Invalid Input in case of number did not match the constraints.  */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Objects;
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bi = new BufferedReader(new InputStreamReader(System.in));
        String[] strNums;
        strNums = bi.readLine().split(" ");
        int x;
        int sum = 0;
        for (String strNum : strNums) {
            if (Objects.equals(strNum, "")) continue;
            x = Integer.parseInt(strNum);
            if (x % 2 != 0) sum += x;
        }
        System.out.println(sum);
    }
}
