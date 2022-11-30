package lizard;

import java.util.Scanner;

//Written by marshall Pitts
public class Main {
	public static void main(String[] args) {
	System.out.println("Welcome to the Lizard Store!");
	System.out.println("Do you want to buy a Lizard?");
	Scanner key = new Scanner(System.in);
	String userChoice = key.nextLine();
	
	if(userChoice.equals("yes"))
	{
		System.out.println();
		System.out.println("Hooray! You are going to b so happy with your lizard!");
		System.out.println();
		System.out.println("What is your Lizards Name?");
		Scanner keyboard = new Scanner(System.in);
		String name = keyboard.nextLine();
		System.out.println("What is your lizards color?");
		String color = keyboard.nextLine();
		System.out.println("What us your Lizards length in feet?");
		double length = keyboard.nextDouble();
		System.out.println();
		System.out.println("Creating your Lizard.....");
		System.out.println();
		System.out.println("Congratuations on the new lizard, here is the info");
		Lizard lizard = new Lizard(name, length, color); 
		System.out.println(lizard);
		System.out.println();
		System.out.println("Have a Great Day!");
		
	}
	if(userChoice.equals("no"))
	{
		System.out.println("Program Exit");
	}
	if(userChoice.equals("ewww lizards"))
	{
		System.out.println("Program Exit");
	}
   
    }

}
	


