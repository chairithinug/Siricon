package com.test;
import static org.junit.Assert.fail;

import org.json.simple.JSONObject;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.main.EmergencyContact;
import com.main.FullName;
import com.main.FullName.Title;

public class TestEmergencyContact {
	
	@Rule
	public Timeout timeout = Timeout.seconds(10);
	
	FullName fullName = new FullName(Title.Ms,"B","Bird");

	@Test
	public void testConstructor() {
		try {
			EmergencyContact emergencyContact = new EmergencyContact(
					fullName,
					"Friend-zoned",
					"0812345678"
					);
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}
	
	@Test
	public void testToJSON() {
		try {
			EmergencyContact emergencyContact = new EmergencyContact(
					fullName,
					"Friend-zoned",
					"0812345678"
					);
			JSONObject obj = emergencyContact.toJSON();
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}
	
	@Test
	public void testToString() {
		try {
			EmergencyContact emergencyContact = new EmergencyContact(
					fullName,
					"Friend-zoned",
					"0812345678"
					);
			System.out.println(emergencyContact.toString());
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

}
