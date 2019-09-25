package classes;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class nameTest {

	@Test
	public void test() {
		test a =  new test();
		String name = a.name("kirat");
	    assertEquals("kirat", name);
	}

}
