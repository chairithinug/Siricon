package com.test;
import static org.junit.Assert.*;

import java.time.LocalDate;

import org.json.simple.JSONObject;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.main.PersonalInfo;
import com.main.PersonalInfo.Gender;


public class TestPersonalInfo {

	@Rule
	public Timeout timeout = Timeout.seconds(10);

	LocalDate now = LocalDate.now(); // FIXME

	@Test
	public void testConstructor() {
		try {
			PersonalInfo personalInfo = new PersonalInfo(Gender.Male, 25, 62.0, 180.0, now);
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testToJSON() {
		try {
			PersonalInfo personalInfo = new PersonalInfo(Gender.Male, 25, 62.0, 180.0, now);
			JSONObject obj = personalInfo.toJSON();
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testToString() {
		try {
			PersonalInfo personalInfo = new PersonalInfo(Gender.Male, 25, 62.0, 180.0, now);
			System.out.println(personalInfo.toString());
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

}
