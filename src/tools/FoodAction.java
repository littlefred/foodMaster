package tools;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

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
			list.sort((o1, o2) -> (o1.getName().compareTo(o2.getName())));
			for (FoodAttribute food : list) {
				String str = "ref. : " + food.getId();
				str += " | name : " + food.getName();
				FoodCategory category = food.getCategory();
				str += " | category : " + category.getName();
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

	/**
	 * method to display the category list
	 * 
	 * @param list
	 */
	protected static void displayCategoryList(List<String> list) {
		if (!list.isEmpty() && !list.contains(null)) {
			Set<String> set = new TreeSet<>(list);
			for (String str : set) {
				System.out.println("Name category : " + str);
			}
		} else {
			System.out.println("Sorry, we have no category for the moment.");
		}
	}

	/**
	 * method to create a food
	 */
	protected static void createFood() {
		displayCategoryList(SERVICE.getFoodDBServicePort().getCategoryList());
		String category = manageCategory();
		String tempName = Scan.userInputString("The food name : ");
		String correctFormatName = Character.toString(Character.toUpperCase(tempName.charAt(0)))
				+ tempName.substring(1);
        int energy = Scan.userInputIntPositive("The food energy (Kcal) : ");
        int prot = Scan.userInputIntPositive("The food protein (per 100g) : ");
        int fat = Scan.userInputIntPositive("The food fat (per 100g) : ");
        int carb = Scan.userInputIntPositive("The food carbohydrate (per 100gr) : ");
        int result = SERVICE.getFoodDBServicePort().createFoodAttribute(category, correctFormatName, energy, prot, fat, carb);
        if(result==-1) {
        	System.out.println("Sorry, your food has not saved.\nPlease try again.");
        } else {
        	System.out.println("Congratulation, your food has been saved.");
        }
	}

	/**
	 * method to create a category
	 */
	protected static void createCategory() {
		String tempName = Scan.userInputString("What is the name of your category :");
		String correctFormatName = Character.toString(Character.toUpperCase(tempName.charAt(0)))
				+ tempName.substring(1);
		int result = SERVICE.getFoodDBServicePort().createCategory(correctFormatName);
		if (result == -1) {
			System.out.println("Sorry, your category has not created.\nMaybe, it's already exists.");
		} else {
			System.out.println("Congratulation, you have one more category.");
		}
	}

	/**
	 * method to create a category
	 */
	protected static boolean createCategory(String name) {
		String correctFormatName = Character.toString(Character.toUpperCase(name.charAt(0))) + name.substring(1);
		int result = SERVICE.getFoodDBServicePort().createCategory(correctFormatName);
		if (result == -1) {
			System.out.println("Sorry, your category has not created.\nMaybe, it's already exists.");
			return false;
		} else {
			System.out.println("Congratulation, you have one more category.");
			return true;
		}
	}

	/**
	 * method to delete a food
	 */
	protected static void deleteFood() {
		String name = Scan.userInputString("What is the food name to delete :");
		boolean result = SERVICE.getFoodDBServicePort().deleteFoodAttribute(name);
		if (result) {
			System.out.println("Your food has been correctly deleted.");
		} else {
			System.out.println("Sorry, your food is not deleted.");
		}
	}

	/**
	 * method to manage a category when we want add a food, if category does not
	 * exist, then it's created.
	 * 
	 * @return
	 */
	private static String manageCategory() {
		String category ="";
		boolean result = false;
		int choice = -1;
		do {
			category = Scan.userInputString("What is the food category :");
			result = SERVICE.getFoodDBServicePort().categoryFindByName(category);
			if (!result) {
				System.out.println("Your category does not exist.");
				System.out.println("0 - Retry to write it");
				System.out.println("1 - Create it");
				choice = Scan.userInputIntPositive("What your choice :");
				switch (choice) {
				case 0:
					break;
				case 1:
					boolean response = createCategory(category);
					if (response) {
						result = true;
					}
					break;
				default:
					System.err.println("Your choice is not correct. Please try again");
					break;
				}
			}
		} while (!result);
		return category;
	}

}
