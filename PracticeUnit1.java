package package001_atTest_assertEquals_assertNotEquals;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

public class PracticeUnit1 {
	
	int x = 2;
	int y = 2;
	int z = 3;
	
	@Test
	public void Equal() {
		assertTrue(true);
	}
	
	@Test
	public void Equal2() {
		assertTrue(x == y);
	}
	
	@Test
	public void NotEqual() {
		assertTrue(true);
	}
	
	@Test
	public void NotEqual2() {
		assertNotEquals(z, y);
	}
}
