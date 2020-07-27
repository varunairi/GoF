package dp.observer;

public interface Event {
	
	public void registerObservor(Observor o);
	public boolean unRegisterObserver(Observor o);
	
	public void someThingChanged();
	 void notifyObservors();
}
