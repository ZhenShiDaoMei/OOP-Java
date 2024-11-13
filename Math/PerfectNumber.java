//Jason Wu 114474379
package jason.Math;

import java.util.Scanner;

public class PerfectNumber {
	public static void main(String[] args) {
		int testnum, dividable, totalsum, limit;
		System.out.print("Give me a limit: ");
		try (Scanner input = new Scanner(System.in)) {
			limit = input.nextInt();
		}
		System.out.print("The perfect numbers below " + limit + " are: ");
		for (int j = 1; j <= limit; j++) {
			testnum = j;
			totalsum = 0;
			for (int i = 1; i < testnum; i++) {
				dividable = testnum % i;
				if (dividable == 0) {
					totalsum += i;
				}
			}
			if (totalsum == testnum) {
				System.out.print(testnum + " ");
			}
		}
	}
}
