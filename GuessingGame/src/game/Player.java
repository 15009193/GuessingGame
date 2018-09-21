package game;
import java.util.Scanner;


public class Player 
{
	int number = 0;  // stores the guess
		
	public void guess() // function to allow user to input guess
	{
	Scanner kboard = new Scanner(System.in);
	System.out.println("Try to guess the number.");
	number = kboard.nextInt(); // keyboard number input stored as guess value
	} // end method

} // end class

