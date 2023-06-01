/* Create an Array for the following values "Monday", "Tuesday", "Wednesday", and "Thursday", and display the last two elements of the array in separate lines. */

class Solution
{
	public static void main (String[] args)
	{
		String[] week = {"Monday", "Tuesday", "Wednesday", "Thursday"};
		System.out.println(week[(week.length -2)]);
		System.out.print(week[(week.length -1)]);
	}
}
