package visitor;

public interface Visitor {
//	public float visit(GroceryItem m);
	
	public float visit(FoodItem fi);
	public float visit(CleaningItem ci);
}
