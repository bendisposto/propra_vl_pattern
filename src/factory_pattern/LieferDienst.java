package factory_pattern;

import factory_pattern.factory.concrete.Eisdiele;
import factory_pattern.factory.concrete.Pizzaria;

public class LieferDienst {

	public static void main(String[] args) {
		Pizzaria casaGiacomo = new Pizzaria();
		casaGiacomo.liefern();
		System.out.println("======================================================");
		Eisdiele bbb = new Eisdiele();
		bbb.liefern();
	}
}
