package observer_pattern;

import java.util.HashSet;
import java.util.Set;

public abstract class AbstractSubject<T> {

	private T realThing;

	public void setRealThing(T realThing) {
		this.realThing = realThing;
	}

	Set<Observer> observers = new HashSet<>();

	void addObserver(Observer observer) {
		observers.add(observer);
	}

	void removeObserver(Observer observer) {
		observers.remove(observer);
	}

	void notifyObservers() {
		for (Observer observer : observers) {
			observer.update(realThing);
		}
	}

}
