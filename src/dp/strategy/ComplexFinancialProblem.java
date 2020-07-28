package dp.strategy;

import java.util.function.Supplier;

public class ComplexFinancialProblem {

	public ComplexFinancialProblem() {
	
	}
	
	public int solve(int seed, CountrySpecificCurrency currencyConvertor) {
		//something really complex happening here.
		//getStockPrice() * getProbabilityOfStockRising()
		float newVal = ((float)seed)*currencyConvertor.getMultiplier();
		return (int)newVal;
	}
	
	/** Approach 2 **/
	public int solve (int seed, Supplier<Integer> supplier) {
		return seed*supplier.get();
	}
}
