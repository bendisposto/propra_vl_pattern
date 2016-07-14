package builder_pattern;

import static builder_pattern.Belag.*;
import static builder_pattern.Groesse.*;

import java.security.KeyPairGenerator;
import java.util.HashSet;
import java.util.Set;

public class PizzaBuilder {

	Set<Belag> belaege = new HashSet<>();

	public Pizza backen() {
		if (belaege.size() > 3)
			return new Pizza(GROSS, belaege);
		else
			return new Pizza(KLEIN, belaege);
	}

	public PizzaBuilder belegen(Belag belag) {
		belaege.add(belag);
		if (belag == Ananas || belag == Schinken) {
			belaege.add(Ananas);
			belaege.add(Schinken);
		}
		if (belag == Salami || belag == Pepperoni) {
			belaege.add(Salami);
			belaege.add(Pepperoni);
		}
		if (belag == Sardellen) {
			belaege.remove(Champignons);
		}
		if (belag == Champignons) {
			belaege.remove(Sardellen);
		}
		return this;
	}

	public static void main(String[] args) {
		new PizzaBuilder()
				.belegen(Salami)
				.belegen(Sardellen)
				.belegen(Champignons)
				.belegen(Feta)
				.backen()
				.describe();

	}

}
