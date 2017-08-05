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
		calculateInterestAsc((double) 20000, (double) 1.5, 3);
		System.out.println(".....................................");
		calculateInterestDesc((double) 20000, (double) 1.5, 3);
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
	
	public static void calculateInterestAsc(double amount, double interestRate, int interestRateLimit){
		if(interestRateLimit > 0){
			for(int i=0; i<(interestRateLimit); i++){
				double sum = amount*((interestRate+(double)i)/(double)100);
				System.out.println("Interest rate: " + (double)(interestRate + (double) i) + "%");
				System.out.println("The interest rate of " + (interestRate + (double)i) + "% for the amount of " + amount + " is " + (float)sum + ".");
				System.out.println("The total sum is with the interest rate is " + (sum + amount) + "");
				System.out.println("-----------------------------------------------------------------");
			}
		}else{
			System.out.println("Incorrect input of the range of interest rate");
			}
	};
	
	public static void calculateInterestDesc(double amount, double interestRate, int interestRateLimit){
		if(interestRateLimit > 0){
			double sumIntRate1 = (float)(amount*((double)interestRateLimit + (double) interestRate)/(double)100);
			System.out.println("Interest rate: " + ((double)interestRateLimit + (double) interestRate) + "%");
			System.out.println("The interest rate of " + ((double)interestRateLimit + (double) interestRate) + "% for the amount of " + amount + " is " + sumIntRate1 + ".");
			System.out.println("The total sum is with the interest rate is " + (amount + sumIntRate1) + "");
			System.out.println("-----------------------------------------------------------------");
			for(int i=(interestRateLimit); i>=0; i--){
				double interestRateAsc = (double) i + interestRate;
				double sumIntRateAsc = amount*(interestRateAsc/(double)100);
				System.out.println("Interest rate: " + interestRateAsc + "%");
				System.out.println("The interest rate of " + interestRateAsc + "% for the amount of " + amount + " is " + (float)sumIntRateAsc + ".");
				System.out.println("The total sum is with the interest rate is " + (sumIntRateAsc + amount) + "");
				System.out.println("-----------------------------------------------------------------");
			}
		}else{
			System.out.println("Incorrect input of the range of interest rate");
			}
	};
}
