//Jason Wu 114474379
package jason.Strings;

import java.util.Scanner;

public class Palindrome {
	// Check if a user entered string is a palindrome.
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a String: ");
			String string = input.next();

			int backIndex = string.length() - 1;

			boolean isPalin = true;

			for (int i = 0; i < string.length() / 2; i++) {
				if (string.charAt(i) != string.charAt(backIndex)) {
					isPalin = false;
					break;
				}
				backIndex--;
			}

			if (isPalin) {
				System.out.print("String is a palindrome");
			} else {
				System.out.print("String is not a palindrome");
			}
		}
	}

}
