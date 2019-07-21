import java.util.Calendar;

import org.json.simple.JSONObject;

/**
 * @author Anapat Chairithinugull
 *
 */
public class PersonalInfo {
	private Gender gender;
	private int age;
	private double weight;
	private double height;
	private Calendar birthDate;

	public PersonalInfo(
			Gender gender,
			int age,
			double weight,
			double height,
			Calendar birthDate)
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

	public Calendar getBirthDate() {
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

	public void setBirthDate(Calendar birthDate) {
		this.birthDate = birthDate;
	}
}
