package controlFlows;

import java.util.*;

public class Display {
	
	private static Scanner scanner = new Scanner(System.in);
	private static GroceryList groceryList = new GroceryList();
	
	public static void main(String[] args){
		boolean quit = false;
		int choice = 0;
		printInstructions();
		while(!quit){
			System.out.print("Enter your choice");
			choice = scanner.nextInt();
			scanner.nextLine();
			
			switch(choice){
			case 0:
				printInstructions();
				break;
			case 1:
				groceryList.printGroceryList();
				break;
			case 2:
				addItem();
				break;
			case 3:
				modifyItem();
				break;
			case 4:
				removeItem();
				break;
			case 5:
				searchForItem();
				break;
			case 6:
				quit = true;
				break;	
			}
		}
	}
	
	public static void printInstructions(){
		System.out.println("\nPress ");
		System.out.println("\t 1 = to print the list of grocery items");
		System.out.println("\t 2 = to add an item the list of grocery items");
		System.out.println("\t 3 = to modify an item of the list of grocery items");
		System.out.println("\t 4 = to remove an item from the list of grocery items");
		System.out.println("\t 5 = to find an item from the list of grocery items");
		System.out.println("\t 6 = to exit");
	}
	
	public static void addItem(){
		System.out.print("Please enter the grocery item");
		groceryList.addItem(scanner.nextLine());
	}
	
	public static void modifyItem(){
		System.out.println("Enter item name : ");
		String item = scanner.nextLine();
		System.out.println("Enter the replacement item : ");
		String newItem = scanner.nextLine();
		groceryList.modifyGroceryList(item, newItem);
	}
	
	public static void removeItem(){
		System.out.println("Enter item name to remove : ");
		String item = scanner.nextLine();
		scanner.nextLine();
		groceryList.removeGroceryItem(item);
	}
	
	public static void searchForItem(){
		System.out.println("Enter item name to search : ");
		String itemToSearch = scanner.nextLine();
		System.out.println(groceryList.findItem(itemToSearch));
	}
	

}
