package dp.bridge;

public class Car implements Vehicle {
	private Transmission transmission;
	private int wheels;
	private boolean hasSpare;
	public Car(int wheels, boolean hasSpare, Transmission transmission) {
		this.wheels = wheels;
		this.hasSpare = hasSpare;
		this.transmission = transmission;
	}
	@Override
	public String describeVehicle() {
		return "Car with " + this.wheels + " wheels, transmission: " + this.transmission +
				(this.hasSpare?" and a spare tire ": "");
	}
	
	

}
