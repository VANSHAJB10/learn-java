// Continue statement

import java.util.*;
public class Jump {

	public static void main(String args[])
	{
		for (int i = 0; i <= 15; i++) {
			if (i == 10 || i == 12) {

				/* Using continue statement to skip the execution of loop when i==10 or i==12 */
				continue;
			}
			System.out.print(i + " ");
		}
	}
}


// Continue statement inside the While loop
public class Jump {
	public static void main(String args[])
	{
		int count = 20;
		while (count >= 0) {
			if (count == 7 || count == 15) {
				count--;
				/* Decrementing variable initialized above showing continue execution inside loop skipping when count==7 or count==15*/
				continue;

			}
			System.out.print(count + " ");
			count--;
		}
	}
}
