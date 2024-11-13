//Jason Wu 114474379 lab5 9/17/21
/*counting positive and negative numbers and computing the average of numbers. Write a program that reads an unspecified number of integers, 
 * determines how many positive and negative values have been read, and computes the total and average of the input values, not counting zeros. 
 * Your program ends with the input 0. Display the average as a floating-point number.
 */

package jason.Math;

import java.util.Scanner;

public class Counting {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int total = 0;
		int positive_nums = 0;
		int negative_nums = 0;
		// ask user for inputs, and gives an option for them to stop
		while (true) {
			System.out.print("Enter integers, type '0' to quit: ");
			int num = input.nextInt();
			if (num == 0)
				break;
			if (num > 0)
				positive_nums++;
			else
				negative_nums++;
			total += num;
		}
		// give results of all the inputs
		System.out.println("Number of positive integers: " + positive_nums);
		System.out.println("Number of negative integers: " + negative_nums);
		System.out.println("Total sum integers: " + total);
		System.out.println("Average of all inputed integers: " + (total / (1.0 * positive_nums + negative_nums)));
		input.close();
	}
}