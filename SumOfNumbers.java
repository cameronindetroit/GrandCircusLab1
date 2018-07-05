package learningJava;

import java.util.Scanner;

/*
 * Simple program to take two numbers and calculate the sums of 
 * the 1st,2nd and 3rd digits in each number
 * These sums are then compared to make sure the sums are equal
 * If not the program logs false to console, and true if they match
 * 
 * ------- Program was tested with '543' & '456' to verify true answer --------
 * 
 * 
 * Program does not check if characters entered are numbers (Ran out of time)
 * instead it uses the .nextInt() method to allow only an integer to be passed without compile error 
 * 
 * The program does not terminate if the user does not enter a 3
 * digit number. It gives you the option to fix once then continues on and calculates values.
 * If the item is not a 3 digit number it returns a false value (Ran out of time) 
 * 
 * These are two issues I can fix given more time to complete the lab. 
 */

public class SumOfNumbers {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);

		// Program variables
		int number1;
		int number2;
		int i = 0;
		boolean equalSums = false;

		// Input number Digits
		int digit1;
		int digit2;
		int digit3;
		int digit4;
		int digit5;
		int digit6;

		// Command to receive number input for first number
		System.out.println("Please enter a 3 digit number: ");
		number1 = scnr.nextInt();

		// Command to receive number input for second number
		System.out.println("Please enter a 3 digit number: ");
		number2 = scnr.nextInt();

		/*
		 * Command to test number input System.out.println(number1 + " " + number2);
		 */

		// Check the range of input from 0-1000 to determine if entered number is 3.
		// digits long

		if ((number1 >= 0) && (number1 < 1000)) {
			System.out.println(number1 + " is a valid input");
		} else {
			System.out.println(number1 + " is not a valid number. Enter 3 digit number");
			number1 = scnr.nextInt();
		}
		if ((number2 >= 0) && (number2 < 1000)) {
			System.out.println(number2 + " is a valid input");
		} else {
			System.out.println(number2 + " is not a valid number. Enter 3 digit number");
			number2 = scnr.nextInt();
		}

		// Logic to get three separate digits for first number.
		digit1 = (number1 / 100) % 10;
		// System.out.println(digit1);

		digit2 = (number1 / 10) % 10;
		// System.out.println(digit2);

		digit3 = number1 % 10;
		// System.out.println(digit3);

		// Logic to get three separate digits for second number.
		digit4 = (number2 / 100) % 10;
		// System.out.println(digit4);

		digit5 = (number2 / 10) % 10;
		// System.out.println(digit5);

		digit6 = number2 % 10;
		// System.out.println(digit6);

		// Logic to calculate the sum of each number.
		if ((digit1 + digit4) == (digit2 + digit5) && (digit3 + digit6) == (digit2 + digit5)) {
			equalSums = true;
			System.out.println("true");
			System.out.println("The sum of all first, second and third digits is:  " + (digit1 + digit4));
		} else {
			System.out.println("false");
			System.out.println("The sum of all first, second and third digits is not equal");

		}

		/*
		 * Program was tested with '543' & '456' to verify true answer
		 */

	}

}
