//To find whether a number is Prime or Not.
import java.util.Scanner;

class Prime {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        int number= sc.nextInt();
        
        if(isPrime(number)) {
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Non Prime Number");
        }
    }
    static  boolean isPrime(int num)
    {
        if(num<=1)
        {
            return false;
        }
       for(int i=2;i<=num/2;i++)
       {
           if((num%i)==0)
               return  false;
       }
       return true;
    }
}
