package builder_pattern;

import static builder_pattern.Belag.*;
import static builder_pattern.Groesse.*;

import java.util.ArrayList;
import java.util.Collection;

public class Pizza {

	private Groesse groesse;
	private Collection<Belag> belaege;

	public Pizza(Groesse groesse, Collection<Belag> belaege) {
		this.groesse = groesse;
		this.belaege = belaege;
	}

	public void describe() {
		System.out.println("Eine " + groesse.toString().toLowerCase() + "e Pizza mit: ");
		for (Belag b : belaege) {
			System.out.println(" - " + b.toString());
		}
	}

	public static void main(String[] args) {
		Collection<Belag> belaege = new ArrayList<>();
		belaege.add(Salami);
		Pizza pizza = new Pizza(GROSS, belaege);
		pizza.describe();
	}
}
