package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		assertEquals(5, jUnitFunctions.AddNumbers(2,3));
	}

}
