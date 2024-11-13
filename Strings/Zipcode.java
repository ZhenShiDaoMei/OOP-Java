//Jason Wu 114474379
package jason.Strings;

import java.util.Scanner;

public class Zipcode {
	// Check if a user entered string is a valid US postal code.
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a Zipcode: ");
			String zipcode = input.next();

			if (zipcode.matches("[0-9]{5}")) {
				System.out.print("valid zipcode");
			} else {
				System.out.print("invalid zipcode");
			}
		}
	}
}
