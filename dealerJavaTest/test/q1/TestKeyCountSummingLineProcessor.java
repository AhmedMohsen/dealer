package q1;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestKeyCountSummingLineProcessor {

	@Test
	public void testProcessLine() {
		KeyCountSummingLineProcessor processor = new KeyCountSummingLineProcessor();
		//Empty lines
		assertEquals("", processor.toString()); 
		processor.processLine("AA,1"); 
		//Single line
		assertEquals("The total for AA is 1.", processor.toString());
		//Spaces
		processor.processLine(" AA , 2 ");
		assertEquals("The total for AA is 3.", processor.toString());
		//Two keys
		processor.processLine("aa,3");
		assertEquals("The total for AA is 3. The total for aa is 3.", processor.toString());
	}

}
