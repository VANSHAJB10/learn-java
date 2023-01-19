// Saurav and his friend playing cards. Both are going to pick four cards from the deck and show the cards.
// If anyone got higher number of even or odd number cards then he will win the game. Write a program to check who wins the game or game get tie.

//Constraints  --> Values will be between 1-13.
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int[] a1 = new int[4];
        int[] a2 = new int[4];
        int count1 = 0,count2 = 0;
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++) {
            a1[i] = sc.nextInt();
            if(a1[i]>13 || a1[i]<1) {
                System.out.println("Invalid Input");
                System.exit(0);
            }
            if(a1[i]%2 == 0) {
                count1++;
            }
        }
        for(int i=0;i<4;i++) {
            a2[i] = sc.nextInt();
            if(a2[i]>13 || a2[i]<1) {
                System.out.println("Invalid Input");
                System.exit(0);
            }
            if(a2[i]%2 == 0) {
                count2++;
            }
        }
        if(count1<2) {
            count1 = 4-count1;
        }
        if(count2<2) {
            count2 = 4-count2;
        }
        if(count1>count2) {
            System.out.println("Saurav Won");
        }
        else if(count1==count2) {
            System.out.println("Tie");
        }
        else {
            System.out.println("Saurav Lost");
        }
        sc.close();
    }
}
