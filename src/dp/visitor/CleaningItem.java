package dp.visitor;

public class CleaningItem implements GroceryItem {
	private float basePrice;
	private float tax;
	public CleaningItem(float basePrice) {
		this.basePrice = basePrice;
	}
	@Override
	public float getBasePrice() {
		return this.basePrice;
	}

	@Override
	public float getTotalPrice() {
		
		return this.basePrice + this.tax;
	}

	@Override
	public float accept(Visitor visitor) {
		
		return visitor.visit(this);
	}
}
