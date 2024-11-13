//Jason Wu 114474379 lab2 9/01/21
/*
Discount.java) A software company sells computer games for retail prices (all games are the same fixed price). Quantity discounts are given according to the following table:
Quantity:    Discount:
10�19        20%
20�49        30%
50�99        40%
100 or more    50%
Implement a program that asks to enter the fixed price that the number of packages purchased. The program should then display the amount of the discount (if any) and the total 
amount of the purchase after the discount.Examples

Imagine the fixed price is $100.00 and the client wants to buy 25 games. Therefore, the client will get a 30% discount. Therefore, the discounted price is now: $70.00

Input: 

Fixed price: $100.00
Quantity: 25 

Output:

Discount: 30%
Discounted price: $70.00
Discounted amount per unit: $30.00 
Total price: $70.00 * 25 = $1,750
 */
package jason.Math;

import java.util.Scanner;

public class Discount {
	public static void main(String[] args) {

		// ask for the fixed price
		double discount, fixed_price, discounted_price, games_purchased, total_price, discount_amount;
		System.out.print("What is the fixed price per each game?: ");
		try (Scanner input = new Scanner(System.in)) {
			fixed_price = input.nextInt();
		}
		// ask how many games being bought
		System.out.print("how many games are you buying?: ");
		try (Scanner input1 = new Scanner(System.in)) {
			games_purchased = input1.nextInt();
		}
		// find the discount
		discount = 0;
		if (10 <= games_purchased && games_purchased <= 19) {
			discount = 0.20;
		}
		if (20 <= games_purchased && games_purchased <= 49) {
			discount = 0.30;
		}
		if (50 <= games_purchased && games_purchased <= 99) {
			discount = 0.40;
		}
		if (100 <= games_purchased) {
			discount = 0.50;
		}

		// solve for discounted fixed price
		discount_amount = 0;
		discount_amount = discount * fixed_price;
		discounted_price = fixed_price - (discount_amount);

		// total price
		total_price = discounted_price * games_purchased;

		// print results
		System.out.println(
				"Discount: " + discount * 100 + "%" +
						", Discounted price: $" + discounted_price +
						", Discounted amount per unit: $" + discount_amount +
						", Total price: $" + discounted_price + " * " + games_purchased + " = $" + total_price);
	}
}