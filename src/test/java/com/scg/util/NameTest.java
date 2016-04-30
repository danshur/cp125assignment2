package com.scg.util;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class NameTest {

	@Test
	public void ThreeConstructorsName() {
		String first = "Dan";
		String last = "Shur";
		String middle = "Oleg";

		Name name = new Name(last, first, middle);
		assertTrue(testEqual(last, name.getLastName()));
	}

	private boolean testEqual(String exp, String act) {
		boolean test = exp.equals(act);
		if (!test) {
			System.err.print("String compare failed; ");
			System.err.println("expected: " + exp + " actual: " + act);
		}

		return test;
	}

	

	@Test
	public void testHashCode() {

		String first = "Dan";
		String last = "Shur";
		String middle = "Oleg";

		String first2 = getNewString(first);
		String last2 = getNewString(last);
		String middle2 = getNewString(middle);

		String test = "wrong";

		Name name = new Name(last, first, middle);
		Name dupe = new Name(last2, first2, middle2);
		assertTrue(name.equals(dupe));
		assertEquals((long) name.hashCode(), (long) dupe.hashCode());

		Name wrong = new Name(test, first, middle);
		assertFalse((long) name.hashCode() == (long) wrong.hashCode());

		wrong = new Name(last, test, middle);
		assertFalse((long) name.hashCode() == (long) wrong.hashCode());

		wrong = new Name(last, first, test);
		assertFalse((long) name.hashCode() == (long) wrong.hashCode());

		// Play with null for code coverage
		dupe.setMiddleName(null);
		assertFalse(name.equals(dupe));
		assertFalse(dupe.equals(name));
		name.setMiddleName(null);
		assertEquals((long) name.hashCode(), (long) dupe.hashCode());
		assertEquals(name, dupe);

		dupe.setFirstName(null);
		assertFalse(name.equals(dupe));
		assertFalse(dupe.equals(name));
		name.setFirstName(null);
		assertEquals((long) name.hashCode(), (long) dupe.hashCode());
		assertEquals(name, dupe);

		dupe.setLastName(null);
		assertFalse(name.equals(dupe));
		assertFalse(dupe.equals(name));
		name.setLastName(null);
		assertEquals((long) name.hashCode(), (long) dupe.hashCode());
		assertEquals(name, dupe);
	}

	private String getNewString(String from) {
		char[] cArr = from.toCharArray();
		String dupe = new String(cArr);
		assertTrue(from != dupe);

		return dupe;
	}
}
