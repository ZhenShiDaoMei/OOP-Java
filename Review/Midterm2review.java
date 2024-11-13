package jason.Review;

public class Midterm2review {
	public static void main(String[] args) {
		try (// Prompt the user to enter a password
				java.util.Scanner input = new java.util.Scanner(System.in)) {
			System.out.print("Enter a string for password: ");
			String s = input.nextLine();
			if (isValidPassword(s)) {
				System.out.println("Valid password");
			} else {
				System.out.println("Invalid password");
			}
		}
	}

	public static boolean isValidPassword(String password) {
		return password.length() > 8 && password.matches("[0-9a-zA-Z]*") && password.matches(".*\\d.*\\d.*");
	}

}
