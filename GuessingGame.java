package GitHub;
import java.io.*;
import java.util.Scanner;
//Created by Jeremiah Kennedy
public class GuessingGame {	
		public void game() {
		Scanner myObj = new Scanner(System.in);
		System.out.println("We're thinking of a number from 1 to 100. Guess what it is: ");
		int guess = Integer.parseInt (myObj.nextLine());
		int min = 1;
		int max = 100;
		int ourNumber = (min + (int) (Math.random() * ((max - min) + 1)));
		System.out.printf("%d\n", ourNumber);
		if(guess==ourNumber) {
			System.out.println("The numbers match. You win!");
		}
		if(guess<=ourNumber+10&&guess>=ourNumber-10) {
			System.out.println("You guessed within 10 digits of our number.");
			
		}
		else{
			System.out.printf("You didn't get it right. The number was %d and your guess was %d", ourNumber, guess);
		}
	}
}
