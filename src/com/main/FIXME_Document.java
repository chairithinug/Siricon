package com.main;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Arrays;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

/**
 * @author Anapat Chairithinugull
 *
 */
public class FIXME_Document {
	public static enum DocumentType {
		Order
	}
	
	private int ticket; // ticket for this service
	private LocalDate date; // date of receiving the service
	private LocalTime time; // time of receiving the service
	private String author; // whoever write this document
	private String documentID; // FIXME
	private DocumentType documentType;

	// documentID == hashCode of Patient? do something with document
	// UUID.randomUUID().toString(); though not truly unique*/ hard to read
	public FIXME_Document(String author, int ticket, String documentID, DocumentType documentType) {
		this.setTicket(ticket);
		this.setDate(LocalDate.now());
		this.setTime(LocalTime.now());
		this.setAuthor(author);
		this.setDocumentID(documentID);
//		this.setDocumentID(UUID.randomUUID().toString());
		this.setDocumentType(documentType);
	}

	public int getTicket() {
		return this.ticket;
	}

	public void setTicket(int ticket) {
		this.ticket = ticket;
	}

	public LocalDate getDate() {
		return this.date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public LocalTime getTime() {
		return time;
	}

	public void setTime(LocalTime time) {
		this.time = time;
	}

	public String getAuthor() {
		return this.author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getDocumentID() {
		return documentID;
	}

	public void setDocumentID(String documentID) {
		this.documentID = documentID;
	}

	public DocumentType getDocumentType() {
		return documentType;
	}

	public void setDocumentType(DocumentType documentType) {
		this.documentType = documentType;
	}
}

// FIXME MED NAME CASE SENSITIVE?
class DEPRECATED_Order extends FIXME_Document {

	class Medicine {
		private String medName;
		private float medDosage;
		private String medBrand;
		private String medRemark;	// Comment on the med itself
		private TreatmentType treatmentType; // Days or lifelong
		private LocalDate effectiveThru;
	}

	class ActiveMedicine extends Medicine {
		
	}

	class InactiveMedicine extends Medicine {
		private String inactiveReason; // Comment on reason to stop this med
	}

	private ArrayList<String> activeList;
	private ArrayList<String> inactiveList;

	public DEPRECATED_Order(String author, int ticket, String documentID) {
		super(author, ticket, documentID, DocumentType.Prescription);
		this.activeList = new ArrayList<String>();
		this.inactiveList = new ArrayList<String>();
	}

	public ArrayList<String> getActiveList() {
		return this.activeList;
	}

	public ArrayList<String> getInactiveList() {
		return inactiveList;
	}

	public void moveActiveMedToInactive(String moveMed) {
		this.activeList.remove(moveMed);
		this.inactiveList.add(moveMed);
	}

	public void moveInactiveMedToActive(String moveMed) {
		this.inactiveList.remove(moveMed);
		this.activeList.add(moveMed);
	}

	public void addActiveMed(String newMed) {
		activeList.add(newMed);
	}

	public void addActiveMeds(ArrayList<String> newMeds) {
		activeList.addAll(newMeds);
	}

	public void clearActiveList() {
		activeList.clear();
	}

	public void clearInactiveList() {
		inactiveList.clear();
	}

	public void removeActiveMed(String removeMed) {
		activeList.remove(removeMed);
	}

	public void removeActiveMeds(ArrayList<String> removeMeds) {
		activeList.removeAll(removeMeds);
	}

	public int countActiveMeds() {
		return activeList.size();
	}

	public int countInactiveMeds() {
		return inactiveList.size();
	}

	public int findActiveMed(String med) {
		return activeList.indexOf(med);
	}

	public int findInactiveMed(String med) {
		return inactiveList.indexOf(med);
	}

	public String getActiveMed(int index) {
		return activeList.get(index);
	}

	public String getInactiveMed(int index) {
		return inactiveList.get(index);
	}

	@SuppressWarnings("unchecked")
	public ArrayList<String> duplicateActiveList() {
		return (ArrayList<String>) activeList.clone();
	}

	// FIXME HOW TO HANDLE COMMON DATA??? GOOD ENOUGH? FUTURE PROOF?
	@SuppressWarnings("unchecked")
	public JSONObject toJSON() {
		JSONObject object = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		jsonArray.addAll(Arrays.asList(this.getActiveList()));

		object.put("activeList", jsonArray);
		object.put("activeSize", this.countActiveMeds());

		jsonArray = new JSONArray();
		jsonArray.addAll(Arrays.asList(this.getInactiveList()));
		object.put("inactiveList", jsonArray);
		object.put("inactiveSize", this.countInactiveMeds());
		// COMMON DATA
		object.put("author", this.getAuthor());
		object.put("date", this.getDate().toString());
		object.put("time", this.getTime().toString());
		object.put("ticket", this.getTicket());
		object.put("documentID", this.getDocumentID());
		object.put("documentType", this.getDocumentType().toString());
		return object;
	}

	@Override
	public String toString() {
		JSONObject object = this.toJSON();
		return object.toString();
	}
}