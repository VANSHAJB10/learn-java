/* Q>> Write a java program that performs the following steps. 
a. Declare two int variables named x and y. 
b. Assign input taken from user to x. 
c. Assign twice the value of x to y. 
d. Interchange the value of x and y. 
e. Print the values of both variables on screen. */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner ps = new Scanner(System.in);
        int x = ps.nextInt();
        int y = 2*x;
        System.out.print(y+" ");
        System.out.print(x);
    }
}
