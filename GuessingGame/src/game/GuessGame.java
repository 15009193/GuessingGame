package game;


public class GuessGame {
	Player p1;  //instance variable for the Player object
	
	public void startGame() {
		
		p1 = new Player(); // create Player object and assign to the Player variable
		
		int guess1 = 0;  // declare the variable to hold the guesses the Player makes
		
		boolean guessisRight = false;  // declare a variable to hold a true or false value based on the player's answer
		
		int targetNumber = (int) (Math.random() * 10); // generate a random target number which the player has to try guess
		System.out.println("I'm thinking of a number between 0 and 9...");
		
		while (guessisRight == false) {
			//System.out.println("Number to guess is " +targetNumber);
			
			p1.guess();
			
			guess1 = p1.number;
			System.out.println("You guessed " +guess1);
			
		
			if (guess1 == targetNumber) // checks if player's guess is equal to the target number.
			{
				guessisRight = true;
			}  // end if

			
			if (guessisRight) {
				
				System.out.println("You guessed correctly!");
				System.out.println("Game is over.");
				break; //Break out of the loop following game over.
			} else {
				System.out.println("Incorrect, guess again.");
			}  // end if/else
		}	// end loop
	}	// end method
}	// end class