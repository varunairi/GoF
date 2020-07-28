package dp.strategy;

public class TestStrategy {

public static void main(String[] args) {
	ComplexFinancialProblem cfp = new ComplexFinancialProblem();
	
	System.out.println(" Londaon Stock Exchange has this price for your stock in local currency " +
				cfp.solve(10, new UKSterlingCurrency()));
	
	System.out.println(" NY Stock Exchange has this price for your stock in local currency " +
			cfp.solve(10, new USCurrency()));
	
	//Strategy with Lambda
	System.out.println(" In your local currency and from Timbuktu Stock exchange is " + 
	cfp.solve(10, ()-> 10)
			);
}
}
