package dp.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	private List<String> queue = new ArrayList<String>(10);
	public void accept(String s)
	{
		queue.add(s);
	}
}
