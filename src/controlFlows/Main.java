package controlFlows;

public class Main {
	public static void main(String[] args){
		switchMethod('A');
		switchMethod('b');
		switchMethod('X');
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
}
