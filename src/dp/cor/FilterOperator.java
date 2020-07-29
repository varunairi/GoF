package dp.cor;

public class FilterOperator {
	private Filter filter;
	public FilterOperator(Filter filter) {
		this.filter = filter;
	}
	
	public void process(String s) {
		this.filter.process(s);
	}

}
