/* Joy went to a shopping street and bought 6 electronic items costing different prices. 
The goods that he chose costed more than the money he has. 
Now, he have decided to remove the item costing maximum amount and replace it with another item whose price is same as the item costing minimum amount. 
Help Alice and display final prices on the screen.

Note: if more than one element cost maximum price, replace the first item.

Example 1:
Input: 250 1000 50 20 10 100
Output: 250 10 50 20 10 100

Example 2:
Input: 2500 2500 50 20 10 100
Output: 10 2500 50 20 10 100

Input Format

250 1000 50 20 10 100

Constraints

6 items prices (floating point) are required

Output Format

Prints the final prices of different items after replacing

Sample Output: 10 2500 50 20 10 100 */

import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int[] prices = new int[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 6; i++) {
            prices[i] = sc.nextInt();
        }
        int minPrice = Integer.MAX_VALUE;
        int maxPrice = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < prices.length; i++) {
            int price = prices[i];
            if (price < minPrice) {
                minPrice = price;
            }
            if (price > maxPrice) {
                maxPrice = price;
                maxIndex = i;
            }
        }
        prices[maxIndex] = minPrice;
        for (int element : prices)
            System.out.print(element + " ");
    }
}
