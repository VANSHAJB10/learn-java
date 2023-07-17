import java.util.*;
import java.time.*;

class Receipt
{
    String name;
    String v_no;
    String slot;
    String type;
    LocalTime entry_time;
    LocalDate date;
    LocalTime exit_time;

    Receipt(String n, String v, String s, char t)
    {
        name = n;
        v_no = v;
        slot = s;
        type = String.valueOf(t);
        date = LocalDate.now();
        entry_time = LocalTime.now();
    }

//    void setExitTime()
//    {
//        exit_time = LocalTime.now();
//    }
}

public class Parking
{
    Scanner sc = new Scanner(System.in);
    int[][] two_wheelers = new int[3][10]; // 3 rows 10 columns 2D array created
    int[][] four_wheelers = new int[5][10];

    private void populate()
    {
        // 0 represents empty parking slots
        for (int i = 0; i < two_wheelers.length; i++)
        {
            for (int j = 0; j < two_wheelers[i].length; j++)
            {
                int a = (int) (Math.random() * 10);
                if (a > 3)
                {
                    two_wheelers[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < four_wheelers.length; i++)
        {
            for (int j = 0; j < four_wheelers[i].length; j++)
            {
                int a = (int) (Math.random() * 10);
                if (a > 5)
                {
                    four_wheelers[i][j] = 1;
                }
            }
        }
    }

    void entry()
    {
        System.out.println("\nEnter the vehicle number: ");
        String v_no = sc.nextLine();
        System.out.println("\nEnter the owner's name: ");
        String name = sc.nextLine();
        System.out.println("\nEnter T for 2-Wheeler OR F for 4-Wheeler: ");
        char type = sc.next().charAt(0);
        String slot = null;
        if (type == 'T')
        {
            slot = getAvailableSlot(two_wheelers);
        } else if (type == 'F')
        {
            slot = getAvailableSlot(four_wheelers);
        }
        if (slot == null)
        {
            System.out.println("No available slot. Cannot enter the vehicle.");
            return;
        }
        Receipt r = new Receipt(name, v_no, slot, type);
        System.out.println("\nReceipt created!");
        System.out.println("Name: " + r.name);
        System.out.println("Vehicle Number: " + r.v_no);
        System.out.println("Slot: " + r.slot);
        System.out.println("Type: " + r.type);
        System.out.println("Entry Time: " + r.entry_time);
        System.out.println("Date: " + r.date);
    }

    void exit(Receipt receipt)
    {
        //receipt.setExitTime();

        System.out.println("\nVehicle exited!");
        System.out.println("Name: " + receipt.name);
        System.out.println("Vehicle Number: " + receipt.v_no);
        System.out.println("Slot: " + receipt.slot);
        System.out.println("Type: " + receipt.type);
        System.out.println("Entry Time: " + receipt.entry_time);
        //System.out.println("Exit Time: " + receipt.exit_time);
        System.out.println("Date: " + receipt.date);
        // Mark the slot as available again
        int row = receipt.slot.charAt(0) - 'A';
        int col = Integer.parseInt(receipt.slot.substring(1)) - 1;
        if (receipt.type.equals("T"))
        {
            two_wheelers[row][col] = 0;
        } else if (receipt.type.equals("F"))
        {
            four_wheelers[row][col] = 0;
        }
        System.out.println("Press M to get the amount of money to be recieved");
        String inputmoneychoice = sc.next();
        if (Objects.equals(inputmoneychoice, "M")) {
            System.out.println("Enter number of hours in 24H format");
            int endtimehour = sc.nextInt();

            System.out.println("Calculating the amount of money");
            moneyCal(endtimehour,receipt.entry_time);
        }

    }
    void moneyCal(int endtime,LocalTime entry_time)
    {

        // String starttime = String.valueOf(entry_time);
        int hours = endtime - entry_time.getHour();
        int money = hours * 20;

        System.out.println("The hourly cost of the vehicle is Rupees " + money);

    }

    String getAvailableSlot(int[][] arr)
    {
        for (int i = 0; i < arr.length; i++)
        {
            for (int j = 0; j < arr[i].length; j++)
            {
                if (arr[i][j] == 0)
                {
                    return " " + (char) (i + 65) + "" + (j + 1);
                }
            }
        }
        return null;
    }

    void displayAvailableSlots()
    {
        System.out.println("\nAvailable Slots:");
        System.out.println("2-Wheelers:");
        for (int i = 0; i < two_wheelers.length; i++)
        {
            for (int j = 0; j < two_wheelers[i].length; j++)
            {
                if (two_wheelers[i][j] == 0)
                {
                    System.out.print((char) (i + 65) + "" + (j + 1) + " ");
                }
            }
        }
        System.out.println("\n4-Wheelers:");
        for (int i = 0; i < four_wheelers.length; i++)
        {
            for (int j = 0; j < four_wheelers[i].length; j++)
            {
                if (four_wheelers[i][j] == 0) {
                    System.out.print((char) (i + 65) + "" + (j + 1) + " ");
                }
            }
        }
    }

    public static void main(String[] args)
    {
        Parking parking = new Parking();
        parking.populate();
        boolean exitProgram = false;
        while (!exitProgram)
        {
            System.out.println("\nEnter 1 for Vehicle Entry");
            System.out.println("Enter 2 for Vehicle Exit");
            System.out.println("Enter 3 to Display Available Slots");
            System.out.println("Enter 4 to Exit the Program");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice)
            {
                case 1:
                    parking.entry();
                    break;
                case 2:
                    System.out.println("\nEnter the slot of the vehicle to exit (e.g., A1): ");
                    String slot = sc.next();
                    Receipt exitReceipt = parking.getReceiptBySlot(slot);
                    if (exitReceipt != null)
                    {
                        parking.exit(exitReceipt);
                    } else
                    {
                        System.out.println("Invalid slot. Vehicle not found.");
                    }
                    break;
                case 3:
                    parking.displayAvailableSlots();
                    break;
                case 4:
                    exitProgram = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    Receipt getReceiptBySlot(String slot)
    {
        for (int i = 0; i < two_wheelers.length; i++)
        {
            for (int j = 0; j < two_wheelers[i].length; j++)
            {
                if (slot.equals((char) (i + 65) + "" + (j + 1)))
                {
                    return new Receipt("", "", slot, 'T');
                }
            }
        }
        for (int i = 0; i < four_wheelers.length; i++)
        {
            for (int j = 0; j < four_wheelers[i].length; j++)
            {
                if (slot.equals((char) (i + 65) + "" + (j + 1)))
                {
                    return new Receipt("", "", slot, 'F');
                }
            }
        }
        return null;
    }
}



/*V2*/
import java.util.*;
import java.time.*;

class Receipt {
    String name;
    String v_no;
    String slot;
    String type;
    LocalTime entry_time;
    LocalDate date;
    LocalTime exit_time;

    Receipt(String n, String v, String s, char t) {
        name = n;
        v_no = v;
        slot = s;
        type = String.valueOf(t);
        date = LocalDate.now();
        entry_time = LocalTime.now();
    }

    // void setExitTime() {
    // exit_time = LocalTime.now();
    // }
}

public class n {
    Scanner sc = new Scanner(System.in);
    int[][] two_wheelers = new int[3][10]; // 3 rows 10 columns 2D array created
    int[][] four_wheelers = new int[5][10];

    private void populate() {
        // 0 represents empty parking slots
        for (int i = 0; i < two_wheelers.length; i++) {
            for (int j = 0; j < two_wheelers[i].length; j++) {
                int a = (int) (Math.random() * 10);
                if (a > 3) {
                    two_wheelers[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < four_wheelers.length; i++) {
            for (int j = 0; j < four_wheelers[i].length; j++) {
                int a = (int) (Math.random() * 10);
                if (a > 5) {
                    four_wheelers[i][j] = 1;
                }
            }
        }
    }

    void entry() {
        System.out.println("\nEnter the vehicle number: ");
        String v_no = sc.nextLine();
        System.out.println("\nEnter the owner's name: ");
        String name = sc.nextLine();
        System.out.println("\nEnter T for 2-Wheeler OR F for 4-Wheeler: ");
        char type = sc.next().charAt(0);
        String slot = null;
        if (type == 'T') {
            slot = getAvailableSlot(two_wheelers);
        } else if (type == 'F') {
            slot = getAvailableSlot(four_wheelers);
        }
        if (slot == null) {
            System.out.println("No available slot. Cannot enter the vehicle.");
            return;
        }

        Receipt r = new Receipt(name, v_no, slot, type);
        System.out.println("\nReceipt created!");
        System.out.println("Name: " + r.name);
        System.out.println("Vehicle Number: " + r.v_no);
        System.out.println("Slot: " + r.slot);
        System.out.println("Type: " + r.type);
        System.out.println("Entry Time: " + r.entry_time);
        System.out.println("Date: " + r.date);
        // exit(r); // Call the exit function after creating the receipt
    }

    void exit(Receipt receipt) {
        // receipt.setExitTime();
        System.out.println("\nVehicle exited!");
        System.out.println("Name: " + receipt.name);
        System.out.println("Vehicle Number: " + receipt.v_no);
        System.out.println("Slot: " + receipt.slot);
        System.out.println("Type: " + receipt.type);
        System.out.println("Entry Time: " + receipt.entry_time);
        // System.out.println("Exit Time: " + receipt.exit_time);
        System.out.println("Date: " + receipt.date);

        // Mark the slot as available again
        int row = receipt.slot.charAt(0) - 'A';
        int col = Integer.parseInt(receipt.slot.substring(1)) - 1;
        if (receipt.type.equals("T")) {
            two_wheelers[row][col] = 0;
        } else if (receipt.type.equals("F")) {
            four_wheelers[row][col] = 0;
        }
        System.out.println("Press M to get the amount of money to be recieved");
        String inputmoneychoice = sc.next();
        if (inputmoneychoice == "M") {
            System.out.println("Enter number of hours in 24H format");
            int endtimehour = sc.nextInt();

            System.out.println("Calculating the amount of money");
            moneyCal(endtimehour);
        }
    }

    void moneyCal(int endtime){
        LocalTime entry_time;
       // String starttime = String.valueOf(entry_time);
        int hours = endtime - receipt.entry_time.getHour(); 
        int money = hours * 20;
         
        System.out.println("The hourly cost of the vehicle is Rupees " + money);
    
    }

    String getAvailableSlot(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    return " " + (char) (i + 65) + "" + (j + 1);
                }
            }
        }
        return null;
    }


    System.out.println("2-Wheelers:");
        for (int i = 0; i < two_wheelers.length(); i++) {
            for (int j = 0; j < two_wheelers[i].length; j++) {
                if (two_wheelers[i][j] == 0) {
                    System.out.print((char) (i + 65) + "" + (j + 1) + " ");
                }
            }
        }
        System.out.println("\n4-Wheelers:");
        for (int i = 0; i < four_wheelers.length(); i++) {
            for (int j = 0; j < four_wheelers[i].length; j++) {
                if (four_wheelers[i][j] == 0) {
                    System.out.print((char) (i + 65) + "" + (j + 1) + " ");
                }
            }
        }
        System.out.println();
    }

/* DK*/

            for (int i = 0; i < two_wheelers.length; i++) {
            for (int j = 0; j < two_wheelers[i].length; j++) {
                if (slot.equals((char) (i + 65) + "" + (j + 1))) {
                    return new Receipt("", "", slot, 'T');
                }
            }
        }
        for (int i = 0; i < four_wheelers.length; i++) {
            for (int j = 0; j < four_wheelers[i].length; j++) {
                if (slot.equals((char) (i + 65) + "" + (j + 1))) {
                    return new Receipt("", "", slot, 'F');
                }
            }
        }
        return null;


    public static void main(String[] args) {
        n parking = new n();
        parking.populate();
        boolean exitProgram = false;
        while (!exitProgram) {
            System.out.println("\nEnter 1 for Vehicle Entry");
            System.out.println("Enter 2 for Vehicle Exit");
            System.out.println("Enter 3 to Display Available Slots");
            System.out.println("Enter 4 to Exit the Program");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    parking.entry();
                    break;
                case 2:
                    System.out.println("\nEnter the slot of the vehicle to exit (e.g., A1): ");
                    String slot = sc.next();
                    Receipt exitReceipt = parking.getReceiptBySlot(slot);
                    if (exitReceipt != null) {
                        parking.exit(exitReceipt);
                    } else {
                        System.out.println("Invalid slot. Vehicle not found.");
                    }
                    break;
                case 3:
                    parking.displayAvailableSlots();
                    break;
                case 4:
                    exitProgram = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }




//RV 

import java.util.*;
import java.time.*;
class Receipt
{
    String name;
    String v_no;
    String slot;
    String type;
    LocalTime entry_time;
    LocalDate date;
    Receipt(String n, String v, String s, char t)
    {
        name = n;
        v_no= v;
        slot=s;
        type= String.valueOf(t);
         date=LocalDate.now();
         entry_time=LocalTime.now();
    }
}
public class Parking
{
    Scanner sc = new Scanner(System.in);
    int [][] two_wheelers=new int [3][10];//3 rows 10 columns 2-d array created
    int [][] four_wheelers=new int [5][10];

    private void populate() //for dummy vehicles are present already
    {
        // 0 represents empty parking slots
        for(int i=0;i < two_wheelers.length;i++)//for getting number of rows
            for(int j=0;j < two_wheelers[i].length;j++)//for getting number of columns
            {
                int a = (int)  (Math.random() * 10);
                if (a > 3) two_wheelers[i][j] = 1;
            }
        for(int i=0;i < four_wheelers.length;i++)//for getting number of rows
            for(int j=0;j < four_wheelers[i].length;j++)//for getting number of columns
            {
                int a = (int)  (Math.random() * 10);
                if (a > 5) four_wheelers[i][j] = 1;
            }
    }

    void entry()
    {
        System.out.println("\n Enter the vehicle number:\t");
        String v_no = sc.nextLine();
        System.out.println("\n Enter the owner's name:\t");
        String name = sc.nextLine();
        System.out.println("\n Enter T for 2-Wheeler OR F for 4-Wheeler :\t");
        char type = sc.next().charAt(0);
        String slot= null;
        if (type=='T')
            slot = getAvailableSlot(two_wheelers);//getAvailableSlot function will traverse the 2-d array and look for the first zero occurring in the array
        else if(type=='F')
            slot =  getAvailableSlot(four_wheelers);

        Receipt r=new Receipt(name,v_no,slot,type);
    }
    String getAvailableSlot(int arr[][])
    {
        int i=0;
        int j =0;
        for(  i=0;i<arr.length;i++);
        for( j=0;j<arr[i].length;j++);
        {
            if(arr[i][j]==0)
            {
                return " "+(char)(i+65)+" "+(j+1);
            }
        }
        return null;
    }

}












/* V3 */
import java.util.*;
import java.time.*;

class Receipt {
    String name;
    String v_no;
    String slot;
    String type;
    LocalTime entry_time;
    LocalDate date;
    LocalTime exit_time;

    Receipt(String n, String v, String s, char t) {
        name = n;
        v_no = v;
        slot = s;
        type = String.valueOf(t);
        date = LocalDate.now();
        entry_time = LocalTime.now();
    }

    // void setExitTime() {
    // exit_time = LocalTime.now();
    // }
}

public class n {
    Scanner sc = new Scanner(System.in);
    int[][] two_wheelers = new int[3][10]; // 3 rows 10 columns 2D array created
    int[][] four_wheelers = new int[5][10];

    private void populate() {
        // 0 represents empty parking slots
        for (int i = 0; i < two_wheelers.length; i++) {
            for (int j = 0; j < two_wheelers[i].length; j++) {
                int a = (int) (Math.random() * 10);
                if (a > 3) {
                    two_wheelers[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < four_wheelers.length; i++) {
            for (int j = 0; j < four_wheelers[i].length; j++) {
                int a = (int) (Math.random() * 10);
                if (a > 5) {
                    four_wheelers[i][j] = 1;
                }
            }
        }
    }



    void entry() {
        System.out.println("\nEnter the vehicle number: ");
        String v_no = sc.nextLine();
        System.out.println("\nEnter the owner's name: ");
        String name = sc.nextLine();
        System.out.println("\nEnter T for 2-Wheeler OR F for 4-Wheeler: ");
        char type = sc.next().charAt(0);
        String slot = null;
        if (type == 'T') {
            slot = getAvailableSlot(two_wheelers);
        } else if (type == 'F') {
            slot = getAvailableSlot(four_wheelers);
        }
        if (slot == null) {
            System.out.println("No available slot. Cannot enter the vehicle.");
            return;
        }

        Receipt r = new Receipt(name, v_no, slot, type);
        System.out.println("\nReceipt created!");
        System.out.println("Name: " + r.name);
        System.out.println("Vehicle Number: " + r.v_no);
        System.out.println("Slot: " + r.slot);
        System.out.println("Type: " + r.type);
        System.out.println("Entry Time: " + r.entry_time);
        System.out.println("Date: " + r.date);
        // exit(r); // Call the exit function after creating the receipt
    }



    void exit(Receipt receipt) {
        // receipt.setExitTime();
        System.out.println("\nVehicle exited!");
        System.out.println("Name: " + receipt.name);
        System.out.println("Vehicle Number: " + receipt.v_no);
        System.out.println("Slot: " + receipt.slot);
        System.out.println("Type: " + receipt.type);
        System.out.println("Entry Time: " + receipt.entry_time);
        // System.out.println("Exit Time: " + receipt.exit_time);
        System.out.println("Date: " + receipt.date);

        // Mark the slot as available again
        int row = receipt.slot.charAt(0) - 'A';
        int col = Integer.parseInt(receipt.slot.substring(1)) - 1;
        if (receipt.type.equals("T")) {
            two_wheelers[row][col] = 0;
        } else if (receipt.type.equals("F")) {
            four_wheelers[row][col] = 0;
        }
        System.out.println("Press M to get the amount of money to be recieved");
        String inputmoneychoice = sc.next();
        if (inputmoneychoice == "M") {
            System.out.println("Enter number of hours in 24H format");
            int endtimehour = sc.nextInt();

            System.out.println("Calculating the amount of money");
            moneyCal(endtimehour);
        }
    }



    void moneyCal(int endtime) {
        LocalTime entry_time =  LocalTime.now();
        int inhour = (int)entry_time.getHour();
        // String starttime = String.valueOf(entry_time);
        int hours = endtime - inhour;
        int money = hours * 20;

        System.out.println("The hourly cost of the vehicle is Rupees " + money);

    }


/*
    String getAvailableSlot(int arr[][]) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    return " " + (char) (i + 65) + "" + (j + 1);
                }
            }
        }
        return null;
    
        System.out.println("2-Wheelers:");
        for (int i = 0; i < two_wheelers.length; i++) {
            for (int j = 0; j < two_wheelers[i].length; j++) {
                if (two_wheelers[i][j] == 0) {
                    System.out.print((char) (i + 65) + "" + (j + 1) + " ");
                }
            }
        }
        System.out.println("\n4-Wheelers:");
        for (int i = 0; i < four_wheelers.length; i++) {
            for (int j = 0; j < four_wheelers[i].length; j++) {
                if (four_wheelers[i][j] == 0) {
                    System.out.print((char) (i + 65) + "" + (j + 1) + " ");
                }
            }
        }
        

    // DK //////////////////////////////////////////////////////////// 

        for(int i = 0;i<two_wheelers.length;i++)
        {
            for (int j = 0; j < two_wheelers[i].length; j++) {
                if (slot.equals((char) (i + 65) + "" + (j + 1))) {
                    return new Receipt("", "", slot, 'T');
                }
            }
        }
        for( int i = 0;i<four_wheelers.length;i++)
        {
            for (int j = 0; j < four_wheelers[i].length; j++) {
                if (slot.equals((char) (i + 65) + "" + (j + 1))) {
                    return new Receipt("", "", slot, 'F');
                }
            }
        }
        return null;
    }
*/


    String getAvailableSlot(int arr[][]) {

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] == 0) {
                    return " " + (char) (i + 65) + "" + (j + 1);
                }
            }
        }
        return null;
    }


void displayAvailableSlots() {
        System.out.println("\nAvailable Slots:");
        System.out.println("2-Wheelers:");
        for (int i = 0; i < two_wheelers.length; i++) {
            for (int j = 0; j < two_wheelers[i].length; j++) {
                if (two_wheelers[i][j] == 0) {
                    System.out.print((char) (i + 65) + "" + (j + 1) + " ");
                }
            }
        }
        System.out.println("\n4-Wheelers:");
        for (int i = 0; i < four_wheelers.length; i++) {
            for (int j = 0; j < four_wheelers[i].length; j++) {
                if (four_wheelers[i][j] == 0) {
                    System.out.print((char) (i + 65) + "" + (j + 1) + " ");
                }
            }
        }
        System.out.println();
    }




    public static void main(String[] args) {
        n parking = new n();
        parking.populate();
        boolean exitProgram = false;
        while (!exitProgram) {
            System.out.println("\nEnter 1 for Vehicle Entry");
            System.out.println("Enter 2 for Vehicle Exit");
            System.out.println("Enter 3 to Display Available Slots");
            System.out.println("Enter 4 to Exit the Program");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    parking.entry();
                    break;
                case 2:
                    System.out.println("\nEnter the slot of the vehicle to exit (e.g., A1): ");
                    String slot = sc.next();
                    Receipt exitReceipt = parking.getReceiptBySlot(slot);
                    if (exitReceipt != null) {
                        parking.exit(exitReceipt);
                    } else {
                        System.out.println("Invalid slot. Vehicle not found.");
                    }
                    break;
                case 3:
                    parking.displayAvailableSlots();
                    break;
                case 4:
                    exitProgram = true;
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }



    Receipt getReceiptBySlot(String slot) {
        for (int i = 0; i < two_wheelers.length; i++) {
            for (int j = 0; j < two_wheelers[i].length; j++) {
                if (slot.equals((char) (i + 65) + "" + (j + 1))) {
                    return new Receipt("", "", slot, 'T');
                }
            }
        }
        for (int i = 0; i < four_wheelers.length; i++) {
            for (int j = 0; j < four_wheelers[i].length; j++) {
                if (slot.equals((char) (i + 65) + "" + (j + 1))) {
                    return new Receipt("", "", slot, 'F');
                }
            }
        }
        return null;
    }
}
