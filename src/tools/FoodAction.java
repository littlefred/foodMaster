package tools;

import java.util.ArrayList;
import java.util.List;

import wsfood.FoodAttribute;
import wsfood.FoodCategory;
import wsfood.FoodDBService_Service;

/**
 * 
 * @author Frederick
 * 
 *         abstract class to manage web service method
 *
 */
public abstract class FoodAction {
	/**
	 * final attribute to save the access to web services
	 */
	private static final FoodDBService_Service SERVICE = new FoodDBService_Service();

	/**
	 * method to call a web service to list foods
	 * 
	 * @param name
	 * @return
	 */
	protected static List<FoodAttribute> getlist(String name) {
		return SERVICE.getFoodDBServicePort().getFoodAttributeListByName(name);
	}

	/**
	 * method to call a web service to list a food from his reference
	 * 
	 * @param id
	 * @return
	 */
	protected static List<FoodAttribute> getFood(int id) {
		List<FoodAttribute> list = new ArrayList<>();
		list.add(SERVICE.getFoodDBServicePort().getFoodAttributeById(id));
		return list;
	}

	/**
	 * method to display a list of food
	 * 
	 * @param list
	 */
	protected static void displayList(List<FoodAttribute> list) {
		if (!list.isEmpty() && !list.contains(null)) {
			for (FoodAttribute food : list) {
				String str = "ref. : " + food.getId();
				FoodCategory category = food.getCategory();
				str += " | category : " + category.getName();
				str += " | name : " + food.getName();
				str += " | energy : " + food.getEnergy();
				str += " | protein : " + food.getProt();
				str += " | fat : " + food.getFat();
				str += " | carbohydrates : " + food.getCarb();
				System.out.println(str);
			}
		} else {
			System.out.println("Sorry, we have no result.");
		}
	}
	
	protected static void createFood() {
		
	}

}
