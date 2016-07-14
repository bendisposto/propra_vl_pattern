package decorator_pattern;

public class Tomatensosse extends PizzaDecorator {

	public Tomatensosse(Pizza pizza) {
		super(pizza);
	}

	public String describe() {
		return pizza.describe() + ", Tomatensoße";
	}

	public double preis() {
		return pizza.preis() + 0.3;
	}

}
