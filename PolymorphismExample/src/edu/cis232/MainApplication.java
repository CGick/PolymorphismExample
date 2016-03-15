package edu.cis232;

import java.util.Random;

import edu.cis232.item.Food;
import edu.cis232.item.Item;
import edu.cis232.item.Pasta;
import edu.cis232.item.Turkey;

public class MainApplication {

	public static void main(String[] args) {
		Item[] items = { new Item("item 1"), new Food("Food", 20), new Turkey(), new Pasta() };
		Random num = new Random();
		eatItemIfFood(items[num.nextInt(items.length)]);
		
	}
	
	public static void eatItemIfFood(Item item){
		if(item instanceof Food){
			Food food = (Food)item;
			food.digest();
		} else {
			System.out.println(item + " is not food");
		}
	}

}
