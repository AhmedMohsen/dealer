package q1.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;

/**
 * @author Ahmed Abdelmeged
 * Provides a number of file utility functions
 */
public class ReaderUtilities {

	/**
	 * @param reader
	 * @param processor
	 * @throws IOException
	 * 
	 * Takes a line structured Reader and a LineProcessor. 
	 * Applies the processor to every line in the Reader.
	 */
	public static void processLineStructuredReader(Reader reader,
			LineProcessor processor) throws IOException {
		BufferedReader br = new BufferedReader(reader);
		String line = br.readLine();
		while (line != null) {
			processor.processLine(line);
			line = br.readLine();
		}
		br.close();
	}

}
