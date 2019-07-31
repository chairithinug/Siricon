package com.main;
import java.util.Arrays;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * @author Anapat Chairithinugull
 *
 */
public class Patient {
	public static enum MedicalInsurance {
		Government, Corporation, Other
	}
	
	private FullName fullName;
	private PersonalInfo personalInfo;
	private MorePersonalInfo morePersonalInfo;
	private MedicalInfo medicalInfo;
	private ContactInfo contactInfo;
	private MedicalInsurance medicalInsurance;
	private String[] medicalProviders;

	public Patient(
			FullName fullName,
			PersonalInfo personalInfo,
			MorePersonalInfo morePersonalInfo,
			MedicalInfo medicalInfo,
			ContactInfo contactInfo,
			MedicalInsurance medicalInsurance,
			String[] medicalProviders
			)
	{
		this.setFullName(fullName);
		this.setPersonalInfo(personalInfo);
		this.setMorePersonalInfo(morePersonalInfo);
		this.setMedicalInfo(medicalInfo);
		this.setContactInfo(contactInfo);
		this.setMedicalInsurance(medicalInsurance);
		this.setMedicalProviders(medicalProviders);
	}
	
	@SuppressWarnings("unchecked")
	public JSONObject toJSON() {
		JSONObject object = new JSONObject();
		object.put("fullName", this.getFullName().toString());
		object.put("personalInfo", this.getPersonalInfo().toJSON());
		object.put("morePersonalInfo", this.getMorePersonalInfo().toJSON());
		object.put("medicalInfo", this.getMedicalInfo().toJSON());
		object.put("contactInfo", this.getContactInfo().toJSON());
		object.put("medicalInsurance", this.getMedicalInsurance().toString());
		JSONArray jsonArray = new JSONArray();
		jsonArray.addAll(Arrays.asList(this.getMedicalProviders()));
		object.put("medicalProviders", jsonArray);
		return object;
	}

	@Override
	public String toString() {
		JSONObject object = this.toJSON();
		return object.toString();
	}
	
	public FullName getFullName() {
		return fullName;
	}
	
	public PersonalInfo getPersonalInfo() {
		return personalInfo;
	}
	
	public MorePersonalInfo getMorePersonalInfo() {
		return morePersonalInfo;
	}
	
	public MedicalInfo getMedicalInfo() {
		return medicalInfo;
	}
	
	public ContactInfo getContactInfo() {
		return contactInfo;
	}

	public MedicalInsurance getMedicalInsurance() {
		return this.medicalInsurance;
	}

	public String[] getMedicalProviders() {
		return this.medicalProviders;
	}
	
	public void setFullName(FullName fullName) {
		this.fullName = fullName;
	}
	
	public void setPersonalInfo(PersonalInfo personalInfo) {
		this.personalInfo = personalInfo;
	}
	
	public void setMorePersonalInfo(MorePersonalInfo morePersonalInfo) {
		this.morePersonalInfo = morePersonalInfo;
	}
	
	public void setMedicalInfo(MedicalInfo medicalInfo) {
		this.medicalInfo = medicalInfo;
	}
	
	public void setContactInfo(ContactInfo contactInfo) {
		this.contactInfo = contactInfo;
	}

	public void setMedicalInsurance(MedicalInsurance medicalInsurance) {
		this.medicalInsurance = medicalInsurance;
	}

	public void setMedicalProviders(String[] medicalProviders) {
		this.medicalProviders = medicalProviders;
	}
	
}
