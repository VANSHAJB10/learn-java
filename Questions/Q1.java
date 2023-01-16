/* Q >> Alice, in a game, is supposed to take a number as a input from the other participant. The number to be entered is otherwise supposed to be a positive number, 
Alice doesn’t rely if correct input is given. 
Write a program code to convert the input into an absolute positive value */

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y=-1;
        if(x < 0){
            System.out.println(x*y);  //negative number is converted into positive by multiplying with -1
        }
        else{
            System.out.println(x);
        }
    }
}
