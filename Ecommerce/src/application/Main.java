package application;


public class Main {
	String food[][] = { 
			{ "Food Items", "Price" },
			{ "Pringles   ", "Rs.160" },
			{ "Biscuits", "Rs.55" }, 
			{ "Noodles", "Rs.45" }, 
			{ "Cheese","Rs.120"},
			{ "Doritos","Rs.150"},
			{ "Ketchup","Rs.250"},

	};
	void fooditems() {
		
		for (int i = 0; i < food.length; i++) {
			System.out.printf("%d. ", i);
			for (int j = 0; j < food[i].length; j++) {
				System.out.printf("%s\t", food[i][j]);

			}

			System.out.println("\n");
		}
		
		Working working = new Working();
		working.new_Working();
		}
		

	}

