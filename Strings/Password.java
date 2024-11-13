//Jason Wu 114474379
package jason.Strings;

import java.util.Scanner;

public class Password {
	// Check if a user entered string is a valid password: contains number, lower
	// and upper case characters and a special character, with a length of at least
	// 8 chars.
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a password: ");
			String password = input.next();

			if (password.length() < 8) {
				System.out.print("invalid password");
			} else {
				boolean lower = false;
				boolean higher = false;
				boolean special = false;
				boolean number = false;

				for (int i = 0; i < password.length(); i++) {
					String s = password.substring(i, i + 1);
					if (s.matches("[a-z]{1}")) {
						lower = true;
					} else if (s.matches("[A-Z]{1}")) {
						higher = true;
					} else if (s.matches("[\\d]{1}")) {
						number = true;
					} else if (s.matches("[!@#$%^&*]{1}")) {
						special = true;
					}

				}
				if (lower && higher && number && special) {
					System.out.print("valid password");
				} else {
					System.out.print("invalid password");
				}
			}
		}
	}
}
