//Jason Wu 114474379
/*
 Write a program that reads in ten numbers and displays distinct numbers
 (i.e., if a number appears multiple times, it is displayed only once).

 Hint: Read a number and store it to an array if it is new. If the number is
 already in the array, discard it. After the input, the array contains the 
 distinct numbers. Keep a counter of the unique numbers.
 */
package jason.Arrays;

import java.util.Scanner;

public class DistinctNumbers {
	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		int[] nums = new int[10];

		int nextSpace = 0;

		boolean inNums = false;
		for (int i = 0; i < 10; i++) {
			System.out.print("Enter 10 numbers, you're on number " + (i + 1) + ": ");
			int num = in.nextInt();
			for (int j = 0; j < nextSpace; j++) {
				if (nums[j] == num) {
					inNums = true;
					break;
				}
			}
			if (!inNums) {
				nums[nextSpace++] = num;
			}
			inNums = false;
		}
		for (int i = 0; i < nextSpace; i++) {
			System.out.println(nums[i]);
		}
		in.close();

	}
}
