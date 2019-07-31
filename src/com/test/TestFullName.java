package com.test;
import static org.junit.Assert.fail;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.main.FullName;
import com.main.FullName.Title;

class TestFullName {

	@Rule
	public Timeout timeout = Timeout.seconds(10);

	@Test
	void testConstructor() {
		try {
			FullName fullName = new FullName(Title.Mr, "A", "Ant");
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	void testToString() {
		try {
			FullName fullName = new FullName(Title.Mr, "A", "Ant");
			System.out.println(fullName.toString());
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

}
