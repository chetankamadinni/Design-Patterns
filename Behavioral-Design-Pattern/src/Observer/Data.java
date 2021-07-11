package Observer;

import java.util.ArrayList;
import java.util.List;

public class Data implements Subject {

	String message;

	List<Observer> observerList;

	public Data() {
		this.observerList = new ArrayList<>();
	}

	@Override
	public void registerObserver(Observer o) {
		observerList.add(o);
	}

	@Override
	public void unregisterObserver(Observer o) {
		observerList.remove(o);
	}

	@Override
	public void notifyAllObservers() {
		for (Observer a : observerList)
			a.update(message);
	}

	public void dataChanged(String message) {
		this.message = message;
		notifyAllObservers();
	}

}
