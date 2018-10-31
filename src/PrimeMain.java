import java.util.Scanner;

public class PrimeMain extends PrimeFinder {
	
	public static void main(String[] args) {
	Scanner scan = new Scanner(System.in);
	String cont;
	
		System.out.println("This program will find you a prime number, from the first prime number on.");
		do {
		
		int userChoice =Validator.getInt(scan, "Which prime number are you looking for?");
	
		 
		PrimeFinder.findPrime(userChoice);
		
		System.out.println("The number " + userChoice + " prime is " + valueAtSequenceNum);
		
	   cont = Validator.getString(scan, "Type yes if you would like to continue. Press any other key to exit.");
		} while (cont.equalsIgnoreCase("yes"));
		
		System.out.println("Thank you for using Prime Number Finder.");
		
		
	}
	
	

	
	
}
