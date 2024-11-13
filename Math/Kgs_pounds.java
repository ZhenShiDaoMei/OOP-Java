//Jason Wu 114474379 lab5 9/17/21
/*Write a program that displays the following two tables side-by-side 
* (note that 1 kilogram is approximately 2.2 pounds):
* Kilograms  Pounds  Pounds  Kilograms
* 1          2.2     20      9.09
* 3          6.6     25      11.36
* ...
* 197        433.4   510     231.82
* 199        437.8   515     234.09
 */
package jason.Math;

public class Kgs_pounds {
	public static void main(String[] args) {
		System.out.println("Kilograms| Pounds | Pounds |Kilograms");
		for (int i = 0; i < 100; i++) {
			int initialkilogram = 2 * i + 1;
			double finalpound = (int) (initialkilogram * 2.2 * 10) / 10.0;

			int initialpound = 5 * i + 20;
			double finalkilogram = (int) (initialpound / 2.2 * 100) / 100.0;
			// extra work just to make all the numbers line up properly
			if (initialkilogram <= 4) {
				System.out.println("  " + initialkilogram + "         " + finalpound + "       " + initialpound + "       " + finalkilogram);
			} else if (5 <= initialkilogram && initialkilogram <= 9) {
				System.out.println("  " + initialkilogram + "         " + finalpound + "      " + initialpound + "       " + finalkilogram);
			} else if (11 <= initialkilogram && initialkilogram <= 31) {
				System.out.println("  " + initialkilogram + "        " + finalpound + "      " + initialpound + "       " + finalkilogram);
			} else if (32 <= initialkilogram && initialkilogram <= 45) {
				System.out.println("  " + initialkilogram + "        " + finalpound + "      " + initialpound + "      " + finalkilogram);
			} else if (47 <= initialkilogram && initialkilogram <= 99) {
				System.out.println("  " + initialkilogram + "        " + finalpound + "     " + initialpound + "      " + finalkilogram);
			} else if (101 <= initialkilogram && initialkilogram <= 210) {
				System.out.println("  " + initialkilogram + "       " + finalpound + "     " + initialpound + "      " + finalkilogram);
			}
		}
	}
}
