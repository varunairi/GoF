package dp.command;

public class ConcreteCommand2 implements Command {

	private Receiver rec;
	public ConcreteCommand2(Receiver rec) {
		this.rec = rec;
	}

	@Override
	public void execute() {
		this.rec.doConcreteOp2();
		
	}

}
