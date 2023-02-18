import java.util.Scanner;

class ATM{
    float Balance;
    int Pin = 1000;

    public void checkpin(){
        System.out.println("Enter your Pin: ");
        Scanner sc= new Scanner(System.in);
        int inputpin = sc.nextInt();

        if (inputpin == Pin){
            menu();
        }
        else{
            System.out.println("Pin Invalid");
            checkpin();
        }
        sc.close();

    }
    
    public void menu(){
        System.out.println("Choose the option: ");
        System.out.println("1. Check Current Balance ");
        System.out.println("2. Withdraw Money");
        System.out.println("3. Deposit Money");
        System.out.println("4. Exit");
        
        Scanner sc= new Scanner(System.in);// needs to be written again beacuse a new method is created // You cannot write the next line directly without writing this line of code
        int option =sc.nextInt();

        if(option == 1){
            checkBalance();
        }
        else if(option == 2){
            withdrawmoney();
        }
        else if(option == 3){
            depositmoney();
        }
        else if(option == 4){
            return; //Program will be terminated // no need of declaring exit method separately. 
            // *****FOCUS! *****  We cannot use 'break' here   **** 'return' must be used , as 'break' cannot be used outside a loop or switch .
        }
        else{
            System.out.println("Enter a valid option.");
        }
        sc.close();
    }

    public void checkBalance(){
        System.out.println("Balance is: "+ Balance);
        menu();
    }

    public void  withdrawmoney(){
        System.out.println("Enter Amount to withdraw");

        Scanner sc= new Scanner(System.in);
        float amount = sc.nextFloat();

        if(amount> Balance){
            System.out.println("Funds Insufficient. Request Declined!");
        }
        else{
            Balance = Balance-amount;
            System.out.println("Please collect your cash.");
        }
    menu();
    sc.close();
    }

    public void depositmoney(){
        System.out.println("Enterthe amount to be deposited");

        Scanner sc= new Scanner(System.in);
        float deposit = sc.nextFloat();

        Balance = Balance + deposit;
        System.out.println("Money deposited SUCCESSFULLY.");

        System.out.println("Do you want to check the current balance?");
        System.out.println("Press 1 for YES  and 2 for NO");
        int choice= sc.nextInt();
        if(choice == 1){
            checkBalance();
        }
        else{
            menu();
        }
        sc.close();
    }
}

public class ATM_Machine {

     public static void main(String args[]){

        ATM myobj = new ATM();  //creating object of ATM class
        myobj.checkBalance(); // Calling checkpin() method
    }
}
