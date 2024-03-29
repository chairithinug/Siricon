package com.test;
import static org.junit.Assert.fail;

import java.time.LocalDate;
import org.json.simple.JSONObject;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.main.*;
import com.main.FullName.Title;
import com.main.MedicalInfo.*;
import com.main.MorePersonalInfo.*;
import com.main.Patient.MedicalInsurance;
import com.main.PersonalInfo.Gender;

public class TestPatient {
	
	FullName fullName = new FullName(Title.Mr, "A", "Ant");
	LocalDate now = LocalDate.now();
	PersonalInfo personalInfo = new PersonalInfo(Gender.Male, 25, 62.0, 180.0, now);
	MorePersonalInfo morePersonalInfo = new MorePersonalInfo(
			"Asian",
			"Thai",
			MaritalStatus.Single,
			"Student",
			Religion.Buddhism
			);
	MedicalInfo medicalInfo = new MedicalInfo(
			BloodType.A,
			BloodRH.Minus,
			IsDrugAllergic.Yes,
			new String[] {"PeanutButter","Jello"}
			);
	
	FullName emergencyFullName = new FullName(Title.Ms,"B","Bird");
	EmergencyContact emergencyContact = new EmergencyContact(
			emergencyFullName,
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
	ContactInfo contactInfo = new ContactInfo(
			currentAddress,
			currentMobileNo,
			workAddress,
			emergencyContact
			);
	String medicalProviders[] = {"Thai Insurance","AIA"}; 

	@Rule
	public Timeout timeout = Timeout.seconds(10);

	@Test
	public void testConstructor() {
		try {
			Patient patient = new Patient(
					fullName,
					personalInfo,
					morePersonalInfo,
					medicalInfo,
					contactInfo,
					MedicalInsurance.Corporation,
					medicalProviders
					);
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testToJSON() {
		try {
			Patient patient = new Patient(
					fullName,
					personalInfo,
					morePersonalInfo,
					medicalInfo,
					contactInfo,
					MedicalInsurance.Corporation,
					medicalProviders
					);
			JSONObject obj = patient.toJSON();
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testToString() {
		try {
			Patient patient = new Patient(
					fullName,
					personalInfo,
					morePersonalInfo,
					medicalInfo,
					contactInfo,
					MedicalInsurance.Corporation,
					medicalProviders
					);
			System.out.println(patient.toString());
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

}
