package q1.util;

import static org.junit.Assert.*;

import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;

import org.junit.Test;

import static q1.util.ReaderUtilities.*;

public class TestReaderUtilities {

	@Test
	public void testProcessLineStructuredReader() throws Exception {
		//Empty reader
		LineProcessor processor = new DummyLineProcessor();
		processLineStructuredReader(new StringReader(""), processor);
		assertEquals("", processor.toString());
		
		//non-empty reader, no trailing \n
		String str = "L1\nL2";
		processor = new DummyLineProcessor();
		processLineStructuredReader(new StringReader(str), processor);
		assertEquals("L1\nL2\n", processor.toString());
		
		//non-empty reader, trailing \n
		processor = new DummyLineProcessor();
		processLineStructuredReader(new StringReader(str+"\n"), processor);
		assertEquals("L1\nL2\n", processor.toString());
		
	}

	
}
