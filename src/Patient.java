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
	private Address currentAddress;
	private String currentMobileNo;
	private Address workAddress;
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
//		setGeneralInfo(t, g, fn, ln, a, w, h, bd);
//		setMoreInfo(bt, brh, e, n);
//		setExtraInfo(ms, o, r, ca, cmn, wa);
//		setEmergencyContact(ec);
//		setAllergy(ida, da);
//		setInsurance(mi, mp);
	}

	private void setGeneralInfo(Title t, Gender g, String fn, String ln, int a, float w, float h, Calendar bd) {
		this.setTitle(t);
		this.setGender(g);
		this.setFirstName(fn);
		this.setLastName(ln);
		this.setAge(a);
		this.setWeight(w);
		this.setHeight(h);
		this.setBirthDate(bd);
	}

	private void setMoreInfo(BloodType bt, BloodRH brh, String e, String n) {
		this.setBloodType(bt);
		this.setBloodRH(brh);
		this.setEthnicity(e);
		this.setNationality(n);
	}

	private void setExtraInfo(MaritalStatus ms, String o, Religion r, Address ca, String cmn, Address wa) {
		this.setMaritalStatus(ms);
		this.setOccupation(o);
		this.setReligion(r);
		this.setCurrentAddress(ca);
		this.setCurrentMobileNo(cmn);
		this.setWorkAddress(wa);
	}

	private void setAllergy(IsDrugAllergic ida, String[] da) {
		this.setIsDrugAllergic(ida);
		this.setDrugsAllergy(da);
	}

	private void setInsurance(MedicalInsurance mi, String[] mp) {
		this.setMedicalInsurance(mi);
		this.setMedicalProviders(mp);
	}

	public Title getTitle() {
		return this.title;
	}

	public Gender getGender() {
		return this.gender;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	public int getAge() {
		return this.age;
	}

	public float getWeight() {
		return this.weight;
	}

	public float getHeight() {
		return this.height;
	}

	public Calendar getBirthDate() {
		return this.birthDate;
	}

	public BloodType getBloodType() {
		return this.bloodType;
	}

	public BloodRH getBloodRH() {
		return this.bloodRH;
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

	public Address getCurrentAddress() {
		return this.currentAddress;
	}

	public String getCurrentMobileNo() {
		return this.currentMobileNo;
	}

	public Address getWorkAddress() {
		return this.workAddress;
	}

	public JSONObject getEmergencyContact() {
		return this.emergencyContact;
	}

	public IsDrugAllergic getIsDrugAllergic() {
		return this.isDrugAllergic;
	}

	public String[] getDrugsAllergy() {
		return this.drugsAllergy;
	}

	public MedicalInsurance getMedicalInsurance() {
		return this.medicalInsurance;
	}

	public String[] getMedicalProviders() {
		return this.medicalProviders;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setWeight(float weight) {
		this.weight = weight;
	}

	public void setHeight(float height) {
		this.height = height;
	}

	public void setBirthDate(Calendar birthDate) {
		this.birthDate = birthDate;
	}

	public void setBloodType(BloodType bloodType) {
		this.bloodType = bloodType;
	}

	public void setBloodRH(BloodRH bloodRH) {
		this.bloodRH = bloodRH;
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

	public void setCurrentAddress(Address CurrentAddress) {
		this.currentAddress = CurrentAddress;
	}

	public void setCurrentMobileNo(String currentMobileNo) {
		this.currentMobileNo = currentMobileNo;
	}

	public void setWorkAddress(Address workAddress) {
		this.workAddress = workAddress;
	}

	public void setEmergencyContact(JSONObject emergencyContact) {
		this.emergencyContact = emergencyContact;
	}

	public void setIsDrugAllergic(IsDrugAllergic isDrugAllergic) {
		this.isDrugAllergic = isDrugAllergic;
	}

	public void setDrugsAllergy(String[] drugsAllergy) {
		this.drugsAllergy = drugsAllergy;
	}

	public void setMedicalInsurance(MedicalInsurance medicalInsurance) {
		this.medicalInsurance = medicalInsurance;
	}

	public void setMedicalProviders(String[] medicalProviders) {
		this.medicalProviders = medicalProviders;
	}

	public String toString() {
		return String.format("%s %s", this.getFirstName(), this.getLastName());
	}
}
