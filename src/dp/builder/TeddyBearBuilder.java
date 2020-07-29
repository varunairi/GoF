package dp.builder;

public class TeddyBearBuilder implements BuildABearBuilder {
	
	private ToyBear p;
	public TeddyBearBuilder() {
		this.p = new ToyBear();
	}

	@Override
	public void pickSkin() {
		this.p.setSkinStyle("Bear");

	}

	@Override
	public void fillTheBear() {
		this.p.setIsFilled(true);

	}

	@Override
	public void sewTheBear() {
		this.p.isSewn(true);

	}
	
	public ToyBear getProduct() {
		return this.p;
	}

}
