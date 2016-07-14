package adapter_pattern;

import java.util.ArrayList;
import java.util.List;

import adapter_pattern.cant_touch_this.Flàmmeküeche;

public class Pizzeria {

	static List<Pizza> speisekarte = new ArrayList<>();

	public static void main(String[] args) {
		speisekarte.add(new Diavolo());
		speisekarte.add(new FlàmmeküecheAdapter(new Flàmmeküeche()));

		for (Pizza pizza : speisekarte) {
			pizza.beschreiben();
		}
	}

}
