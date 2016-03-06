/* 	Kevin Garnica
	2/21/2016
	Hello Word Program 
 */


import java.util.Scanner;
import java.util.Random;

class Rock
{
	
	public static void main(String args[])
	{
		Scanner input = new Scanner( System.in );

		Random generator = new Random();
		int computerNumber;
		int userNumber;
		String computerSelection; 
		String userSelection; 
		
		System.out.println("You're going to play a 'Rock, Paper, Scissors' game with the computer.");
		System.out.println();
		System.out.println("Enter one of the following numbers"); 
		System.out.println();
		System.out.println("1 = Rock");
		System.out.println();
		System.out.println("2 = Paper");
		System.out.println();
		System.out.println("3 = Scissors");
		System.out.println();

		userNumber = input.nextInt();
		
		computerNumber = generator.nextInt(3)+1;
		
		if(computerNumber == 1){
			
			computerSelection = "Rock";
		}else if (computerNumber == 2){
			
			computerSelection = "Paper";
		}else {
			
			computerSelection = "Scissors";
		};
		
		if(userNumber == 1){
			
			userSelection = "Rock";
			
		}else if (userNumber == 2){
			
			userSelection = "Paper";
			
		}else {
			
			userSelection = "Scissors";
		};
		
		System.out.println();
		
		if (computerNumber == userNumber){
			
			System.out.println("Both of you have chosen " + userSelection);
			System.out.println("The Game is a Tie");
			
		}else if (computerNumber == 1 && userNumber == 3){
			
			System.out.println("The Cpu has chosen " + computerSelection + ".");
			System.out.println("You have chosen " + userSelection);
			System.out.println("You Loose");
			
		}else if (computerNumber == 2 && userNumber == 1){
			
			System.out.println("The Cpu has chosen " + computerSelection + ".");
			System.out.println("You have chosen " + userSelection);
			System.out.println("You Loose");
			
		}else if (computerNumber == 3 && userNumber == 2){
			
			System.out.println("The Cpu has chosen " + computerSelection + ".");
			System.out.println("You have chosen " + userSelection);
			System.out.println("You Loose");
		
		}else if (computerNumber == 1 && userNumber == 2){
			
			System.out.println("The Cpu has chosen " + computerSelection + ".");
			System.out.println("You have chosen " + userSelection);
			System.out.println("You Win");
			
		}else if (computerNumber == 2 && userNumber == 3){
			
			System.out.println("The Cpu has chosen " + computerSelection + ".");
			System.out.println("You have chosen " + userSelection);
			System.out.println("You Win");
			
		}else if (computerNumber == 3 && userNumber == 1){
			
			System.out.println("The Cpu has chosen " + computerSelection + ".");
			System.out.println("You have chosen " + userSelection);
			System.out.println("You Win");
		
		}else {
			
			System.out.println("Error");
			
		};

		
		

	}
}