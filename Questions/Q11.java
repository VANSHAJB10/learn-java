//HCF of 2 numbers
import java.util.Scanner;
public class hcf_code
{
   public static void main(String[] args)
   {
      int a, b, hcf;
      Scanner s = new Scanner(System.in);
      
      System.out.print("Enter the Two Numbers: ");
      a = s.nextInt();
      b = s.nextInt();
      
      if(a<b)
         hcf = a;
      else
         hcf = b;

      while(true)
      {
         if((a%hcf==0) && (b%hcf==0))
            break;
         else
            hcf--;
      }
      System.out.println("\nHCF of " + a + "," + b + " = " +hcf);
   }
}
