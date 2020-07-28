package dp.command;

public class TestCommand {

	public static void main(String[] args) {
		Receiver reciever = new Receiver();	
		ConcreteCommand command = new ConcreteCommand(reciever);
		ConcreteCommand2 cmd2 = new ConcreteCommand2(reciever);
			Invoker invoker  = new Invoker();
			invoker.execute(cmd2);
			invoker.execute(command);
	}
}
