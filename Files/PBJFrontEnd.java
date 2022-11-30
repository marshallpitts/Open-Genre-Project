/*
 * Written by Marshall Pitts
 */
import java.util.Scanner;

public class PBJFrontEnd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		PBJSandwich pbj1 = new PBJSandwich();
		PBJSandwich pbj2 = new PBJSandwich();
		System.out.println("--------------------------------\n" 	+ "Welcome to PBJ Sandwich Maker\n--------------------------------\n");
		
		for (int i = 1; i <= 2; i++) {
		PBJSandwich pbj = new PBJSandwich();
			System.out.println("-----Sandwich " + i + "-----");
			System.out.println("Top Slice of Bread Information");
			System.out.println("Enter name of the bread");
			String name = sc.nextLine();
			System.out.println("Enter the number of calories");
		int calories = sc.nextInt();
		
		sc.nextLine();
		System.out.println(
		"Enter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\"");
		String type = sc.nextLine();
		bread topSlice = new bread();
		topSlice.setName(name);
		topSlice.setCalories(calories);
		topSlice.setType(type);
			System.out.println("Peanut Butter Information");
			System.out.println("Enter the name of peanut butter");
			String pName = sc.nextLine();
			System.out.println("Enter the number of calories");
		int pCalories = sc.nextInt();
		sc.nextLine();
			System.out.println("Is it crunchy? Enter \"true\", or \"false\"");
		boolean pCrucnhy = sc.nextBoolean();
		
		sc.nextLine();
		PeanutButter pb = new PeanutButter();
		pb.setName(pName);
		pb.setCrunchy(pCrucnhy);
		pb.setCalories(pCalories);
		System.out.println("Jelly Information");
		System.out.println("Enter name of the jelly");
		String jellyName = sc.nextLine();
		System.out.println("Enter the number of calories");
		int jCalories = sc.nextInt();
		sc.nextLine();
			System.out.println(
		"Enter the fruit type of Jelly. Must be \"Apple\", \"Blueberry\", \"Grape\", \"Strawberry\", or \"Tomato\"");
		String fruitType = sc.nextLine();
		Jelly j = new Jelly();
		j.setCalories(jCalories);
		j.setFruitType(fruitType);
		j.setName(jellyName);
			System.out.println("Bottom Slice Bread Information");
			System.out.println("Enter name of the bread");
			String bottomBreadName = sc.nextLine();
			System.out.println("Enter the number of calories");
		int bottomCalories = sc.nextInt();
		sc.nextLine();
			System.out.println(
		"Enter the type of bread. Must be \"Honey Wheat\", \"White\", \"Whole Grain\", or \"Whole Wheat\"");
		String bottomType = sc.nextLine();
		bread bottomSlice = new bread();
		bottomSlice.setName(bottomBreadName);
		bottomSlice.setCalories(bottomCalories);
		bottomSlice.setType(bottomType);
		pbj.setTopSlice(topSlice);
		pbj.setBottomSlice(bottomSlice);
		pbj.setJelly(j);
		pbj.setPeanutButter(pb);
		if (i == 1)
		pbj1 = pbj;
		else
		pbj2 = pbj;
		}
			System.out.println("-----Sandwich 1-----\n" + pbj1);
			System.out.println("-----Sandwich 2-----\n" + pbj2);
			System.out.println("Are they the same sandwich? " + pbj1.equals(pbj2));
			sc.close();
		
		
	}
		}
	
