//Jason Wu 114474379
/*Write a program that displays a menu where the user selects to make weight, 
 *distance and temperature conversions:
A - convert pounds to kilos
B - convert kilos to pounds
C - convert kilometers to miles
D - convert miles to kilometers
E - convert Celsius to Fahrenheit
F - convert Fahrenheit to Celsius
G - Exit
The user will input one option and the program will ask the use an amount. Example:
Enter your option: A
Enter a quantity in pounds: 200
200 pounds is 90.7185 kgs
Write 6 methods that get as inputs the number entered by the user and return the result 
used by the program described above:
public static double poundsToKilos(double pounds) {...}
public static  double kilosToPounds(double pounds) {...}
public static  double kmToM(double pounds) {...}
public static  double mToKm(double pounds) {...}
public static double celsiusToFarenheit(double pounds) {...}
public static double farenheitToCelsius(double pounds) {...}
 * 
 */
package jason.Math;

import java.util.Scanner;

public class Conversions {
	public static void main(String[] args) {
		System.out.println("A - convert pounds to kilos");
		System.out.println("B - convert kilos to pounds");
		System.out.println("C - convert kilometers to miles");
		System.out.println("D - convert miles to kilometers");
		System.out.println("E - convert Celsius to Fahrenheit");
		System.out.println("F - convert Fahrenheit to Celsius");
		System.out.println("G - Exit");
		char letter;
		System.out.print("Enter your option: ");
		try (Scanner input = new Scanner(System.in)) {
			letter = input.nextLine().charAt(0);
			double pounds, kilos, kilometers, miles, celsius, fahrenheit;
			while (letter != 'G') {
				if (letter == 'A') {
					System.out.print("Enter your quantity in pounds: ");
					pounds = input.nextDouble();
					kilos = poundsToKilos(pounds);
					System.out.println(pounds + " pounds is " + kilos + " kgs.");
					break;
				}

				else if (letter == 'B') {
					System.out.print("Enter your quantity in kilometers: ");
					kilos = input.nextDouble();
					pounds = kilosToPounds(kilos);
					System.out.println(kilos + " kilos is " + pounds + " pounds.");
					break;
				}

				else if (letter == 'C') {
					System.out.print("Enter your quantity in kilometers: ");
					kilometers = input.nextDouble();
					miles = kilometersToMiles(kilometers);
					System.out.println(kilometers + " kilometers is " + miles + " miles.");
					break;
				}

				else if (letter == 'D') {
					System.out.print("Enter your quantity in miles: ");
					miles = input.nextDouble();
					kilometers = milesToKilometers(miles);
					System.out.println(miles + " miles is " + kilometers + " kilometers.");
					break;
				}

				else if (letter == 'E') {
					System.out.print("Enter your quantity in celsius: ");
					celsius = input.nextDouble();
					fahrenheit = celsiusToFahrenheit(celsius);
					System.out.println(celsius + " celsius is " + fahrenheit + " fahrenheit.");
					break;
				}

				else if (letter == 'F') {
					System.out.print("Enter your quantity in fahrenheit: ");
					fahrenheit = input.nextDouble();
					celsius = fahrenheitToCelsius(fahrenheit);
					System.out.println(fahrenheit + " fahrenheit is " + celsius + " celsius.");
					break;
				}

			}
		}
	}

	public static double poundsToKilos(double pounds) {
		return pounds * 0.453592;
	}

	public static double kilosToPounds(double kilos) {
		return kilos * 2.20462;
	}

	public static double kilometersToMiles(double kilometers) {
		return kilometers * 0.621371;
	}

	public static double milesToKilometers(double miles) {
		return miles * 1.60934;
	}

	public static double celsiusToFahrenheit(double celsius) {
		return (9.0 / 5) * celsius + 32;
	}

	public static double fahrenheitToCelsius(double fahrenheit) {
		return (5.0 / 9) * (fahrenheit - 32);
	}

}