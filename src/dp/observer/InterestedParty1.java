package dp.observer;

import java.util.Observable;

public class InterestedParty1<T> implements Observor<T> {
	private String name ;
	public InterestedParty1(String name) {
		this.name = name;
	}


	@Override
	public void onChange(T newVal, T oldVal) {
		System.out.printf("Got the old value changed to new val in %s  %d \n" , name, newVal);
		
	}


}
