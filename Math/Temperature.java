//Jason Wu 114474379
/*
Temperature.java: How hot is it outside? The temperature alone is not enough to provide the answer. Other factors including wind speed, relative humidity, 
and sunshine play important roles in determining coldness outside. In 2001, the National Weather Services (NWS) implemented the new wind-chill temperature 
to measure the coldness using the temperature and wind speed. The formula is t_wc=35.74 + 0.6215 * t_a - 35.75 * v^0.16 + 0.4275 * t_a * v^0.16
Where t_a  is the outside temperature measured in degree Fahrenheit, v is the speed measured in miles per hour, and  t_wc   is the wind-chill temperature. The 
formula cannot be used for windspeed below 2 mph or temperature below -58 Fahrenheit or above 41 Fahrenheit.

Write a program that prompts the user to �Enter a temperature between -58 Fahrenheit and 41 Fahrenheit and a wind speed greater than or equal to 2 then displays 
the wind-chill temperature: �. Use Math.pow(a, b) to compute   v^0.16. 
 */
package jason;

import java.util.Scanner;

public class Temperature {
	public static void main(String[] args) {

		double t_a, v, t_wc;

		System.out.print("Enter a temperature between -58 and 41 fahrenheit?: ");
		try (Scanner input = new Scanner(System.in)) {
			t_a = input.nextDouble();
		}
		System.out.print("Enter a wind speed greater than or equal to 2: ");
		try (Scanner input1 = new Scanner(System.in)) {
			v = input1.nextDouble();
		}
		t_wc = 35.74 + 0.6215 * t_a - 35.75 * Math.pow(v, 0.16) + 0.4275 * t_a * Math.pow(v, 0.16);

		System.out.println("Wind-chill temperature: " + t_wc);
	}
}