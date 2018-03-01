/**
 * 
 */
package com.test.travisTest;

import static org.junit.Assert.*;

import org.junit.Test;

import com.travis.test.TravisTest;

/**
 * @author somasu04
 *
 */
public class TravisTestCase {

	@Test
	public void test() {
		assertTrue(new TravisTest().test(1, 2) == 3);
	}
}
