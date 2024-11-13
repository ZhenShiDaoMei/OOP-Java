//Jason Wu 114474379
package jason;

import java.util.Scanner;

public class URL {
	// Check if a user entered string is a valid URL (http://www.cs.stonybrook.edu
	// or https://google.com).
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter a URL: ");
			String url = input.next();

			if (url.matches("http[s]{0,1}://www.(.){2,}\\.(.){2,3}")) {
				System.out.print("valid URL");
			} else {
				System.out.print("invalid URL");
			}
		}
	}

}
