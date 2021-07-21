import java.util.Random;
import java.util.Scanner;

public class AgeGuessWhile {

	public static void main(String[] args) {
		//Repeatedly prompts user for an age guess (using while) until the guess is correct

		int age, ageGuess;
		Random generator = new Random();
	
		//generator sets age of random person
		age = generator.nextInt(10);
		Scanner scanguess = new Scanner (System.in);
		
		//user prompt
		System.out.print("Enter an age guess for a random person: ");
		ageGuess = scanguess.nextInt();
		
		//while loop
		while (ageGuess != age)
		
			if (ageGuess < age)
				System.out.println("You guessed wrong! \nYour guess is younger than the person's actual age.");
		
			else 
			{
				System.out.println("You guessed wrong! \nYour guess is older than the person's actual age.");
				
			System.out.println();
			System.out.println("Guess again! ");

			ageGuess = scanguess.nextInt();
			}
		
		if (ageGuess == age)
			System.out.println("You guessed correctly- bravo!");
			
		scanguess.close();

	}

}
