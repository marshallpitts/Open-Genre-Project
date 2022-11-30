//Written by marshall pitts
import java.util.Scanner;


	public class HW1 {

		public static String computerTurn() {
			String strTrhow = null;
			int intMove = (int) (Math.random() * 3);
			String strThrow = null;
			if (intMove == 0) {
				strThrow = "Rock";
			}
			if (intMove == 1) {
				strThrow = "Paper";
			}
			if (intMove == 2) {
				strThrow = "Scissors";
			}
			return strThrow;


}

		public static void main(String[] args) {
			boolean blnGameOver = false;
			Scanner keyboard = new Scanner(System.in);
			int intComputerScpre = 0;
			int intPlayerrScore = 0;
			String strComputerThrow = null;
			String strPlayerThrow = null;
			String strPlayAgain = null;

			while(!blnGameOver) {
				System.out.println("Welcome to Rock Paper Scissors! Best 2 out 3 Wins. Enter Rock, Paper, or Scissors");

				int intPlayerScore = 0;
				int intComputerScore = 0;
	for(int intRound = 1; intRound <= 3; intRound++) {
		System.out.println("Round " + intRound + " Your Score: " + intPlayerScore + " Computer Score: " + intComputerScore);
		System.out.println("");
		System.out.println(" What do you throw? (Rock, Paper, or Scissors): ");
		strPlayerThrow = keyboard.next();
		strComputerThrow = computerTurn();

		if (!strPlayerThrow.equalsIgnoreCase("rock") && ! strPlayerThrow.equalsIgnoreCase("paper") && !strPlayerThrow.equalsIgnoreCase("scissors")) {
			System.out.println("Not a valid input");
			intComputerScore++;
		} else {
			System.out.println("\nThe computer throws " + strComputerThrow);
	
			if (strPlayerThrow.equalsIgnoreCase(strComputerThrow)) {
				System.out.println("\nIts a tie");
			}
			if (strPlayerThrow.equalsIgnoreCase("Rock") && strComputerThrow.equals("Paper")) {
				System.out.println("\nPaper beats Rock! Computer scores 1 point.\n");
				intComputerScore++;
			}
			if (strPlayerThrow.equalsIgnoreCase("Rock") && strComputerThrow.equals("Scissors")) {
				System.out.println("\nRock beats Scissors! You score 1 point.\n");
				intPlayerScore++;
			}
			if (strPlayerThrow.equalsIgnoreCase("Paper") && strComputerThrow.equals("Rock")) {
				System.out.println("\nPaper beats Rock! You score 1 point.\n");
				intPlayerScore++;
			}
			if (strPlayerThrow.equalsIgnoreCase("Paper") && strComputerThrow.equals("Scissors")) {
		System.out.println("\nScissors cut paper! Computer scores 1 point.\n");
		intComputerScore++;
			}
			if (strPlayerThrow.equalsIgnoreCase("Scissors") && strComputerThrow.equals("Rock")) {
				System.out.println("\nRock beats Scissors! Computer scores 1 point.\n");
				intComputerScore++;
			}
			if(strPlayerThrow.equalsIgnoreCase("Scissors") && strComputerThrow.equals("paper")) {
				System.out.println("\nScissors cut paper! You score 1 point.\n");
				intPlayerScore++;
	}
	}
	}

		System.out.println("\nfinal score is Player: " + intPlayerScore + " Computer: " + intComputerScore);
		if (intPlayerScore > intComputerScore) {
			System.out.println("\n You are the Winner");
		}
		if(intPlayerScore < intComputerScore) {
			System.out.println("\n The Computer is the Winner");
		}
		if (intPlayerScore == intComputerScore) {
			System.out.println("Its a tie!");
		}
		System.out.println("\nPlay Again? (Y or N) ");
		strPlayAgain = keyboard.next();
		if(strPlayAgain.equalsIgnoreCase("N")) {
			blnGameOver = true;
		}
			}
			System.out.println("\nGood Game!");
			keyboard.close();
		}
		

		}



				
				
		
