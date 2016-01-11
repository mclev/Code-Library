package labNumber;

import java.util.*;
/*
 * The application is designed to prompt the user to enter values of length and width of a room
 * The area and perimeter will be displayed
 * The user is prompted to continue
 */
public class Lab1CalcPerimAndArea {

	public static void main(String[] args) {

		System.out.println("Welcome to Grand Circus' Room Detail Generator! ");
		String choice = "y";
		do {
			Scanner inputValues = new Scanner(System.in);

			System.out.println("Please enter the length.");
			float length = inputValues.nextFloat();

			System.out.println("Please enter the width. ");
			float width = inputValues.nextFloat();

			float area = length * width;
			System.out.println("The area is: " + area);

			float perimeter = 2 * length + 2 * width;
			System.out.println("The perimeter is: " + perimeter + "\n");

			System.out.println("Would you like to continue measuring rooms? (enter y/n)" + "\n");
			choice = inputValues.next();

		} while (choice.equals("y"));
		System.out.println("You are now leaving this application. Have a nice day!");		
	}
}
