package chain_of_responsibility_pattern.pizzas;

public class Margherita implements Pizza {

	@Override
	public void describe() {
		System.out.println("Pizza nur mit Tomatensoße und Käse");
	}
}
