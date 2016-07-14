package decorator_pattern;

public class Mozarella extends PizzaDecorator {

	public Mozarella(Pizza pizza) {
		super(pizza);
	}

	public String describe() {
		return pizza.describe() + ", frischer Mozarella";
	}

	public double preis() {
		return pizza.preis() + 0.8;
	}

}
