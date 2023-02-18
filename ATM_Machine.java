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
        }

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
            break; //Program will be terminated // no need of declaring exit method separately. 
        }
        else{
            System.out.println("Enter a valid option.");
        }
        
    }
    
}


public class ATM_Machine {
    
}
