public class SumOfDigits{
  public static void main(Stirng args[]){
    int num = 1234;
    
    int sum =0;
    
    while (num > 0){
      sum += num%10;
      num /= num/10;  
    }
    System.out.println("Sum of all the digits = " + sum);
  }
}
