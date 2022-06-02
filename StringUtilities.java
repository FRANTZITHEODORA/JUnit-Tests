package package001_atTest_assertEquals_assertNotEquals;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.LowerCase;
import org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.UpperCaseConversion;

import static org.junit.jupiter.api.Assertions.*;

import java.util.HashSet;

public class StringUtilities {
	HashSet<Character> lowerCaseVowels = new HashSet<Character>();
	HashSet<Character> upperCaseVowels = new HashSet<Character>();
	
	public StringUtilities() {
		lowerCaseVowels.add('a');
		lowerCaseVowels.add('e');
		lowerCaseVowels.add('i');
		lowerCaseVowels.add('o');
		lowerCaseVowels.add('u');
		upperCaseVowels.add('A');
		upperCaseVowels.add('E');
		upperCaseVowels.add('I');
		upperCaseVowels.add('O');
		upperCaseVowels.add('U');
	}
	
	public int vowelCount(String s) {
		int count = 0;
		if (s == null) {return 0;}
		for (int i = 0; i<s.length();i++) {
			if (lowerCaseVowels.contains(s.charAt(i))) {count++;}
			else if (upperCaseVowels.contains(s.charAt(i))) {count++;}
		}
		return count;
	}
	
	public boolean isCapitalized(String s) {
		if (s == null || s.length() == 0) {return false;}
		else return (upperCaseVowels.contains(s.charAt(0)));
	}
	
	
	public void testVowelCount() {
		String s = "hello";
		String h = "xyz";
		String n = "";
		String v = null;
		StringUtilities utilities = new StringUtilities();
		assertEquals(2, utilities.vowelCount(s));
		
	}

}
