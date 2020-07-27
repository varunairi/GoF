package dp.observer;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class ExceptionEvent implements Event {

	private List<Observor> observorQueue = new CopyOnWriteArrayList<>();
	private int oldVal;
	private int newVal;
	public ExceptionEvent() {
		
	}

	@Override
	public void registerObservor(Observor o) {
		this.observorQueue.add(o);
	}

	@Override
	public boolean unRegisterObserver(Observor o) {
		return this.observorQueue.remove(o);
	}

	@Override
	public void someThingChanged() {
		this.oldVal=this.newVal;
		this.newVal=(int)(Math.random()*10);
		notifyObservors();

	}

	@Override
	public
	 void notifyObservors() {
		observorQueue.forEach(data -> data.onChange((Integer)newVal, (Integer)oldVal));
	}

}
