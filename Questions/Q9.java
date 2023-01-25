public class Swapping2Numbers{
  public static void main (String args[]){
    int a=10;
    int b=20;
    int temp; // taking a 3rd (temorary) variable
    
    System.out.println("Before swapping a=" + a + "and b=" + b);
    
    //Swapping logic starts here
    temp=a;
    a=b;
    b=temp;
    
    System.out.println("After swapping a=" + a + "and b=" + b); // String Concatenation is used here
  }
}
