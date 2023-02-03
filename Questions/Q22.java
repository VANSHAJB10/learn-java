import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int k = -1;
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
            if((n>=0)&&(n<99)){
                for(int i=0;i<=n;i++){
                    k++;
                        System.out.println(k);
                }
                System.out.println("Games End");
            }
        else{
            System.out.println("Invalid Input");
        }
    }
}
