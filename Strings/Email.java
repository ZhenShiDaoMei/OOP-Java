//Jason Wu 114474379
package jason.Strings;

import java.util.Scanner;

public class Email {
	// Check if a user entered string is a valid email address.
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a email: ");
			String email = input.next();

			if (email.matches("(.)+@(.)+")) {
				System.out.print("valid email");
			} else {
				System.out.print("invalid email");
			}
		}
	}

}
