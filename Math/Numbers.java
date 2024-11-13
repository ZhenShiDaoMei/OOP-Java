//Jason Wu 114474379
/*Write a program that prompts the user to enter an integer and determine whether it is divisible by 5 and 6, whether it 
 * is divisible by 5 or 6, and whether it is divisible by 5 or 6, but not both. Here is a sample run of the program:
Enter an integer: 10
Is 10 divisible by 5 and 6? false
Is 10 divisible by 5 or 6? true
Is 10 divisible by 5 or 6, but not both? true 
 */
package jason.Math;

import java.util.Scanner;

public class Numbers {
	public static void main(String[] args) {

		int Integer, remainder_five, remainder_six;
		boolean result1, result2, result3;
		System.out.print("Enter a integer: ");
		try (Scanner input = new Scanner(System.in)) {
			Integer = input.nextInt();
		}
		remainder_five = Integer % 5;
		remainder_six = Integer % 6;

		if (remainder_five == 0 && remainder_six == 0) {
			result1 = true;
		} else {
			result1 = false;
		}

		if (remainder_five == 0 || remainder_six == 0) {
			result2 = true;
		} else {
			result2 = false;
		}

		if (remainder_five == 0 ^ remainder_six == 0) {
			result3 = true;
		} else {
			result3 = false;
		}

		System.out.println("Is " + Integer + " divisible by 5 and 6? " + result1);
		System.out.println("Is " + Integer + " divisible by 5 or 6? " + result2);
		System.out.println("Is " + Integer + " divisible by 5 or 6, but not both? " + result3);
	}
}