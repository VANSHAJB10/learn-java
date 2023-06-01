/* A group of A friends recently participated on CodeChef in 2 different contests.
Each friend participated only in 1 contest.
The contests participated by them are give in the form of a list - check the sample inputs below.
Output the count of participants in each contest - check the output format below.

Input Format
First line will contain T, number of test cases. Then the test cases follow.
Each test case contains of two lines of input.
First line of input contains the count of participants - A.
Second line of input contains A contest codes in which each friend participated. Contests were necessarily one of START38 or LTIME108

Output Format:
For each test case, output two integers in a single new line - 
the first integer should be the count of participants in START38, and the second integer should be the count of participants in LTIME108. */

import java.util.HashMap;
import java.util.Scanner;

public class ContestParticipants {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt(); // Number of test cases

        for (int i = 0; i < t; i++) {
            int a = scanner.nextInt(); // Number of participants
            scanner.nextLine(); // Consume the newline character

            String contestCodes = scanner.nextLine(); // Contest codes for participants

            HashMap<String, Integer> contestCount = getContestCount(a, contestCodes);
            System.out.println(contestCount.get("START38") + " " + contestCount.get("LTIME108"));
        }
    }

    private static HashMap<String, Integer> getContestCount(int a, String contestCodes) {
        HashMap<String, Integer> contestCount = new HashMap<>();
        contestCount.put("START38", 0);
        contestCount.put("LTIME108", 0);

        String[] codes = contestCodes.split(" ");

        for (String code : codes) {
            if (code.equals("START38")) {
                contestCount.put("START38", contestCount.get("START38") + 1);
            } else if (code.equals("LTIME108")) {
                contestCount.put("LTIME108", contestCount.get("LTIME108") + 1);
            }
        }

        return contestCount;
    }
}
