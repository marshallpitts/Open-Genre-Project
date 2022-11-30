import java.util.Scanner;
import java.util.Random;

public class ArtLab {
/*
* Written by Marshall Pitts
*/
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		Scanner key = new Scanner(System.in);
		
		int art = 0;
		boolean loop = true;
		
		System.out.println("Welcome to the 2D Art Generator!");
		System.out.println("We will now define the size of your canvas");
		
		System.out.println("Please input your x:");
		int x = key.nextInt();
		key.nextLine();
		System.out.println("Please input your y:");
		int y = key.nextInt();
		key.nextLine();
		while(loop == true)
		{
			Random piece = new Random ();
			char [][] array = new char [y][x];
			for(int i = 0; i < y; i++)
			{
				for(int j = 0; j < x; j++)
				{
					int pieceNumber = piece.nextInt(0,2);
					if(pieceNumber==0)
					{
						array[i][j]= '█';
					}
					else
					{
						array[i][j]= ' ';
					}
				}
			
			}
		System.out.println(" Random Piece of Art #"+ (art+1));
		for(int i = 0; i < x; i++)
		{
			for(int j = 0; j < x; j++)
			{
				System.out.print(array[i][j]);
			}
			System.out.println();
			}
		art++;
		System.out.println("Would you like to contiune");
		String userInput = key.nextLine();
			if(userInput.equals("no"))
			{
				System.out.println("Program Exit");
				loop = false;
		}
	
		}
	}
}


