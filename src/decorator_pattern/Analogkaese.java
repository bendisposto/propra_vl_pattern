package decorator_pattern;

public class Analogkaese extends PizzaDecorator {

	public Analogkaese(Pizza pizza) {
		super(pizza);
	}

	@Override
	public String describe() {
		return pizza.describe() + ", Analogkaese";
	}

	@Override
	public double preis() {
		return pizza.preis() + 0.2;
	}

}
