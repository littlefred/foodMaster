/**
 * 
 */
package foodMaster;

import tools.FoodAction;
import tools.Scan;

/**
 * @author Frederick
 *
 */
public class CreateMenu extends FoodAction {
	/**
	 * method to display the details menu of display aliments
	 */
	static void listMenu() {
		int userChoice = -1;
		do {
			System.out.println("What do you want to do ?");
			System.out.println("1 - Create a food");
			System.out.println("2 - Return to the main menu");
			System.out.println("0 - Quit the application");
			userChoice = Scan.userInputIntPositive("your choice : ");
			switch (userChoice) {
			case 1:
				System.out.println("create a food");
				break;
			case 2:
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
		} while (userChoice != 0 && userChoice != 2);
	}

}
