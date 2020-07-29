package dp.bridge;

public class AutoTransmission implements Transmission {

	public AutoTransmission(int g) {
		this.gears = g;
	}

	private int gears;
	@Override
	public void setGears(int g) {
		this.gears = g;

	}

	public String toString() {
		return "[Automatic Transmission with " + this.gears + " gears]";
	}
}
