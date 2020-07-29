package dp.command;

public class TestCommand {

	public static void main(String[] args) {
		PowerPlantOperationAsReciever reciever = new PowerPlantOperationAsReciever();	
		ShutDownPowerCommand command = new ShutDownPowerCommand(reciever);
		StartupPowerPlantCommand cmd2 = new StartupPowerPlantCommand(reciever);
			Invoker invoker  = new Invoker();
			invoker.execute(cmd2);
			invoker.execute(command);
	}
}
