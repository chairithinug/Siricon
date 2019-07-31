package com.main;
import org.json.simple.JSONObject;

/**
 * @author Anapat Chairithinugull
 *
 */
public class ContactInfo {
	private Address currentAddress;
	private String currentMobileNo;
	private Address workAddress;
	private EmergencyContact emergencyContact;
	
	public ContactInfo(
			Address currentAddress,
			String currentMobileNo,
			Address workAddress,
			EmergencyContact emergencyContact
			)
	{
		this.setCurrentAddress(currentAddress);
		this.setCurrentMobileNo(currentMobileNo);
		this.setEmergencyContact(emergencyContact);
		this.setWorkAddress(workAddress);
	}
	
	@SuppressWarnings("unchecked")
	public JSONObject toJSON() {
		JSONObject object = new JSONObject();
		object.put("currentAddress", this.getCurrentAddress().toJSON());
		object.put("currentMobileNo", this.getCurrentMobileNo());
		object.put("workAddress", this.getWorkAddress().toJSON());
		object.put("emergencyContact", this.getEmergencyContact().toJSON());
		return object;
	}
	
	@Override
	public String toString() {
		JSONObject object = this.toJSON();
		return object.toString();
	}

	public Address getCurrentAddress() {
		return this.currentAddress;
	}

	public String getCurrentMobileNo() {
		return this.currentMobileNo;
	}

	public Address getWorkAddress() {
		return this.workAddress;
	}

	public EmergencyContact getEmergencyContact() {
		return this.emergencyContact;
	}

	public void setCurrentAddress(Address CurrentAddress) {
		this.currentAddress = CurrentAddress;
	}

	public void setCurrentMobileNo(String currentMobileNo) {
		this.currentMobileNo = currentMobileNo;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	public void setEmergencyContact(EmergencyContact emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

}
