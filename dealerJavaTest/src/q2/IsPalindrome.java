package q2;

import static q2.util.StringUtilities.*;

public class IsPalindrome {
	
	/**
	 * @param args
	 * 
	 * The entry point for question 2.
	 * 
	 * Usage: IsPalindrome <string>
	 * 
	 * prints out true if the given string is a palindrome ignoring
	 * both case and non-alphanumeric characters.
	 * A palindrome is a word or phrase that is spelled exactly the 
	 * same forwards or backwards (e.g. pop).
	 * 
	 * hint: the input string can be wrapped in double quotes if
	 * necessary.
	 */
	public static void main(String[] args) {
		if (args.length != 1) {
			System.err.println("Usage: IsPalindrome <string>");
		} else {
			System.out.println(
					isPalindromeIgnoreCaseAndNonAlphaNumeric(args[0])
					);
		}

	}
	
}
