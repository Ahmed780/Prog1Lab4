/**
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

import java.util.Scanner;

/**
 * This program  generates a random number between 0 and 100 and asks the user to guess it.  
 * If the number is guessed, the user will be asked if they want to play again
 * if the guess is incorrect and 10 trials are used , the game will end. 
 * @author Uzair Ahmed 
 */
public class Q3 {
	public static void main(String[] args) {
		
		do {
			
		double random = Math.round(Math.random() * 100);
		double word;
		double replay;
		
		System.out.println(random);
		Scanner sc = new Scanner(System.in);
		System.out.println("Guess the number");
		word = sc.nextDouble();
		
		int trials = 1;
		for (int i = 1; i < 10; i++) {
			
		if (word == random) {
		System.out.println("\nCorrect");
		 System.out.println("Press 1 to play again");
        	replay=sc.nextInt();
        	if(replay!=1)
        	System.exit(0);
		i = 10;
		} 
		
		else {
		System.out.println("Try Again!");
		word = sc.nextDouble();
		trials += 1;
		}
		
		if(trials >= 10) {

		System.out.println("Incorrect");
            	System.out.println("\nYou got no trials left,press 0 to exit");
            	replay=sc.nextInt();
            	if(replay!=1)
                System.exit(0);
           }
           }     
        }
        while(true);
	}

}
