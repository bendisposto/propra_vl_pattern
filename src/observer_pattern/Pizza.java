package observer_pattern;

public class Pizza extends AbstractSubject<Pizza> implements Observer<Ofen> {

	private int backzeit;
	private String art;

	public Pizza(String art, int backzeit) {
		this.art = art;
		this.backzeit = backzeit;
		setRealThing(this);
	}

	public String toString() {
		return art;
	}

	void backen() {
		try {
			System.out.println("Pizza " + art + " wird gebacken");
			Thread.sleep(backzeit);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void update(Ofen theThing) {
		backen();
		new Thread(() -> notifyObservers()).start();
	}

}
