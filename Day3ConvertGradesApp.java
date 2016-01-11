package bonus;

import java.util.*;

/*
 * Convert given NUMBER grades into LETTER grades
 */
public class Day3ConvertGradesApp {

	public static void main(String[] args) {
	
		String letterGrade;
		String choice = "y";

		System.out.println("Welcome to the Letter Grade Converter!");

		int numericalGrade;
		try {
			do {
				System.out.println("Enter a numerical grade:  (Grades from 0-100)");
				Scanner userInput = new Scanner(System.in);

				numericalGrade = userInput.nextInt();

				if (numericalGrade >= 88 && numericalGrade <= 100)
					System.out.println("Letter Grade: A");
				else if (numericalGrade >= 80 && numericalGrade <= 87)
					System.out.println("Letter Grade: B");
				else if (numericalGrade >= 67 && numericalGrade <= 79)
					System.out.println("Letter Grade: C");
				else if (numericalGrade >= 60 && numericalGrade <= 66)
					System.out.println("Letter Grade: D");
				else if (numericalGrade > 100 || numericalGrade < 0)
					System.out.println("That is invalid data. Please try available numerical grades 1-100");
				else
					System.out.println("Letter Grade: F");

				System.out.println("Would you like to continue? " + "(Enter y/n)");
				choice = userInput.next();
				
			} while (choice.equalsIgnoreCase("y"));
			System.out.println("You are now leaving this application.  Goodbye.");
			
		} catch (java.util.InputMismatchException e) {
			System.out.println("Now you know that was not a valid grade!.  You have been kick out of the system!");
		}
	}

}
