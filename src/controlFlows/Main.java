package controlFlows;

public class Main {
	public static void main(String[] args){
		switchMethod('A');
		switchMethod('b');
		switchMethod('X');
		System.out.println(".....................................");
		validName("ALeX");
		validName("aNN");
		validName("Stephen");
		System.out.println(".....................................");
		calculateInterest((double) 20000, (double) 0.4);
		System.out.println(".....................................");
		calculateInterest((double) 400000, (double) 2.4);
		System.out.println(".....................................");
	};
	
	public static void switchMethod(char value){
		char character = Character.toLowerCase(value);
		switch(character){
		case'a' :case 'b' :case'c' :case'd' :case'e':
			System.out.println("The value of " + value + " is " + character);
			break;
		default:
			System.out.println("Not found");
			break;
		};
	};
	
	public static void validName(String name){
		String validName = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();//capitalisation
		switch(validName){
		case "Ann": case "Alice": case "Arthur": case "Kim": case "Alex":
			System.out.println("Welcome " + validName + "!");
			break;
		default:
			System.out.println("Sorry. You have no access.");
			break;
		};
	};
	
	public static void calculateInterest(double amount, double interestRate){
		for(int i=0; i<5; i++){
			double sum = amount*((interestRate+(double)i)/(double)100);
			System.out.println("Interest rate: " + (double)(interestRate + (double) i) + " per cent");
			System.out.println("The interest rate of " + (interestRate + (double)i) + " for the amount of " + amount + " is " + (float)sum + ".");
			System.out.println("The total sum is with the interest rate is " + (sum + amount) + "");
			System.out.println("-----------------------------------------------------------------");
		};
	};
}
