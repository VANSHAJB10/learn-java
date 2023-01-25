public class Swapping2Numbers{
  public static void main (String args[]){
    int a=10;
    int b=20;
    int temp; // taking a 3rd (temorary) variable
    
    System.out.println("Before swapping a=" + a + "and b=" + b);
    
    /* Swapping logic starts here */
    
    // Logic 1
    temp=a;
    a=b;
    b=temp;
    
    // Logic 2 - Using 2 variables ONLY!
    a=a+b;
    b=a-b;  /* in this a can be substitued as (a+b) (taking value of a from previous line)eventually making the expression as --> b=a */
    a=a-b;  /* in this b can be substitued as (a-b) (taking value of b from previous line) eventually making the expression as --> a=b */
    
    // Logic 3 - Using 2 variables ONLY!
    a=a*b;     /* ****Values of a and b can not be zero in this logic****   --> It will give Exception if any of the value is zero*/
    b=a/b;
    a=a/b;

    
    System.out.println("After swapping a=" + a + "and b=" + b); // String Concatenation is used here
  }
}


