package simplified_factory_pattern;

public class WithoutFactory {
	public static void main(String[] args) {
		Pizza selectedPizza = null;
		String selection = PizzaHelper.askForSelection();
		switch (selection) {
		case "M":
			selectedPizza = new Margherita();
			break;
		case "H":
			selectedPizza = new Hawaii();
			break;
		case "P":
			selectedPizza = new Prosciutto();
			break;
		}
		PizzaHelper.printPizza(selectedPizza);
	}
}
