package dp.cor;

public class LowerCaseFilter implements Filter {
	private Filter _nextFilter;
	public LowerCaseFilter(Filter filter) {
		_nextFilter=filter;
	}

	@Override
	public void process(String s) {
		System.out.println("Lower case filter");
		if(s.startsWith("Lower"))
			System.out.println("Lower CAse detected");
		else 
		{
			if(_nextFilter != null)
				_nextFilter.process(s);
		}
	}	

}
