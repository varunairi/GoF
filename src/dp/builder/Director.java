package dp.builder;

public class Director {

	public Director() {
		// TODO Auto-generated constructor stub
	}

	
	public void buildABear(BuildABearBuilder builder) {
		builder.pickSkin();
		builder.fillTheBear();
		builder.sewTheBear();
	}
}
