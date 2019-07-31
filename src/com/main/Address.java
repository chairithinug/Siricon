package com.main;
import org.json.simple.JSONObject;

public class Address {
	private String number;
	private String street;
	private String subDistrict;
	private String district;
	private String province;
	private String state; // Optional for overseas
	private String postalCode;
	private String country;

	public Address(String number,
			String street,
			String subDistrict,
			String district,
			String province,
			String state,
			String postalCode,
			String country)
	{
		this.setNumber(number);
		this.setStreet(street);
		this.setSubDistrict(subDistrict);
		this.setDistrict(district);
		this.setProvince(province);
		this.setState(state);
		this.setPostalCode(postalCode);
		this.setCountry(country);
	}
	
	@SuppressWarnings("unchecked")
	public JSONObject toJSON() {
		JSONObject object = new JSONObject();
		object.put("country", this.getCountry());
		object.put("street", this.getStreet());
		object.put("number", this.getNumber());
		object.put("subDistrict", this.getSubDistrict());
		object.put("district", this.getDistrict());
		object.put("province", this.getProvince());
		object.put("state", this.getState());
		object.put("postalCode", this.getPostalCode());
		return object;
	}
	
	@Override
	public String toString() {
		return this.toJSON().toString();
	}

	public String getNumber() {
		return this.number;
	}

	public String getStreet() {
		return this.street;
	}

	public String getSubDistrict() {
		return this.subDistrict;
	}

	public String getDistrict() {
		return this.district;
	}

	public String getProvince() {
		return this.province;
	}

	public String getState() {
		return this.state;
	}

	public String getPostalCode() {
		return this.postalCode;
	}

	public String getCountry() {
		return this.country;
	}

	public void setNumber(String number) {
		this.number = number;
	}
	
	public void setStreet(String street) {
		this.street = street;
	}

	public void setSubDistrict(String subDistrict) {
		this.subDistrict = subDistrict;
	}

	public void setDistrict(String district) {
		this.district = district;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public void setState(String state) {
		this.state = state;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}