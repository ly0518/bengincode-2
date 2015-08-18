package org.begincode.test;

import static org.junit.Assert.*;

public class TestInteger {

	@org.junit.Test
	public void test() {
		Integer a1 = new Integer(1);
		assertTrue("结果",  1 != a1.intValue());
	}

}
