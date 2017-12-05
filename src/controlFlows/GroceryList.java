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
	
	void modifyGroceryList(String itemToReplace, String replacement){
		if(shoppingList.contains(itemToReplace)){
			int index = shoppingList.indexOf(itemToReplace);
			shoppingList.set(index, replacement);
		}
	}
	
	void removeGroceryItem(String item){
		int index = findItem(item);
		if(index >= 0){
			shoppingList.remove(index);
		}
	}
	
	public int findItem(String searchedItem){
		return shoppingList.indexOf(searchedItem);
	}
			

}
