package dp.observer;

public class TestClassObservor {

	public TestClassObservor() {
		// TODO Auto-generated constructor stub
	}
public static void main(String[] args) {
	Event ex1 = new ExceptionEvent();
	Event ex2 = new ExceptionEvent();
	Event ex3 = new ExceptionEvent();
	
	Observor<Integer> ip1 = new InterestedParty1<>("IP1");
	Observor<Integer> ip2 = new InterestedParty1<>("IP2");
	
	
	ex1.registerObservor(ip2);
	ex1.registerObservor(ip1);
	ex2.registerObservor(ip1);
	
	ex1.someThingChanged();
	ex2.someThingChanged();
	ex1.someThingChanged();
}
}
