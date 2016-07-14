package chain_of_responsibility_pattern.pizzas;

public class Prosciutto implements Pizza {

	@Override
	public void describe() {
		System.out.println("Pizza mit Schinken");
	}

}
