package observer_pattern;

public class Ofen extends AbstractSubject<Ofen> {

	private int vorheizzeit;

	public Ofen(int vorheizzeit) {
		this.vorheizzeit = vorheizzeit;
		setRealThing(this);
	}

	public void anschalten() {
		System.out.println("Ofen vorheizen");
		try {
			Thread.sleep(vorheizzeit);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		new Thread(() -> notifyObservers()).start();
	};

}
