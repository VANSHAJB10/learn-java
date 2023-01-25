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
    
    // Logic 2
    a=a+b;
    b=a-b;  /* in this a can be substitued as (a+b) (taking value of a from previous line)eventually making the expression as --> b=a */
    a=a-b;  /* in this b can be substitued as (a-b) (taking value of b from previous line) eventually making the expression as --> a=b */
    
    System.out.println("After swapping a=" + a + "and b=" + b); // String Concatenation is used here
  }
}


