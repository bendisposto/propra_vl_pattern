package simplified_factory_pattern;

import java.util.Scanner;

public class PizzaHelper {

	static void printPizza(Pizza selectedPizza) {
		if (selectedPizza != null) {
			selectedPizza.describe();
		} else {
			System.out.println("Invalide Auswahl");
		}
	}

	static String askForSelection() {
		Scanner s = new Scanner(System.in);
		System.out.print("Wählen Sie Ihre Pizza: M / P / H:");
		String selection = s.nextLine();
		s.close();
		return selection;
	}

}
