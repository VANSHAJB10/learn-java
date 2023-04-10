// To Check If String Contains Only Alphabets 

class Check {

	public static boolean isStringOnlyAlphabet(String str)
	{

		return ((str != null) && (!str.equals(""))
				&& (str.matches("^[a-zA-Z]*$")));
	}

	public static void main(String[] args)
	{

		System.out.println("Case 1:");
		String str1 = "HelloVanshaj";
		System.out.println("Input: " + str1);

		System.out.println("Output: " + isStringOnlyAlphabet(str1));

		System.out.println("\nCase 2:");
		String str2 = "VanshajB10";
		System.out.println("Input: " + str2);
		System.out.println("Output: " + isStringOnlyAlphabet(str2));

		System.out.println("\nCase 3:");
		String str3 = null;
		System.out.println("Input: " + str3);
		System.out.println("Output: " + isStringOnlyAlphabet(str3));

	}
}
