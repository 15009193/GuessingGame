package game;
import java.util.Scanner;


public class Player {
	
	int number = 0;  // stores the guess
		public void guess() {
		Scanner kboard = new Scanner(System.in);
		
		
		System.out.println("Try to guess the number.");
		number = kboard.nextInt();
		//number = (int) (Math.random()*10);
		System.out.println("I'm guessing " +number);
		kboard.close();
 	}

}
