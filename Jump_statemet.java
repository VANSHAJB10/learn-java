//Continue statement

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
