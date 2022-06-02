package package001_atTest_assertEquals_assertNotEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertTrue {
	
	@Test
	public void test1() {
		assertTrue(true);
	}
	
	

	@Test
	public void test2() {
		assertTrue(2 == 2);
	}
	

	@Test
	public void test3() {
		assertTrue("abc".length()==3);
	}
	
}
