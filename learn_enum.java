/*
1--> enums are named constants.
Instead of using numbers as constants we use enums to make char/string as constants.

2--> Each object of enum has a index as we have in arrays. It can be printed using .ordinal() method  [CHECK LINE 21]
*/

enum Status{
	Running, Failed, Pending, Success;
}

public class Demo {
    public static void main(String[] args) {

    	// int i=5;   <-- As we do here  ... type variable_name = value ... same is with enum
      	Status s= Status.Running;   // Type Variable_name = value  ... here, value is accessed as a class object.
      	Status s= Status.Failed;
      	Status s= Status.NoIdea;    /*gives error as there is no such object named NoIdea*/

      	System.out.println(s);
      	System.out.println(s.ordinal());
    	
      /*  *****SEE AGAIN*****   */
    	  Status[] ss=Status.values();   /*  .values() method gives an array of the enum values  */
    	  System.out.println(ss);   // returns a hexadecimal value  ... [address of array]
        System.out.println(ss[0]);    // prints the value at index 0.
    	
      /* To print all the elements in ths ss aray*/
    	for(Status s:ss)
    	{
    		System.out.println(s);   
    		System.out.println(s+" : "+s.ordinal());  //along with index no.
    	}       
    }
}
