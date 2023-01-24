import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        int cp=sc.nextInt();
        double c= new Double(cp);
        if(cp>450){
        double ab=c*0.18+c;
        double ab2=ab*100;
            if(ab2%100==0){
                int q=(int)ab;
                System.out.println(q);
            }else{
        System.out.printf("%.2f",ab);}}
        else{
            System.out.println("Invalid Input");
        }
    }
}
