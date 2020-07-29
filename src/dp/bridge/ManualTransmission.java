package dp.bridge;

public class ManualTransmission  implements Transmission{

	public ManualTransmission(int g) {
		this.gears = g;
	}
	private int gears;
	@Override
	public void setGears(int g) {
		this.gears = g;
	}
	
	public String toString() {
		return "[Manual Transmission with " + this.gears + " gears]";
	}
}
