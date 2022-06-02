package package001_atTest_assertEquals_assertNotEquals;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class AssertFalse {
	
	@Test
	public void test1() {
		assertFalse(false);
	}
	
	@Test
	public void test2() {
		assertFalse(1 == 2);
	}
	
	
	@Test
	public void test3() {
		assertFalse("abc".length() == 4);
	}

}
