package factory_pattern.factory.concrete;

import factory_pattern.factory.AbstractMahlzeitFactory;
import factory_pattern.products.Mahlzeit;
import factory_pattern.products.concrete.Eisbecher;

public class Eisdiele extends AbstractMahlzeitFactory {

	public Mahlzeit getProduct() {
		return new Eisbecher();
	}

}
