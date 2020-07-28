package dp.command;

import java.util.ArrayList;
import java.util.List;

public class Invoker {
	
	public void execute(Command cmd) {
		cmd.execute();
	}
}
