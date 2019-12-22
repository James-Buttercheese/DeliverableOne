import java.util.Scanner;

public class WhereToFly {

	public static void main(String[] args) {
		Scanner scnr = new Scanner(System.in);
		
		String vacationType;
		int groupSize;
		String result;
		String flightType;
		String vacationLocation;
				
		System.out.println("Would you like your trip to be musical, tropical, or adventurous?");
		vacationType = scnr.nextLine();
		
		System.out.println("How many people will be going on your trip?");
		groupSize = scnr.nextInt();
		
		vacationType = vacationType.toLowerCase(); //capitalizations of vacationType not an issue
	
		if (vacationType.equals("musical")) { //this if, else if, else statement declares location, and includes a fallback if the person can't type, or wants a different vacation
			vacationLocation = ("New Orleans.");
		}		
		else if (vacationType.equals("tropical")){
			vacationLocation = ("a beach in Mexico.");
		}		
		else if (vacationType.equals("adventurous")){
			vacationLocation = ("the Grand Canyon for some whitewater rafting.");
		}		
		else {
			vacationLocation = ("go to an unknown destination.");
			}
		
		if ((groupSize > 0) && (groupSize < 3)) { //this if, else if, else statement declares the method of transportation and includes a fallback for negative numbers
			flightType = ("fly first class");
		}		
		else if ((groupSize >= 3) && (groupSize < 6)) {
			flightType = ("take a helicopter");
		}		
		else if (groupSize >= 6) {
			flightType = ("take a charter flight");
		}
		else {
			flightType = ("figure out a way");
		}
		
		result = ("Since you're a group of " + groupSize + " going on a " + vacationType + " vacation, you should " + flightType + " to " + vacationLocation);
		
		System.out.println(result);
			
	}
}
		
		
		
	


