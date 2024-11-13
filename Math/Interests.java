//Jason Wu 114474379
package jason.Math;

import java.util.Scanner;

public class Interests {
	public static void main(String[] args) {

		double loan_amount, interest, monthpayment, years, monthinterest, totalpay;
		System.out.print("how much is the loan amount?: ");
		try (Scanner input = new Scanner(System.in)) {
			loan_amount = input.nextDouble();
		}
		System.out.print("how many years to pay off the loan?: ");
		try (Scanner input1 = new Scanner(System.in)) {
			years = input1.nextDouble();
		}
		System.out.println("Interest Rate     Monthly Payment    Total Payment");
		for (double i = 0; i <= 24; i++) {
			interest = (5 + (i / 8));
			monthinterest = interest / 1200;
			monthpayment = loan_amount * monthinterest / (1 - (Math.pow(1 / (1 + monthinterest), years * 12)));
			totalpay = (monthpayment * years * 12) * 100;
			totalpay = Math.floor(totalpay) / 100;
			monthpayment = (loan_amount * monthinterest / (1 - (Math.pow(1 / (1 + monthinterest), years * 12)))) * 100;
			monthpayment = Math.floor(monthpayment) / 100;
			System.out.print(interest + "%   " + monthpayment + "   " + totalpay);
			System.out.println();
		}

	}
}