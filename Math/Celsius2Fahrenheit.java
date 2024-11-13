//Jason Wu 114474379 lab2 9/01/21
/*
Write a Java program in the Eclipse IDE that reads a Celsius temperature as a double from the console, then converts it to Fahrenheit and displays the result.
The formula for the conversion is as follows:
fahrenheit = (9.0/5) * celsius + 32
Hint: 9.0/5 is 1.8 in Java as opposed to 9/5, which is 1.
Here is a sample run:
Enter a degree in Celsius: "43" (Enter) 
43 in Celsius is 109.4 in Fahrenheit
 */
package jason.Math;

import java.util.Scanner;

public class Celsius2Fahrenheit {
	public static void main(String[] args) {

		// ask for degree in Celsius
		double Celsius, Fahrenheit;
		System.out.print("What is the degrees in Celsius?: ");
		try (Scanner input = new Scanner(System.in)) {
			Celsius = input.nextInt();
		}
		// calculate Fahrenheit
		Fahrenheit = (9.0 / 5) * Celsius + 32;

		// print out result
		System.out.println(Celsius + " in Celsius is " + Fahrenheit + " in Fahrenheit.");

	}
}