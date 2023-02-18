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
        System.out.println("Check Current Balance ");
        System.out.println("Withdraw Money");
        System.out.println("Deposit Money");
        System.out.println("Exit");
    }
}


public class ATM_Machine {
    
}
