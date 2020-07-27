package dp.decorator;

public class LoggingFunctionality implements BaseFunctionality {

	private BaseFunctionality base;
	public LoggingFunctionality(BaseFunctionality bb) {
		this.base = bb;
	}

	@Override
	public void doSomething() {
		System.out.println("This is going to Logging ");	
		
		if (this.base !=null)
			{
				this.base.doSomething();
			}

	}

}
