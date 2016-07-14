package factory_pattern.factory;

import factory_pattern.products.Mahlzeit;

public abstract class AbstractMahlzeitFactory {

	public abstract Mahlzeit getProduct();

	public void liefern() {
		bestellen();
		Mahlzeit product = getProduct();
		product.zubereiten();
		verpacken(product);
		ausliefern();
	}

	private void bestellen() {
		System.out.println("Bestellung annehmen");
	}

	private void verpacken(Mahlzeit m) {
		System.out.println(m.getName() + " verpacken");
	}

	private void ausliefern() {
		System.out.println("Mahlzeit ausliefern");
	}

}
