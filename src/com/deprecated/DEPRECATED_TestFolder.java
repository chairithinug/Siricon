package com.deprecated;
import static org.junit.Assert.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;

import org.json.simple.JSONObject;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.main.Address;
import com.main.ContactInfo;
import com.main.DEPRECATED_Order;
import com.main.EmergencyContact;
import com.main.Folder;
import com.main.FullName;
import com.main.MedicalInfo;
import com.main.MorePersonalInfo;
import com.main.Patient;
import com.main.PersonalInfo;

import main.BloodRH;
import main.BloodType;
import main.Gender;
import main.IsDrugAllergic;
import main.MaritalStatus;
import main.MedicalInsurance;
import main.Religion;
import main.Title;

public class DEPRECATED_TestFolder {
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
	
	Patient patient = new Patient(
			fullName,
			personalInfo,
			morePersonalInfo,
			medicalInfo,
			contactInfo,
			MedicalInsurance.Corporation,
			medicalProviders
			);
	
	@Rule
	public Timeout timeout = Timeout.seconds(10);
	
	@Test
	public void testConstructor() {
		try {
			DEPRECATED_Order prescription = new DEPRECATED_Order("Z Zebra", 1, UUID.randomUUID().toString());
			prescription.addMeds(new ArrayList<String>() {
				{
					add("Paracetamol"); 
					add("Aspirin");
				}
			});
			Folder folder = new Folder(patient);
			folder.addDocument(prescription);
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}
	
	@Test
	public void testToString() {
		try {
			DEPRECATED_Order prescription = new DEPRECATED_Order("Z Zebra", 1, UUID.randomUUID().toString());
			prescription.addMeds(new ArrayList<String>() {
				{
					add("Paracetamol"); 
					add("Aspirin");
				}
			});
			Folder folder = new Folder(patient);
			folder.addDocument(prescription);
			System.out.println(folder.toString());
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

}
