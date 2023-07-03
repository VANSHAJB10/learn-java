/*Question*/
Debug the given code as per the problem:
Problem:
There is a quiz in Alice and Bob's class today.
The teacher asks the 1st  2 questions to Alice. Bob gets asked the next 2 questions. Alice gets asked the next 2 questions and so on.
The following 2 conditions also exist

If Alice is unable to answer his question - then Bob can answer the question.
Similarly, if Bob is unable to answer his question - then Alice can answer his question
Each question is necessarily answered correctly by either Bob or Alice
If the questions answered correctly by Alice and Bob are A and B respectively - who will the teacher ask the next question?

Input Format
The first line contains a single integer T — the number of test cases. Then the test cases follow.
The first line of each test case contains two integers A and B

Output Format:
For each test case, determine which student will be asked the next question by the teacher.

You may print each character of Alice and Bob in uppercase or lowercase.


provided Code:
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
			Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int i=0; i<t;i++){
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    if(((a+b)%2)==0)
		        System.out.println("Alice");
		    else
		        System.out.println("Bob");
		}
		sc.close();
	}
}
