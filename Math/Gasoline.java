//Jason Wu 114474379 lab3 9/07/21
/*
Gasoline.java: Write a program that reads the following arguments, in this order:
a. minutes: the number of minutes a car is driven on a long track
b. mph: the constant speed of the car, given in miles per hour
c. mpg: the fuel efficiency of the car, given in miles per gallon
The function computes and prints the number of gallons of gasoline consumed by a car driven down a long track over the given time period. Use double division. Examples:
Enter the number of minutes: 75
Enter the constant speed of the car (m/h): 35.2
Enter the fuel efficiency of the car (m/g): 20.6
Consumed gas for the period (in gallons): 2.1359223300970873
Enter the number of minutes: 60
Enter the constant speed of the car: 60
Enter the fuel efficiency of the car: 30
2.0
Enter the number of minutes: 164.3
Enter the constant speed of the car: 45.2
Enter the fuel efficiency of the car: 19.41
6.376747381075049
Hint: minutes/60 * mph * 1/mpg
*/
package jason.Math;

import java.util.Scanner;

public class Gasoline {
    public static void main(String[] args) {

        // define minutes mph and mpg and ask for inputs for the following variables
        double minutes, mph, miles_per_gallon, consumed_gas;
        System.out.print("How long were you driving?: ");
        try (Scanner input = new Scanner(System.in)) {
            minutes = input.nextDouble();
        }
        System.out.print("How fast were you driving the car?: ");
        try (Scanner input1 = new Scanner(System.in)) {
            mph = input1.nextDouble();
        }
        System.out.print("What's the fuel efficiency of your car?: ");
        try (Scanner input2 = new Scanner(System.in)) {
            miles_per_gallon = input2.nextDouble();
        }

        // calculate the amount of gas consumed
        consumed_gas = minutes / 60 * mph * 1 / miles_per_gallon;

        // print result
        System.out.println("Consumed gas for the period (in gallons): " + consumed_gas);
    }
}