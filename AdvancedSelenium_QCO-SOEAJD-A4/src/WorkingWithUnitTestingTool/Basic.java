package WorkingWithUnitTestingTool;

import org.testng.annotations.Test;
import org.testng.Reporter;

public class Basic {
	@Test
		public void run()
		{
			Reporter.log("Hai", true);
		}

}
