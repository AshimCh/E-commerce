package application;

import java.util.Scanner;

public class Working {

	void new_Working() {
		int pringles = 0;
		int biscuits = 0;
		int noodles = 0;
		int cheese = 0;
		int doritos = 0;
		int ketchup = 0;

		for (int i = 0;;) {

			Scanner scanner = new Scanner(System.in);
			System.out.println("Select from the options below : ");
			System.out.println("\ta. Select food item");
			System.out.println("\tb. Exit");
			final String options = scanner.nextLine();

			if (options.equals("a")) {

				System.out.print("Choose the food item from the options above--> \n");
				final String food_INPUT = scanner.nextLine();

				if (food_INPUT.equalsIgnoreCase("pringles") || food_INPUT.equalsIgnoreCase("biscuits")
						|| food_INPUT.equalsIgnoreCase("chauchau") || food_INPUT.equalsIgnoreCase("cheese")
						|| food_INPUT.equalsIgnoreCase("doritos") || food_INPUT.equalsIgnoreCase("ketchup")

				) {
					System.out.print("Enter the number of quantity you want to purchase--> \n");
					final int quantity_INPUT = scanner.nextInt();

					if (food_INPUT.equalsIgnoreCase("pringles")) {
						pringles += quantity_INPUT;
					} else if (food_INPUT.equalsIgnoreCase("biscuits")) {
						biscuits += quantity_INPUT;
					} else if (food_INPUT.equalsIgnoreCase("chauchau")) {
						noodles += quantity_INPUT;
					} else if (food_INPUT.equalsIgnoreCase("cheese")) {
						cheese += quantity_INPUT;
					} else if (food_INPUT.equalsIgnoreCase("doritos")) {
						doritos += quantity_INPUT;
					} else {
						ketchup += quantity_INPUT;
					}

				}

				else {
					System.out.println("Please enter the food items from the list above");
				}
			}

			else if(options.equalsIgnoreCase("b")) {
				int Total = ((pringles * 60) + (biscuits * 55) + (noodles * 45) + (cheese * 120) + (doritos * 150)
						+ (ketchup * 250));
				System.out.printf("Your total bill is-->Rs.%d\n", Total);
				System.out.println("\t\tThank you!");
				System.out.println("\t    Do visit us again");


				break;
			}
			else {
				System.out.println("Please enter the option a or b!!!!");
			}

		}

	}
}
