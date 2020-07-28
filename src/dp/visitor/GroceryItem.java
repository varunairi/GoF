package dp.visitor;

public interface GroceryItem {

	
	public float accept(Visitor visitor);
	
	public float getBasePrice();
	
	public float getTotalPrice();
}
