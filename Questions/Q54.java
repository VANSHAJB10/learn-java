/*
Adwit is playing game of number division with her friend , taking 2 input numbers both are of float type only. 
He defines rules for game is like that if second number is 0.0 then it will print Infinity and if second number is not 0.0 then it simply print its result and 
that is also of float type.

Input Format:
In first line , enter first number. In second line , enter second number

Constraints:
Both the input numbers must be of float type

Output Format:
Output depends upon second number, if it is 0.0 then it will print Infinity , but if second number is not zero then it will print result of float division number. */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b;

        a = sc.nextFloat();
        b = sc.nextFloat();
        if(b == 0.0) {
            System.out.println("Infinity");
        }
        else {
            System.out.println(a / b);
        }
        sc.close();
    }
}



// METHOD -- 2
/* Using try catch  */
class InfinityException extends Exception {
    public InfinityException(String message) {
        super(message);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a, b;

        a = sc.nextFloat();
        b = sc.nextFloat();
        
try {
    if(b == 0.0) {
        throw new InfinityException("infinity");   // running but showing resource leak ********* EXPLAINATION ****************** ?
    }
    else {
        System.out.println ( (float) (a / b) ); // typecasting it to float
    }
}

catch (InfinityException ie) {
            System.out.println( ie.getMessage() );
}

    }
sc.close();
}
