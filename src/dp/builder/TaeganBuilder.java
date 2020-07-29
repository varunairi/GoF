package dp.builder;

public class TaeganBuilder implements BuildABearBuilder {

	private ToyBear p;
	public TaeganBuilder() {
		this.p= new ToyBear();
	}

	@Override
	public void pickSkin() {
		this.p.setSkinStyle("Cat");

	}

	@Override
	public void fillTheBear() {
		this.p.setIsFilled(true);

	}

	@Override
	public void sewTheBear() {
		//do something different with sewing and Then
		this.p.isSewn(true);

	}
	
	public ToyBear getProduct() {
		return this.p;
	}
	

}
