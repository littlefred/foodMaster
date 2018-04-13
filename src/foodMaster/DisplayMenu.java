package foodMaster;

import tools.FoodAction;
import tools.Scan;

/**
 * 
 * @author Frederick
 * 
 *         class to manage display methods
 */
abstract class DisplayMenu extends FoodAction {
	/**
	 * method to display the details menu of display aliments
	 */
	static void listMenu() {
		int userChoice = -1;
		do {
			System.out.println("What do you want to do ?");
			System.out.println("1 - View the global food list");
			System.out.println("2 - View a list of foods from the name");
			System.out.println("3 - View a food from his reference");
			System.out.println("4 - Return to the main menu");
			System.out.println("0 - Quit the application");
			userChoice = Scan.userInputIntPositive("your choice : ");
			switch (userChoice) {
			case 1:
				displayList(getlist(""));
				break;
			case 2:
				String name = Scan.userInputString("your name filter : ");
				String correctFormatName = Character.toString(Character.toUpperCase(name.charAt(0)))
						+ name.substring(1);
				displayList(getlist(correctFormatName));
				break;
			case 3:
				int id = Scan.userInputIntPositiveWithout0("your reference food : ");
				displayList(getFood(id));
				break;
			case 4:
				FoodMenu.setMenuChoice(-1);
				break;
			case 0:
				FoodMenu.setMenuChoice(-1);
				System.out.println("Thank you and goodbye !");
				break;
			default:
				System.err.println("Your choice is not possible, please try again.");
				break;
			}
		} while (userChoice != 0 && userChoice != 4);
	}

}
