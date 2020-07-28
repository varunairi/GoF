package dp.visitor;

public class TaxCalcVisitor implements Visitor {

	public TaxCalcVisitor() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public float visit(GroceryItem m) {
		throw new IllegalAccessError();
	}

	@Override
	public float visit(FoodItem fi) {
		return 0.0f;

	}

	@Override
	public float visit(CleaningItem ci) {
		return (float) (ci.getBasePrice()*0.15f);

	}

}
