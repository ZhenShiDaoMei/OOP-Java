//Jason Wu 114474379
/*Triangle.java: Write a program that reads three edges (sides) for a triangle and classify it as Equilateral (i.e., all 
sides are equal), Scalene (all sides are different), Isosceles (only 2 sides are equal) if the input is valid. The input 
is valid if the sum of every pair of two edges is greater than the remaining edge. You may assume that the user inputs a positive value for the edges.
Here are 4 sample runs:
Side1: 3
Side2: 3
Side3: 9
Output: Invalid input!
Side1: 3
Side2: 3
Side3: 3
Output: Equilateral
 
Side1: 10
Side2: 10
Side3: 1
       Output: Isosceles
Side1: 3
Side2: 4
Side3: 5
      Output: Scalene
 * 
 */
package jason;

import java.util.Scanner;

public class triangle {
	public static void main(String[] args) {

		double side1, side2, side3;
		boolean equilateral, isosceles, scalene;

		System.out.print("Enter side1: ");
		try (Scanner input = new Scanner(System.in)) {
			side1 = input.nextDouble();
		}
		System.out.print("Enter side2: ");
		try (Scanner input1 = new Scanner(System.in)) {
			side2 = input1.nextDouble();
		}
		System.out.print("Enter side3: ");
		try (Scanner input2 = new Scanner(System.in)) {
			side3 = input2.nextDouble();
		}
		equilateral = false;
		isosceles = false;
		scalene = false;

		if (side1 == side2 && side2 == side3) {
			equilateral = true;
		} else {
			equilateral = false;
		}
		if (side1 == side2 && side1 != side3 && side1 + side2 > side3) {
			isosceles = true;
		} else if (side3 == side2 && side1 != side3 && side3 + side2 > side1) {
			isosceles = true;
		} else if (side3 == side1 && side2 != side3 && side3 + side1 > side2) {
			isosceles = true;
		} else {
			isosceles = false;
		}
		if (side1 != side2 && side1 != side3 && side2 != side3) {
			scalene = true;
		} else {
			scalene = false;
		}

		if (equilateral == true) {
			System.out.print("Output: equilateral");
		} else if (isosceles == true) {
			System.out.print("Output: isosceles");
		} else if (scalene == true) {
			System.out.print("Output: scalene");
		}

	}
}