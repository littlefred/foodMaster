/**
 * 
 */
package foodMaster;


import tools.Scan;

/**
 * @author Frederick main class of application to manage the differents options
 */
public class FoodMenu {
	/**
	 * attribute to save the main menu choice of the user
	 */
	private static int menuChoice = -1;
	
	/**
	 * @return the menuChoice
	 */
	public static int getMenuChoice() {
		return menuChoice;
	}

	/**
	 * @param menuChoice the menuChoice to set
	 */
	public static void setMenuChoice(int menuChoice) {
		FoodMenu.menuChoice = menuChoice;
	}

	/**
	 * main body to display the application
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Welcome in the food management application.");
		do {
			System.out.println("What do you want to do ?");
			System.out.println("1 - View foods");
			System.out.println("2 - Create a food");
			System.out.println("0 - Quit the application");
			menuChoice = Scan.userInputIntPositive("your choice : ");
			switch (menuChoice) {
			case 1:
				DisplayMenu.listMenu();
				break;
			case 2:
				CreateMenu.listMenu();
				break;
			case 0:
				System.out.println("Thank you and goodbye !");
				break;
			default:
				System.err.println("Your choice is not possible, please try again.");
				break;
			}
		} while (menuChoice != 0);
	}

}
