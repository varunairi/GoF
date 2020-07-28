package dp.command;

public class ConcreteCommand implements Command{
	
	private Receiver recieve;
	public ConcreteCommand(Receiver recieve) {
		this.recieve = recieve;
	}
	
	public void execute() {
		this.recieve.doConcreteSomething();
		
	}

}
