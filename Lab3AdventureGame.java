package labNumber;

import java.util.*;

public class Lab3AdventureGame {

	public static void main(String[] args) {
		String name;
		String userOption="y";
		
		Scanner userInput = new Scanner(System.in);
		System.out.println("Welcome! What is your name? (Enter your name)");

		name=userInput.nextLine();
		System.out.println("It's a pleasure to meet you "+name + "!");
		System.out.println("Would you like to play my game? (Enter y/n)");
		userOption=userInput.nextLine();

		System.out.println("Fantastic "+name+"!\n "
				+ "So here's how its goes...\n "
				+ "You are walking across a field, "
				+ "and you encounter a fire-breathing dragon!\n "
				+ "What would you do? (Enter: 'face the beast' or 'run away')");
				//enter run away
		
		String userChoice1=userInput.nextLine();
		if(userChoice1.equals("face the beast")==true){
			System.out.println("You approach the dragon. "
					+ "You see that he has __ heads. "
					+ "(Enter: '1', '2', or '3')");
				//enter 3
		}
		
		String userChoice2 = userInput.nextLine();
		if (userChoice2.equals("3")==true){
			System.out.println("No one has ever faced a 3-headed "
					+ "dragon before! \n Choose your weapon. (Enter: "
					+ "'slingshot or sword' or 'bow and arrow'");
				//enter bow and arrow
		}	
		String userChoice3 = userInput.nextLine();
		if (userChoice3.equals("bow and arrow")==true){
			System.out.println("Armed with your bow and arrow, "
					+ "you approach the dragon. \n You can feel its "
					+ "fiery breath as you get closer. \n It stares at"
					+ "you with its ___ eyes. (Enter: 'red' or 'blue')");
				//enter red
		}
		String userChoice4 = userInput.nextLine();
		if (userChoice4.equals("red")==true){
			System.out.println("Oh thank goodness! Red-eyed dragons "
					+ "are friendly. \n You pet it and become friends. "
					+ "You name the dragon ____ (Enter a name:)");
				//enter toothless
		}
		String userChoice5 = userInput.next();
		if (userChoice5.equals("toothless")==true){
			System.out.println(name + " and " + userChoice5 + " live happily ever after!");
		}
		
	}

}
