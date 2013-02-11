package q1;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import q1.util.LineProcessor;

/**
 * @author Ahmed Abdelmeged 
 * 
 * A line processor where lines are of the form key,count 
 * This LineProcessor sums up the all counts of a particular key. 
 * The toString method produces a report of the sum of the counts
 * of all keys encountered.
 */
public class KeyCountSummingLineProcessor implements LineProcessor {

	private Map<String, Integer> map = new HashMap<String, Integer>();

	/*
	 * (non-Javadoc)
	 * 
	 * @see q1.util.LineProcessor#processLine(java.lang.String)
	 */
	@Override
	public void processLine(String line) {
		String[] splits = line.split(",");
		if (splits.length != 2) {
			throw new RuntimeException(
					"Illformed line: expecting key,count found " + line);
		}
		String key = splits[0].trim();
		Integer count = Integer.parseInt(splits[1].trim());
		Integer prevCount = map.get(key);
		if (prevCount == null) {
			map.put(key, count);
		} else {
			map.put(key, count + prevCount);
		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Entry<String, Integer> entry : map.entrySet()) {
			sb.append("The total for ");
			sb.append(entry.getKey());
			sb.append(" is ");
			sb.append(entry.getValue());
			sb.append(". ");
		}
		if (sb.length() > 0) {
			sb.deleteCharAt(sb.length() - 1);
		}
		return sb.toString();
	}

}
