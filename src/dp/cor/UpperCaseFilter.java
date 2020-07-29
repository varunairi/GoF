package dp.cor;

public class UpperCaseFilter implements Filter {
	private Filter _nextFilter;
	public UpperCaseFilter(Filter filter) {
		this._nextFilter = filter;
	}

	@Override
	public void process(String s) {
		System.out.println("Upper  case filter");
		if(s.startsWith("Upper"))
			System.out.println("Upper CAse detected: " + s.toUpperCase());
		else 
		{
			if(_nextFilter != null)
				_nextFilter.process(s);
		}
	}	

}
