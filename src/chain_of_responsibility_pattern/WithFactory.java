package chain_of_responsibility_pattern;

import chain_of_responsibility_pattern.pizzas.Pizza;

public class WithFactory {
	public static void main(String[] args) {
		String selection = PizzaHelper.askForSelection();

		PizzaFactory bellaitalia = new PizzaFactory();
		Pizza selectedPizza = bellaitalia.getPizza(selection);

		PizzaHelper.printPizza(selectedPizza);
	}
}
