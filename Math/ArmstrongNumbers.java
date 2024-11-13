//Jason Wu 114474379
package jason.Math;

import java.util.Scanner;

public class ArmstrongNumbers {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("Enter the lower limit: ");
			int lower = input.nextInt();
			System.out.print("Enter the upper limit: ");
			int upper = input.nextInt();
			System.out.print("The Armstrong numbers between " + lower + " and " + upper + " are: ");
			for (int i = lower; i <= upper; i++)
				if (isArmstrong(i))
					System.out.print(i + " ");
		}
	}

	public static boolean isArmstrong(int n) {
		int oldn = n;
		String s = "" + n;
		int lenght = s.length();
		int sum = 0;
		while (n > 0) {
			sum += (int) (Math.pow(n % 10, lenght));
			n /= 10;
		}
		return sum == oldn;
	}

}
