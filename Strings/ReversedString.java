//Jason Wu 114474379 lab5 9/17/21
//Display a String read from the user reversed.

package jason.Strings;

import java.util.Scanner;

public class ReversedString {
	public static void main(String[] args) {
		try (Scanner scanner = new Scanner(System.in)) {
			System.out.println("Input a String: ");
			String input = scanner.nextLine();
			String reversedString = "";

			for (int i = 0; i < input.length(); i++) {
				reversedString = input.substring(i, i + 1) + reversedString;
			}
			// print reversed string
			System.out.println("Reversed String + " + reversedString);
		}
	}
}