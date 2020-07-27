package dp.decorator;

public class TestCreateDecorator {

	public TestCreateDecorator() {
		// TODO Auto-generated constructor stub
	}
	public static void main(String[] args) {
		BaseFunctionality bf = 
				new LoggingFunctionality(new EventEmittingFunctionality(new MagicFunctionality()));
		bf.doSomething();
		
		BaseFunctionality onlyLogging = 
				new LoggingFunctionality(new MagicFunctionality());
		onlyLogging.doSomething();
	}
}
