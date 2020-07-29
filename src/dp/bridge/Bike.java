package dp.bridge;

public class Bike implements Vehicle {

	private Transmission transmission;
	private int wheels;
	private boolean hasSpare;
	public Bike(int wheels, boolean hasSpare, Transmission transmission) {
		this.wheels = wheels;
		this.hasSpare = hasSpare;
		this.transmission = transmission;
	}
	@Override
	public String describeVehicle() {
		return "Bike with 2 wheels, transmission: " + this.transmission +
				(this.hasSpare?" and a spare tire ": "");
	}
}
