package q1.util;

/**
 * @author Ahmed Abdelmeged
 * A dummy LineProcessor that concatenates lines together.
 */
public class DummyLineProcessor implements LineProcessor{
	StringBuilder sb = new StringBuilder();
	@Override
	public void processLine(String line) {
		sb.append(line);
		sb.append("\n");
	}
	@Override
	public String toString() {
		return sb.toString();
	}
}
