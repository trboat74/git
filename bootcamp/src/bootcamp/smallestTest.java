package bootcamp;

import static org.junit.Assert.*;

import org.junit.Test;

public class smallestTest {

	@Test
	public void test() {
		
		bootcamp obj = new bootcamp();
		int[] testNum = {10,9,8,0,23,2,4,13,512,3423};
		int returned = obj.smallest(testNum);
		assertEquals(0, returned);
	}

}
