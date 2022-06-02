package package001_atTest_assertEquals_assertNotEquals;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertNotEquals;
import static org.junit.jupiter.api.Assertions.*;

public class Practice2 {
	
	int x = 2;
	int y = 2;
	int z = 3;
	
	boolean a = (x == y);
	boolean b = (y == z);
	
	@Test
	public void PracticeTest1() {
		assertTrue(a);
	}
	
	@Test
	public void PracticeTest2() {
		assertFalse(b);
	}
	
}
