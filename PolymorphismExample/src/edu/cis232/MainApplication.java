package edu.cis232;

import edu.cis232.item.*;

public class MainApplication {

	public static void main(String[] args) {
		Item[] items = { new Item("item 1"), new Food("Food", 20), new Turkey() };
		
		for(Item item : items){
			if(item instanceof Food){
				Food food = (Food)item;
				food.digest();
			} else {
				System.out.println(item + " is not food");
			}
		}
	}

}
