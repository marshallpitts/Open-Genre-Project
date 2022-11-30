import java.util.Scanner;

public class labthreethree {

	public static void main(String[] args) {
	
	double[] dblTemps = new double[10];
	double dblAverageTemperature = 0.0;
	double dblRunningTotal = 0.0;
	int intDay = 0;
	
	Scanner keyboard = new Scanner(System.in);

	for (intDay = 1; intDay <= 10; intDay++) {
		System.out.println("Please enter the temperature for day " + intDay + ": ");
		dblTemps[intDay - 1] = keyboard.nextDouble();
		dblRunningTotal += dblTemps[intDay - 1];
	}
	dblAverageTemperature = (dblRunningTotal / 10);
	System.out.println("The average temperature was " + dblAverageTemperature);
	
	System.out.println("The days that were below average were:");
	for (intDay = 1; intDay <= 10; intDay++) {
		if (dblTemps[intDay - 1] < dblAverageTemperature) {
			System.out.println("Day " + intDay + " with " + dblTemps[intDay - 1]);
		}
	}
	}
}