package dp.cor;

public class TestDriveCOR {

	public TestDriveCOR() {
		// TODO Auto-generated constructor stub
	}
	
	public static void main(String[] args) {
		FilterOperator filterOp  = new FilterOperator(new LowerCaseFilter (new UpperCaseFilter(null)));
		filterOp.process("Upper: My Message");
	}

}
