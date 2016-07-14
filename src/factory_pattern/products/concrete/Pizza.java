package factory_pattern.products.concrete;

import factory_pattern.products.Mahlzeit;

public class Pizza implements Mahlzeit {

	public void zubereiten() {
		System.out.println("Pizza gebacken.");
	}

	public String getName() {
		return "Pizza";
	}

}
