import org.json.simple.JSONObject;

/**
 * @author Anapat Chairithinugull
 *
 */
public class MorePersonalInfo {
	private String ethnicity;
	private String nationality;
	private MaritalStatus maritalStatus;
	private String occupation;
	private Religion religion;
	
	public MorePersonalInfo(
		String ethnicity,
		String nationality,
		MaritalStatus maritalStatus,
		String occupation,
		Religion religion)
	{
		this.setEthnicity(ethnicity);
		this.setNationality(nationality);
		this.setMaritalStatus(maritalStatus);
		this.setOccupation(occupation);
		this.setReligion(religion);
	}
	
	@SuppressWarnings("unchecked")
	public JSONObject toJSON() {
		JSONObject object = new JSONObject();
		object.put("ethnicity", this.getEthnicity());
		object.put("nationality", this.getNationality());
		object.put("maritalStatus", this.getMaritalStatus().toString());
		object.put("occupation", this.getOccupation());
		object.put("religion", this.getReligion().toString());
		return object;
	}
	
	@Override
	public String toString() {
		JSONObject object = this.toJSON();
		return object.toString();
	}
	
	public String getEthnicity() {
		return this.ethnicity;
	}

	public String getNationality() {
		return this.nationality;
	}

	public MaritalStatus getMaritalStatus() {
		return this.maritalStatus;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public Religion getReligion() {
		return this.religion;
	}
	
	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public void setReligion(Religion religion) {
		this.religion = religion;
	}
	
	
}
