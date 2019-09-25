package classes;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class squareTest {

	@Test
	public void test() {
		test a = new test();
		int output = a.square(3);
		assertEquals(9, output);
	}
	

}
