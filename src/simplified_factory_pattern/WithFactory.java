package simplified_factory_pattern;

public class WithFactory {
	public static void main(String[] args) {
		String selection = PizzaHelper.askForSelection();

		PizzaFactory bellaitalia = new PizzaFactory();
		Pizza selectedPizza = bellaitalia.getPizza(selection);

		PizzaHelper.printPizza(selectedPizza);
	}
}
