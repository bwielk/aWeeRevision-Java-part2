package controlFlows;

import java.util.ArrayList;

public class GroceryList {
	
	private ArrayList<String> shoppingList = new ArrayList<String>();

	public void addItem(String item){
		shoppingList.add(item);
	}
	
	public void printGroceryList(){
		System.out.println("You have " + shoppingList.size() + " elements to buy");
		for(int i=0;i<shoppingList.size(); i++){
			System.out.println("Element " + (i+1) + " : " + shoppingList.get(i));
		}
	}
	
	public void modifyGroceryList(String string, int position){
		shoppingList.set(position, string);
	}
	
	public void removeGroceryItem(int position){
		shoppingList.remove(position);
	}
	
	public String findItem(String searchedItem){
		boolean exists = shoppingList.contains(searchedItem);
		if(exists){
			return shoppingList.get(shoppingList.indexOf(searchedItem)) + " exists in the list";
		}else{
			return "No such item";
		}
	}
			

}
