package com.main;
import java.time.LocalDate;
import java.time.LocalTime;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Order {
	public static enum TreatmentType {
		Today, Continue
	}
	
	private String orderAuthor;
	private LocalDate orderDate;
	private LocalTime orderTime;
	
	public Order() {
		
	}

	class Order_Treatment {
		private String treatment;
		
		public Order_Treatment(String treatment) {
			this.setTreatment(treatment);
		}

		public String getTreatment() {
			return treatment;
		}

		public void setTreatment(String treatment) {
			this.treatment = treatment;
		}
	}

	class Order_Observation {
		private String observation;

		public String getObservation() {
			return observation;
		}

		public void setObservation(String observation) {
			this.observation = observation;
		}
	}

	class Order_Medicine {
		private String medName;
		private float medDosage; // FIXME UNIT?
		private String medDosageUnit;
		private String medBrand;
		private String medRemark; // Comment on the med itself
		private String reason; // why on/off this medicine

		public Order_Medicine(
				String medName,
				float medDosage,
				String medDosageUnit,
				String medBrand,
				String medRemark,
				String reason
				) {
			this.setMedName(medName);
			this.setMedDosage(medDosage);
			this.setMedDosageUnit(medDosageUnit);
			this.setMedBrand(medBrand);
			this.setMedRemark(medRemark);
			this.setReason(reason);
		}

		public String getMedName() {
			return medName;
		}

		public void setMedName(String medName) {
			this.medName = medName;
		}

		public float getMedDosage() {
			return medDosage;
		}

		public void setMedDosage(float medDosage) {
			this.medDosage = medDosage;
		}

		public String getMedDosageUnit() {
			return medDosageUnit;
		}

		public void setMedDosageUnit(String medDosageUnit) {
			this.medDosageUnit = medDosageUnit;
		}

		public String getMedBrand() {
			return medBrand;
		}

		public void setMedBrand(String medBrand) {
			this.medBrand = medBrand;
		}

		public String getMedRemark() {
			return medRemark;
		}

		public void setMedRemark(String medRemark) {
			this.medRemark = medRemark;
		}

		public String getReason() {
			return reason;
		}

		public void setReason(String reason) {
			this.reason = reason;
		}
	}
}