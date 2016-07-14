package decorator_pattern;

public class Pizzaria {
	public static void main(String[] args) {
		Pizza lecker = new Mozarella(new Tomatensosse(new NurTeig()));
		Pizza fies = new Analogkaese(new Tomatensosse(new NurTeig()));
		Pizza vegan = new Tomatensosse(new NurTeig());
		System.out.println(lecker.describe() + " " + lecker.preis());
		System.out.println(fies.describe() + " " + fies.preis());
		System.out.println(vegan.describe() + " " + vegan.preis());
	}
}
