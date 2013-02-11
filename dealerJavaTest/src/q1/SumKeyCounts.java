package q1;

import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

import q1.util.LineProcessor;

import static q1.util.ReaderUtilities.*;

public class SumKeyCounts {
	
	/**
	 * @param args
	 * @throws IOException
	 * 
	 * The entry point for question 1.
	 * 
	 * Usage: SumKeyCounts <fileName>
	 * Where <fileName> is the name of a line structured file 
	 * where each line is further structured as key,count
	 * Prints out the total counts of each key 
	 */
	public static void main(String[] args) throws IOException {
		if (args.length != 1) {
			System.err.println("Usage: SumKeyCounts <fileName>");
		} else {
			Reader reader = new FileReader(args[0]);
			LineProcessor processor = new KeyCountSummingLineProcessor();
			processLineStructuredReader(reader, processor);
			System.out.println(processor);
		}
	}
	
}
