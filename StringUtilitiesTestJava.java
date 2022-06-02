package package001_atTest_assertEquals_assertNotEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.shadow.com.univocity.parsers.annotations.LowerCase;
import org.junit.jupiter.params.shadow.com.univocity.parsers.conversions.UpperCaseConversion;

public class StringUtilitiesTestJava {
	
	@Test
	public void testVowelCount() {
		String p = "Ello";
		String a = "Apple";
		String t = "apple";
		
		StringUtilities utilities = new StringUtilities();
		assertTrue(utilities.isCapitalized(p));
		assertFalse(utilities.isCapitalized(t));
		
	}

	
	
}
