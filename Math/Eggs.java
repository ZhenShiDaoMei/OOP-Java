//Jason Wu 114474379
/*Eggs.java: Stony Brook Dairy Farm sells organic brown eggs to local customers. It charges $3.25 for a dozen eggs, or 45 cents for individual eggs that are not part of a dozen. 
Write a program that prompts a user for �The number of eggs in the order (integer): � and then display the amount owed with a full explanation. For example, if the input is 27, the output is:
You ordered 27 eggs. That�s 2 dozen at $3.25 per dozen and 3 loose eggs at 45 cents for a total of $7.85.
 */
package jason.Math;

import java.util.Scanner;

public class Eggs {
	public static void main(String[] args) {

		int dozen, single, eggs, rem;
		double dozen_eggs, single_eggs, total;

		System.out.print("how many eggs did you buy?: ");
		try (Scanner input = new Scanner(System.in)) {
			eggs = input.nextInt();
		}
		dozen = eggs / 12;
		rem = eggs % 12;
		single = rem / 1;
		dozen_eggs = dozen * 3.25;
		single_eggs = single * 0.45;
		total = dozen_eggs + single_eggs;

		System.out.println("You ordered " + eggs + " eggs. That's " + dozen + " dozen at $3.25 per dozen and " + single
				+ " loose eggs at 45 cents for a total of " + total + ".");
	}
}