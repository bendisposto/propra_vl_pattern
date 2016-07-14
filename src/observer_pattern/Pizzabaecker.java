package observer_pattern;

public class Pizzabaecker implements Observer<Pizza> {

	public static void main(String[] args) {
		Pizzabaecker luigi = new Pizzabaecker();
		Pizza diavolo = new Pizza("Diavolo", 2000);
		Pizza hawaii = new Pizza("Hawaii", 4000);
		Ofen ofen = new Ofen(500);

		diavolo.addObserver(luigi);
		hawaii.addObserver(luigi);

		ofen.addObserver(hawaii);
		ofen.addObserver(diavolo);

		ofen.anschalten();

	}

	@Override
	public void update(Pizza theThing) {
		System.out.println("Pizza " + theThing.toString() + " aus dem Ofen holen");

	}

}
