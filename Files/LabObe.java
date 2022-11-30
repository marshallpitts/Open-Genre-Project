import java.util.Scanner;
public class LabObe {

	public static void main(String[] args) {
		System.out.println("What is your Zodiac?");
		Scanner key = new Scanner(System.in);
		int month = key.nextInt();
		int day = key.nextInt();
			String sign="";
			
			if (month == 4) {
				if (day < 20)
				sign = "aries";
				else 
				sign = "Taurus";
			} 	else if (month == 5){
				if (day< 21)
				sign = "Taurus";
				else
				sign = "Gemini";
			}	else if (month == 6) {
				if (day < 21)
				sign = "Gemini";
				else
				sign = "Cancer";
			}	else if (month == 7){
				if (day < 23)
				sign = "Cancer";
				else
				sign = "Leo";
			}	else if (month == 8){
				if (day < 23)
				sign = "Leo";
				else
				sign = ("Virgo");
			}	else if (month == 9){
				if (day< 23)
				sign = "Virgo";
				else
				sign = "Libra";
			}	else if (month == 10) {
				if (day < 23)
				sign = "Libra";
				else
				sign = "Scorpio";
			}	else if (month == 11){
				if (day < 22)
				sign = "Scorpio";
				else
				sign = "Sagittarius";
			}	else if (month == 12){
				if (day < 22)
				sign = "Sagittarius";
				else
				sign = ("Capicorn");
			}	else if (month == 1){
				if (day< 20)
				sign = "Capciron";
				else
				sign = "Aquarius";
			}	else if (month == 2){
				if (day < 19)
				sign = "Aquarius";
				else
				sign = ("Pisces");
			}	else if (month == 3){
				if (day< 21)
				sign = "Pisces";
					
				
				
				
				
				
				
				
			}
		
	
	
	
	
	
			if(month<0)
			{
				System.out.println("month invalid!");
			}
			else if(day<0)
			{
				System.out.println("day invalid");
			}
			else if(month == 9 & day == 31)
			{
				System.out.println("day invalid");
			}
			else
			{
				System.out.println("Your Zodiac sign is "+sign);
			}
		}
	}
	
