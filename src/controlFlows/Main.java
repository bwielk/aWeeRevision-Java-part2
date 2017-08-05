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
}
