package com.test;
import static org.junit.Assert.fail;

import org.json.simple.JSONObject;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.main.MorePersonalInfo;
import com.main.MorePersonalInfo.*;

public class TestMorePersonalInfo {

	@Rule
	public Timeout timeout = Timeout.seconds(10);

	@Test
	public void testConstructor() {
		try {
			MorePersonalInfo morePersonalInfo = new MorePersonalInfo(
					"Asian",
					"Thai",
					MaritalStatus.Single,
					"Student",
					Religion.Buddhism
					);
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testToJSON() {
		try {
			MorePersonalInfo morePersonalInfo = new MorePersonalInfo(
					"Asian",
					"Thai",
					MaritalStatus.Single,
					"Student",
					Religion.Buddhism
					);
			JSONObject obj = morePersonalInfo.toJSON();
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testToString() {
		try {
			MorePersonalInfo morePersonalInfo = new MorePersonalInfo(
					"Asian",
					"Thai",
					MaritalStatus.Single,
					"Student",
					Religion.Buddhism
					);
			System.out.println(morePersonalInfo.toString());
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

}
