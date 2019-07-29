import java.util.Arrays;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * @author Anapat Chairithinugull
 *
 */
public class MedicalInfo {
	private BloodType bloodType;
	private BloodRH bloodRH;
	private IsDrugAllergic isDrugAllergic;
	private String[] drugsAllergy;

	public MedicalInfo(BloodType bloodType, BloodRH bloodRH, IsDrugAllergic isDrugAllergic, String[] drugsAllergy) {
		this.setBloodType(bloodType);
		this.setBloodRH(bloodRH);
		this.setIsDrugAllergic(isDrugAllergic);
		this.setDrugsAllergy(drugsAllergy);
	}

	@SuppressWarnings("unchecked")
	public JSONObject toJSON() {
		JSONObject object = new JSONObject();
		object.put("bloodType", this.getBloodType().toString());
		object.put("bloodRH", this.getBloodRH().toString());
		object.put("isDrugAllergic", this.getIsDrugAllergic().toString());
		JSONArray jsonArray = new JSONArray();
		jsonArray.addAll(Arrays.asList(this.getDrugsAllergy()));
		object.put("drugsAllergy", jsonArray);
		return object;
	}

	@Override
	public String toString() {
		JSONObject object = this.toJSON();
		return object.toString();
	}

	public BloodType getBloodType() {
		return this.bloodType;
	}

	public BloodRH getBloodRH() {
		return this.bloodRH;
	}

	public IsDrugAllergic getIsDrugAllergic() {
		return this.isDrugAllergic;
	}

	public String[] getDrugsAllergy() {
		return this.drugsAllergy;
	}

	public void setBloodType(BloodType bloodType) {
		this.bloodType = bloodType;
	}

	public void setBloodRH(BloodRH bloodRH) {
		this.bloodRH = bloodRH;
	}

	public void setIsDrugAllergic(IsDrugAllergic isDrugAllergic) {
		this.isDrugAllergic = isDrugAllergic;
	}

	public void setDrugsAllergy(String[] drugsAllergy) {
		this.drugsAllergy = drugsAllergy;
	}
}
