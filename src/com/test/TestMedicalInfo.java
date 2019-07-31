package com.test;
import static org.junit.Assert.fail;

import org.json.simple.JSONObject;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.Timeout;

import com.main.MedicalInfo;
import com.main.MedicalInfo.*;

public class TestMedicalInfo {
	
	String[] allergy = new String[] {"PeanutButter","Jello"};

	@Rule
	public Timeout timeout = Timeout.seconds(10);

	@Test
	public void testConstructor() {
		try {
			MedicalInfo medicalInfo = new MedicalInfo(
					BloodType.A,
					BloodRH.Minus,
					IsDrugAllergic.Yes,
					allergy
					);
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testToJSON() {
		try {
			MedicalInfo medicalInfo = new MedicalInfo(
					BloodType.A,
					BloodRH.Minus,
					IsDrugAllergic.Yes,
					allergy
					);
			JSONObject obj = medicalInfo.toJSON();
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

	@Test
	public void testToString() {
		try {
			MedicalInfo medicalInfo = new MedicalInfo(
					BloodType.A,
					BloodRH.Minus,
					IsDrugAllergic.Yes,
					allergy
					);
			System.out.println(medicalInfo.toString());
		} catch (Exception e) {
			fail("Unexpectedly crash.");
		}
	}

}
