package com.test;
import static org.junit.Assert.fail;

import org.json.simple.JSONObject;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.main.*;
import com.main.FullName.Title;

public class TestContactInfo {

	FullName fullName = new FullName(Title.Ms,"B","Bird");
	EmergencyContact emergencyContact = new EmergencyContact(
			fullName,
			"Friend-zoned",
			"0812345678"
			);
	Address currentAddress = new Address(
			"123",
			"bangbon 5",
			"bangbon",
			"bangbon",
			"bangkok",
			"",
			"10150",
			"thailand"
			);
	String currentMobileNo = "0898765432";
	Address workAddress = new Address(
			"88",
			"Tri Phet",
			"Wang Burapha Phirom",
			"Phra Nakhon",
			"bangkok",
			"",
			"10200",
			"thailand"
			);
	
	@Rule
	public Timeout timeout = Timeout.seconds(10);

	@Test
	public void testConstructor() {
		try {
			ContactInfo contactInfo = new ContactInfo(
					currentAddress,
					currentMobileNo,
					workAddress,
					emergencyContact
					);
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testToJSON() {
		try {
			ContactInfo contactInfo = new ContactInfo(
					currentAddress,
					currentMobileNo,
					workAddress,
					emergencyContact
					);
			JSONObject obj = contactInfo.toJSON();
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testToString() {
		try {
			ContactInfo contactInfo = new ContactInfo(
					currentAddress,
					currentMobileNo,
					workAddress,
					emergencyContact
					);
			System.out.println(contactInfo.toString());
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

}
