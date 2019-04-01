package com.evry.Junittopic;

import org.junit.Test;

import junit.framework.TestCase;

/**
 * Unit test for simple App.
 */
public class AppTest extends TestCase {
	@Test
	public void testcheckMin() {
		assertEquals(6, App.checkMin(new int[] { 10, 6, 8, 9 }));
	}

	@Test
	public void testCube() {
		assertEquals(27, App.calCube(3));
	}
}
