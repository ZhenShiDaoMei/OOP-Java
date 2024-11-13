//Jason Wu 114474379
package jason.Strings;

import java.util.Scanner;

public class LongestCommonPrefix {
	public static void main(String[] args) {
		System.out.print("Enter your first string: ");
		try (Scanner input = new Scanner(System.in)) {
			String s1 = input.nextLine();

			System.out.print("Enter your second string: ");
			try (Scanner input2 = new Scanner(System.in)) {
				String s2 = input2.nextLine();

				int lengthS1 = s1.length();
				int lengthS2 = s2.length();
				int mlength = Math.max(lengthS1, lengthS2);

				if (s1.charAt(0) != s2.charAt(0)) {
					System.out.println(s1 + " and " + s2 + " don't have a common prefix.");
				} else {
					System.out.print("The common prefix: ");
				}

				for (int i = 0; i <= mlength; i++) {
					if (s1.charAt(i) == s2.charAt(i)) {
						System.out.print(s1.charAt(i));
					} else {
						break;
					}
				}
			}
		}

	}
}