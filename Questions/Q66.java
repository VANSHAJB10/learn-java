/*We are given a binary string A of length N. N is necessarily even.
We need to do the following operation on the string as we traverse it from left to right.

00 is converted to A
01 is converted to T
10 is converted to C
11 is converted to G
Print the output once the above operations have been carried out on the whole string.

Input Format:
First line will contain T, number of test cases. Then the test cases follow.

Each test case contains two lines of input.

First line contains a single integer N, the length the original string.

Second line contains a binary string A of length N.*/

import java.util.Scanner;

public class DNAConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int T = scanner.nextInt(); // number of test cases
        

// METHOD 1
        while (T-- > 0) {
            int N = scanner.nextInt(); // length of the original string
            String A = scanner.next(); // binary string A
            
            StringBuilder result = new StringBuilder();
            
            for (int i = 0; i < N; i += 2) {
                String substring = A.substring(i, i + 2);
                
                switch (substring) {
                    case "00":
                        result.append("A");
                        break;
                    case "01":
                        result.append("T");
                        break;
                    case "10":
                        result.append("C");
                        break;
                    case "11":
                        result.append("G");
                        break;
                }
            }
            
            System.out.println(result);
        }


// METHOD 2








    }
}
