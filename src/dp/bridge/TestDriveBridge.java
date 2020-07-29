package dp.bridge;

public class TestDriveBridge {

	public static void main(String[] args) {
		Transmission auto = new AutoTransmission(6);
		Transmission manual= new ManualTransmission (5);
		Vehicle v  = new Car(4, true, auto);
		Vehicle v1 = new Car (4, false, manual);
		
		Vehicle v2 = new Bike(2, false, manual);
		
		System.out.println(v.describeVehicle());
		System.out.println(v1.describeVehicle());
		System.out.println(v2.describeVehicle());
	}
}
