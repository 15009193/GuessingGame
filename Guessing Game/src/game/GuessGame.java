package game;

public class GuessGame {
	Player p1;
	
	public void startGame() {
		
		
		int guess1 = 0;
		
		boolean guessisRight = false;
		
		int targetNumber = (int) (Math.random() * 10);
		System.out.println("I'm thinking of a number between 0 and 9...");
		
		while (true) {
			//System.out.println("Number to guess is " +targetNumber);
			p1 = new Player();
			p1.guess();
			
			guess1 = p1.number;
			System.out.println("You guessed " +guess1);
			
		
			if (guess1 == targetNumber) {
				guessisRight = true;
			}

			
			if (guessisRight) {
				
				System.out.println("You guessed correctly!");
				System.out.println("Game is over.");
				break; //Break out of the loop following game over.
			} else {
				System.out.println("Please try again.");
			}  // end if/else
		}	// end loop
	}	// end method
}	// end class