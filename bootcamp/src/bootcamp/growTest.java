package bootcamp;

import static org.junit.Assert.*;

import org.junit.Test;

public class growTest {

	@Test
	public void test() {
		bootcamp obj = new bootcamp();
		int[] testGrow = {43,123,1234,616};
		int[] returned = obj.grow(testGrow);
		assertEquals (8, returned.length);
	}

}
