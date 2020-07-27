package dp.observer;

public interface Observor <T> {
	public void onChange(T newVal, T oldVal);
}
