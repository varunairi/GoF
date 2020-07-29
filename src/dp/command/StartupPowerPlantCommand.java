package dp.command;

public class StartupPowerPlantCommand implements Command {

	private PowerPlantOperationAsReciever rec;
	public StartupPowerPlantCommand(PowerPlantOperationAsReciever rec) {
		this.rec = rec;
	}

	@Override
	public void execute() {
		this.rec.startGeneratingPower();
		
	}

}
