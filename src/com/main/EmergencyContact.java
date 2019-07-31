package com.main;
import org.json.simple.JSONObject;

/**
 * @author Anapat Chairithinugull
 *
 */
public class EmergencyContact {
	private FullName fullName;
	private String relationship;
	private String mobileNo; // Need to check valid number
	
	public EmergencyContact(
			FullName fullName,
			String relationship,
			String mobileNo
			)
	{
		this.setFullName(fullName);
		this.setRelationship(relationship);
		this.setMobileNo(mobileNo);
	}
	
	@SuppressWarnings("unchecked")
	public JSONObject toJSON() {
		JSONObject object = new JSONObject();
		object.put("fullName", this.getFullName().toString());
		object.put("relationship", this.getRelationship());
		object.put("mobileNo", this.getMobileNo());
		return object;
	}
	
	@Override
	public String toString() {
		JSONObject object = this.toJSON();
		return object.toString();
	}
	
	private void setFullName(FullName fullName) {
		this.fullName = fullName;
	}
	
	private void setRelationship(String relationship) {
		this.relationship = relationship;
	}
	
	private void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}
	
	private FullName getFullName() {
		return this.fullName;
	}
	
	private String getRelationship() {
		return this.relationship;
	}
	
	private String getMobileNo() {
		return this.mobileNo;
	}
}
