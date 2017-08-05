package controlFlows;

public class Main {
	public static void main(String[] args){
		/*switchMethod('A');
		switchMethod('b');
		switchMethod('X');
		System.out.println(".....................................");
		validName("ALeX");
		validName("aNN");
		validName("Stephen");
		System.out.println(".....................................");
		calculateInterestAsc((double) 20000, (double) 1.9, 2);
		System.out.println(".....................................");
		calculateInterestDesc((double) 20000, (double) 1.9, 2);*/
		//checkPrimeNumbersWithinRange(200000, 1223400);
		//isEvenNumber(21);
		evenNumbersWithinRange(23, 456);
		System.out.println(".....................................");
		evenNumbersWithinRange(234, 33453);
	}
	
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
				double interestRateValue = amount*((interestRate+(double)i)/(double)100);
				System.out.println("Interest rate: " + (double)(interestRate + (double) i) + "%");
				System.out.println("The interest rate of " + (interestRate + (double)i) + "% for the amount of " + amount + " is " + (float)interestRateValue + ".");
				System.out.println("The total sum is with the interest rate is " + (interestRateValue + amount) + "");
				System.out.println("-----------------------------------------------------------------");
			}
		}else{
			System.out.println("Incorrect input of the range of interest rate");
			}
	};
	
	public static void calculateInterestDesc(double amount, double interestRate, int interestRateLimit){
		if(interestRateLimit > 0){
			double intRateDescFirstValue = (float)(amount*((double)interestRateLimit + (double) interestRate)/(double)100);
			System.out.println("Interest rate: " + ((double)interestRateLimit + (double) interestRate) + "%");
			System.out.println("The interest rate of " + ((double)interestRateLimit + (double) interestRate) + "% for the amount of " + amount + " is " + intRateDescFirstValue + ".");
			System.out.println("The total sum is with the interest rate is " + (amount + intRateDescFirstValue) + "");
			System.out.println("-----------------------------------------------------------------");
			for(int i=(interestRateLimit); i>=0; i--){
				double interestRateDesc = (double) i + interestRate;
				double sumIntRateDesc = amount*(interestRateDesc/(double)100);
				System.out.println("Interest rate: " + interestRateDesc + "%");
				System.out.println("The interest rate of " + interestRateDesc + "% for the amount of " + amount + " is " + (float)sumIntRateDesc + ".");
				System.out.println("The total sum is with the interest rate is " + (sumIntRateDesc + amount) + "");
				System.out.println("-----------------------------------------------------------------");
			}
		}else{
			System.out.println("Incorrect input of the range of interest rate");
			}
	};
	
/////////////////////////////////PRIME NUMBERS///////////////////////////////
	public static boolean isPrime(int n){
        if(n == 1){
            return false;
        };
        for(int i=2; i <= n/2; i++){
            if(n % i == 0){
                return false;
            }
        };
        return true;
    };
    
    public static void checkPrimeNumbersWithinRange(int rangeStart, int rangeEnd){
    	int counter = 0;
    		if(rangeStart < rangeEnd && rangeEnd > rangeStart){
    			for(int i=rangeStart; i<rangeEnd; i++){
    				if(isPrime(i)){
    					counter++;
    					System.out.println(i + " is a prime number");
    				if(counter == 3){
    					System.out.println("The counter has reached first 3 detected prime numbers within the quoted range");
    				break;
    					};
    				};
    			};
    		}else{
    		System.out.println("Check parameters, please!");
    	};
    };
//////////////////////////////////////////////////////////////////////////////////////////
    public static boolean isEvenNumber(int num){
    	if(num %2 == 0){
    		//System.out.println("true");
    		return true;
    	}
    	//System.out.println("false");
    	return false;
    };
    
    public static void evenNumbersWithinRange(int startNum, int endNum){
    	int counter = 0;
    	int firstNum = startNum;
    	while(firstNum <= endNum){
    		if(!isEvenNumber(firstNum)){
    			firstNum++;//updates to another number
    			continue;
    		}
    	System.out.println(firstNum + " is an even number");
    	firstNum++;//updates to another number
    	counter ++;
    	//if(counter == 5)
    	//	break;
    	}
    	System.out.println("Total number of even numbers found in the range of numbers");
    	System.out.println("between " + startNum + " and " +  endNum + " ===> " + counter);
    };
    
}
