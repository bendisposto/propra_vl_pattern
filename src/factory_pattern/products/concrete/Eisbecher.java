package factory_pattern.products.concrete;

import factory_pattern.products.Mahlzeit;

public class Eisbecher implements Mahlzeit {

	public void zubereiten() {
		System.out.println("Eis in Becher getan.");
	}

	public String getName() {
		return "Eisbecher";
	}

}
