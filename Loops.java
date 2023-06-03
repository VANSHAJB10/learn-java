/*

To print this pattern:
*
**
***
****


--> outer loop = 4 times (no of lines)
--> inner loop for 'i'th line runs for i times (no of stars in each line)
--> print * each time
*/

public class Solution{
public static void main(String args[])
{
for (int line=1; line=<4 ; line++)
  {
  for(int star=1; stra<=line; star++)
    {
    system.out.print("*"); //NOT println
    }
    System.out.println():
  }
 }
}

/*
Print :
1
12
123
1234   */
public class halfpyramid {
         
         public static void main(String args[]){
            int n=4;
            for (int line=1 ; line<=n ; line++){
                for (int number =1; number<=line;number++){
                    System.out.print(number);
            }
            System.out.println();
         }
    }
}


/* break statements */
// A break statement can also be used to jump out of a loop.

// code that prints a series of numbers from 0 to 15 but it should stop if the number reaches 13.
class Main
{
	public static void main (String[] args)
	{
		for (int i = 0; i <= 15; i++) {
            if (i == 13) {
                break;
            }
            System.out.println(i);
        }
	}
}

/* continue statement */
/*   
The continue statement breaks one iteration, when executed, and continues with the next iteration in the loop. i.e., 
continue simply skips the remaining codeblock execution for an iteration.
*/

for (int i = 0; i < 6; i++) {
  if (i == 4) {
    continue;
  }
  System.out.println(i);
}

// skips the fifth iteration, because the value of i then is 4 and it satisfies the condition mentioned in the if statement
