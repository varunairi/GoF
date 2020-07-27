package dp.decorator;

public class EventEmittingFunctionality implements BaseFunctionality {

	private BaseFunctionality bb;
	public EventEmittingFunctionality(BaseFunctionality bb) {
		this.bb=bb;
	}

	@Override
	public void doSomething() {
		System.out.println("Sending to Kafka as well ");
		if(this.bb !=null)
			this.bb.doSomething();
	}

}
