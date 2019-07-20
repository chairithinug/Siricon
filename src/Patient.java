import java.util.Calendar;
import org.json.simple.JSONObject;

public class Patient {
	//////////////////////////////////////////////////////////////////////
	private Title title;
	private Gender gender;
	private String firstName;
	private String lastName;
	private int age;
	private float weight;
	private float height;
	private Calendar birthDate;
	///////////////////////////////////////////////////////////////////////
	private BloodType bloodType;
	private BloodRH bloodRH;
	private String ethnicity;
	private String nationality;
	////////////////////////////////////////////////////////////////////////
	private MaritalStatus maritalStatus;
	private String occupation;
	private Religion religion;
	private JSONObject currentAddress;
	private String currentMobileNo;
	private JSONObject workAddress;
	/////////////////////////////////////////////////////////////////////////
	private JSONObject emergencyContact;
	/////////////////////////////////////////////////////////////////////////
	private IsDrugAllergic isDrugAllergic;
	private String[] drugsAllergy;
	/////////////////////////////////////////////////////////////////////////
	private MedicalInsurance medicalInsurance;
	private String[] medicalProviders;
	/////////////////////////////////////////////////////////////////////////

	public Patient() {
		// FIXME
	}

	public Title getTitle() {
		return this.title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public Gender getGender() {
		return this.gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public float getWeight() {
		return this.weight;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public float getHeight() {
		return this.height;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public Calendar getBirthDate() {
		return this.birthDate;
	}

	public void setBirthDate(Calendar birthDate) {
		this.birthDate = birthDate;
	}

	public BloodType getBloodType() {
		return this.bloodType;
	}

	public void setBloodType(BloodType bloodType) {
		this.bloodType = bloodType;
	}

	public BloodRH getBloodRH() {
		return this.bloodRH;
	}

	public void setBloodRH(BloodRH bloodRH) {
		this.bloodRH = bloodRH;
	}

	public String getEthnicity() {
		return this.ethnicity;
	}

	public void setEthnicity(String ethnicity) {
		this.ethnicity = ethnicity;
	}

	public String getNationality() {
		return this.nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public MaritalStatus getMaritalStatus() {
		return this.maritalStatus;
	}

	public void setMaritalStatus(MaritalStatus maritalStatus) {
		this.maritalStatus = maritalStatus;
	}

	public String getOccupation() {
		return this.occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}

	public Religion getReligion() {
		return this.religion;
	}

	public void setReligion(Religion religion) {
		this.religion = religion;
	}

	public JSONObject getCurrentAddress() {
		return this.currentAddress;
	}

	public void setCurrentAddress(JSONObject CurrentAddress) {
		this.currentAddress = CurrentAddress;
	}

	public String getCurrentMobileNo() {
		return this.currentMobileNo;
	}

	public void setCurrentMobileNo(String currentMobileNo) {
		this.currentMobileNo = currentMobileNo;
	}

	public JSONObject getWorkAddress() {
		return this.workAddress;
	}

	public void setWorkAddress(JSONObject workAddress) {
		this.workAddress = workAddress;
	}

	public JSONObject getEmergencyContact() {
		return this.emergencyContact;
	}

	public void setEmergencyContact(JSONObject emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public IsDrugAllergic getIsDrugAllergic() {
		return this.isDrugAllergic;
	}

	public void setIsDrugAllergic(IsDrugAllergic isDrugAllergic) {
		this.isDrugAllergic = isDrugAllergic;
	}

	public String[] getDrugsAllergy() {
		return this.drugsAllergy;
	}

	public void setDrugsAllergy(String[] drugsAllergy) {
		this.drugsAllergy = drugsAllergy;
	}

	public MedicalInsurance getMedicalInsurance() {
		return this.medicalInsurance;
	}

	public void setMedicalInsurance(MedicalInsurance medicalInsurance) {
		this.medicalInsurance = medicalInsurance;
	}

	public String[] getMedicalProviders() {
		return this.medicalProviders;
	}

	public void setMedicalProviders(String[] medicalProviders) {
		this.medicalProviders = medicalProviders;
	}
}
