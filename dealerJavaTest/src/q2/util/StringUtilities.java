package q2.util;

/**
 * @author Ahmed Abdelmeged
 * Provides a number of String utility functions
 */
public class StringUtilities {

	/**
	 * @param str
	 * @return true if str is a palindrome modulo casing and the existence of some non-alphanumeric characters
	 */
	public static boolean isPalindromeIgnoreCaseAndNonAlphaNumeric(String str) {
		return isPalindrome(filterOutNonAlphaNumeric(str).toUpperCase());
	}

	/**
	 * @param str
	 * @return str == reverse(str)
	 */
	public static boolean isPalindrome(String str) {
		int beginIndex = 0;
		int endIndex = str.length() - 1;
		while (beginIndex < endIndex) {
			if (str.charAt(beginIndex) != str.charAt(endIndex)) {
				return false;
			}
			beginIndex++;
			endIndex--;
		}
		return true;
	}

	/**
	 * @param str
	 * @return returns str with all non-alphanumeric characters dropped
	 */
	public static String filterOutNonAlphaNumeric(String str) {
		// StringBuilder methods are not synchronized
		StringBuilder sb = new StringBuilder();
		int length = str.length();
		for (int i = 0; i < length; i++) {
			char c = str.charAt(i);
			if (Character.isLetterOrDigit(c)) {
				sb.append(c);
			}
		}
		return sb.toString();
	}

}
