//Jason Wu 114474379 lab4 9/17/21
/*
 * International Standard Book Number (ISBN) consists of 10 digits d1d2d3d4d5d6d7d8d9d10. The last digit d10 is a checksum, which is calculated from the other nine
 * digits using the following formula: ( d1 x 1 + d2 x 2 + d3 x 3+ d4 x 4 + d5 x 5 + d6 x 6 + d7 x 7 + d8 x 8 + d9 x 9) % 11 If the checksum is 10, the last digit
 * is denoted X according to the ISBN convention. Write a program that prompts the user to enter the first 9 digits and displays the 10-digit ISBN (including leading zeros). 
 * Your program should read the input as an integer. For example, if you enter 013601267, the program should display 0136012671.
 */
package jason.Math;

import java.util.Scanner;

public class ISBN {
        public static void main(String[] args) {

                // ask for ISBN #
                System.out.println("Enter the first 9 digits of the ISBN (put spaces between numbers and include 0): ");
                try (Scanner input1 = new Scanner(System.in)) {
                        int d1 = input1.nextInt();
                        int d2 = input1.nextInt();
                        int d3 = input1.nextInt();
                        int d4 = input1.nextInt();
                        int d5 = input1.nextInt();
                        int d6 = input1.nextInt();
                        int d7 = input1.nextInt();
                        int d8 = input1.nextInt();
                        int d9 = input1.nextInt();
                        int d10;
                        d10 = ((d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 + d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11);

                        // print result
                        System.out.print(d1 + "" + d2 + "" + d3 + "" + d4 + "" + d5 + "" + d6 + "" + d7 + "" + d8 + ""
                                        + d9 + "" + d10);
                }
        }
}