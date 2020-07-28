package dp.visitor;

public class TestClassForVistor {

	public TestClassForVistor() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		FoodItem fi = new FoodItem(0.9f);
		CleaningItem ci = new CleaningItem(9.02f);
		
		Visitor vi = new TaxCalcVisitor();
		
		System.out.println("Total Price of Food Item is : $" + (fi.getBasePrice() + fi.accept(vi)));
		System.out.printf("Total Price of Cleaning Item is : $%.2f" , (ci.getBasePrice() + ci.accept(vi)));
	}

}
