package jUnitTestPackage;

import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		assertEquals("OmSisodia", jUnitFunctions.AddStrings("Om", "Sisodia"));
	}

}
