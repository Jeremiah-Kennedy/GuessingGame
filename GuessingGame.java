package GitHub;
import java.io.*;
import java.util.Scanner;
//Created by Jeremiah Kennedy
public class GuessingGame {	
		public void game() {
		int count = 0;
		Scanner myObj = new Scanner(System.in);
		int min = 1;
		int max = 100;
		int ourNumber = (min + (int) (Math.random() * ((max - min) + 1)));
		System.out.println("We're thinking of a number from 1 to 100. You have five tries to guess within 10 digits: ");
		
		//comment this out to play without debugging
		//System.out.println(ourNumber\n);
		
		
		
		while(count>=0) {
			int guess = Integer.parseInt (myObj.nextLine());
			if(guess<=ourNumber+10&&guess>=ourNumber-10) {
				System.out.println("You guessed within 10 digits of our number. Good game.");
				
			}
			else{
				count+=1;
				//Now used for debugging since my compiler is popping a printf error every time I try to use printf
				//System.out.printf("You didn't get it right. The number was %i and your guess was %i\nTry Again: ", ourNumber, guess);
			}
			if(count==5) {
				System.out.println("-No More Tries-");
				System.out.println("Our number was");
				System.out.println(ourNumber);
				System.exit(0);
			}
		}
		}		
			 
}
