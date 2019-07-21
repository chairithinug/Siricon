import org.json.simple.JSONObject;

/**
 * @author Anapat Chairithinugull
 *
 */
public class Patient {
	private FullName fullName;
	private PersonalInfo personalInfo;
	private MorePersonalInfo morePersonalInfo;
	private MedicalInfo medicalInfo;
	private ContactInfo contactInfo;

	private MedicalInsurance medicalInsurance;
	private String[] medicalProviders;

	public Patient() {
		// FIXME
	}

	public MedicalInsurance getMedicalInsurance() {
		return this.medicalInsurance;
	}

	public String[] getMedicalProviders() {
		return this.medicalProviders;
	}


	public void setMedicalInsurance(MedicalInsurance medicalInsurance) {
		this.medicalInsurance = medicalInsurance;
	}

	public void setMedicalProviders(String[] medicalProviders) {
		this.medicalProviders = medicalProviders;
	}

	@SuppressWarnings("unchecked")
	public JSONObject toJSON() {
		return null;
	}

	public String toString() {
		JSONObject object = this.toJSON();
		return object.toString();
	}

	public String getFullName() {
		return fullName.toString();
	}
}
