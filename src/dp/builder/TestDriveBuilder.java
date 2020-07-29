package dp.builder;

public class TestDriveBuilder {

public static void main(String[] args) {
	
	BuildABearBuilder teddyBearBuilder = new TeddyBearBuilder();
	new Director().buildABear(teddyBearBuilder);
	ToyBear p  = teddyBearBuilder.getProduct();
	
	System.out.println(p);
	
	
}

}
