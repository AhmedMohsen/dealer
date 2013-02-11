package q2.util;

import static org.junit.Assert.*;
import static q2.util.StringUtilities.*;

import java.util.Locale;

import org.junit.Test;

public class PalindromeTest {

	@Test
	public void testIsPalindromIgnoreCaseAndNonAlphaNumeric() {
		// Empty string
		assertEquals(true, isPalindromeIgnoreCaseAndNonAlphaNumeric(""));
		assertEquals(true, isPalindromeIgnoreCaseAndNonAlphaNumeric("Pop"));
		assertEquals(
				true,
				isPalindromeIgnoreCaseAndNonAlphaNumeric("Ah, satan sees Natasha"));

		// the upper case of "ß" is "SS"
		assertEquals(true, isPalindromeIgnoreCaseAndNonAlphaNumeric("SSß"));

		// Locale sensitive upper case
		Locale defaultLocale = Locale.getDefault();
		Locale.setDefault(new Locale("tr"));
		assertEquals(true,
				isPalindromeIgnoreCaseAndNonAlphaNumeric("\u0131\u0049"));
		assertEquals(true,
				isPalindromeIgnoreCaseAndNonAlphaNumeric("\u0130\u0069"));
		Locale.setDefault(defaultLocale);
	}

	@Test
	public void testIsPalindrome() {
		// Empty string
		assertEquals(true, isPalindrome(""));
		// Single letter
		assertEquals(true, isPalindrome("p"));
		assertEquals(true, isPalindrome("pp"));
		assertEquals(false, isPalindrome("po"));
		assertEquals(true, isPalindrome("pop"));
		assertEquals(true, isPalindrome("pppp"));
		// Casing
		assertEquals(false, isPalindrome("Pop"));
		// Non-Alphanumeric
		assertEquals(true, isPalindrome("p,o,p"));
		// Non-English
		assertEquals(true, isPalindrome("باب"));
	}

	@Test
	public void testFilterOutNonAlphaNumeric() {
		// Non-English
		assertEquals("مرحبابك", filterOutNonAlphaNumeric("مرحبا بك"));
		// Empty string
		assertEquals("", filterOutNonAlphaNumeric(""));
		// All non-alphanumeric
		assertEquals("", filterOutNonAlphaNumeric(";*&^\\_ ,\"%$#@"));
		// All alphanumeric
		assertEquals("abcdefg66", filterOutNonAlphaNumeric("abcdefg66"));
		// Single alphanumeric
		assertEquals("a", filterOutNonAlphaNumeric("a"));
		// Single non-alphanumeric
		assertEquals("", filterOutNonAlphaNumeric("*"));
	}

}
