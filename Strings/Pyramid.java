//Jason Wu 114474379
package jason.Strings;

import java.util.Scanner;

public class Pyramid {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the number of lines: ");
			int n = input.nextInt();
			// iterates over the rows
			for (int i = 1; i <= n; i++) {
				// prints the prefix spaces
				for (int j = 1; j <= n - i; j++)
					System.out.print("\t");
				// prints the increasing sequence (every new number is being multiplied by 2)
				int pow = 1;
				for (int j = 1; j < i; j++) {
					System.out.print(pow + "\t");
					pow *= 2;
				}

				pow /= 4;
				for (int j = i - 1; j > 1; j--) {
					System.out.print(pow + "\t");
					pow /= 2;
				}

				System.out.println();

			}
		}

	}

}
