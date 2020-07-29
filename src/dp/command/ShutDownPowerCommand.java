package dp.command;

public class ShutDownPowerCommand implements Command{
	
	private PowerPlantOperationAsReciever recieve;
	public ShutDownPowerCommand(PowerPlantOperationAsReciever recieve) {
		this.recieve = recieve;
	}
	
	public void execute() {
		this.recieve.shutDownPowerGeneration();
		
	}

}
