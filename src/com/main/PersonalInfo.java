package com.main;
import java.time.LocalDate;

import org.json.simple.JSONObject;

/**
 * @author Anapat Chairithinugull
 *
 */
public class PersonalInfo {
	public static enum Gender {
		Male, Female, Other
	}
	
	private Gender gender;
	private int age;
	private double weight;
	private double height;
	private LocalDate birthDate;

	public PersonalInfo(
			Gender gender,
			int age,
			double weight,
			double height,
			LocalDate birthDate)
	{
		this.setGender(gender);
		this.setAge(age);
		this.setWeight(weight);
		this.setHeight(height);
		this.setBirthDate(birthDate);
	}
	
	@SuppressWarnings("unchecked")
	public JSONObject toJSON() {
		JSONObject object = new JSONObject();
		object.put("gender", this.getGender().toString());
		object.put("age", this.getAge());
		object.put("weight", this.getWeight());
		object.put("height", this.getHeight());
		object.put("birthdate", this.getBirthDate().toString());
		return object;
	}
	
	@Override
	public String toString() {
		JSONObject object = this.toJSON();
		return object.toString();
	}

	public Gender getGender() {
		return this.gender;
	}

	public int getAge() {
		return this.age;
	}

	public double getWeight() {
		return this.weight;
	}

	public double getHeight() {
		return this.height;
	}

	public LocalDate getBirthDate() {
		return this.birthDate;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
}
