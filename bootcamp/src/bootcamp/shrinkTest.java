package bootcamp;

import static org.junit.Assert.*;

import org.junit.Test;

public class shrinkTest {

	@Test
	public void test() {
		bootcamp obj = new bootcamp();
		int[] testShrink = {1, 2, 3, 4, 5, 6, 7, 8};
		int[] returned = obj.shrink(testShrink);
		assertEquals(4, returned.length);
	}

}
