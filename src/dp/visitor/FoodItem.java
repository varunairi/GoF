package dp.visitor;

public class FoodItem implements GroceryItem {
	private float basePrice;
	private float tax;
	public FoodItem(float price) {
		this.basePrice = price;
	}
	public float getBasePrice() {
		return this.basePrice;
	}
	public float getTotalPrice() {
		
		return this.basePrice + this.tax;
	}

	@Override
	public float accept(Visitor visitor) {
		
		return visitor.visit(this);
	}
	

}
