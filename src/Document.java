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
public class Document {
	private int ticket; // ticket for this service
	private LocalDate date; // date of receiving the service
	private LocalTime time; // time of receiving the service
	private String author; // whoever write this document
	private String documentID; // FIXME
	
	// documentID == hashCode of Patient? do something with document
	// UUID.randomUUID().toString(); though not truly unique*/ hard to read
	public Document(String author, int ticket, String documentID) {
		this.setTicket(ticket);
		this.setDate(LocalDate.now());
		this.setTime(LocalTime.now());
		this.setAuthor(author);
		this.setDocumentID(documentID);
//		this.setDocumentID(UUID.randomUUID().toString());
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
}

// FIXME MED NAME CASE SENSITIVE?
class Prescription extends Document {
	private ArrayList<String> list;
	
	public Prescription(String author, int ticket, String documentID) {
		super(author, ticket, documentID);
		this.list = new ArrayList<String>();
	}

	public ArrayList<String> getList() {
		return this.list;
	}

	public void addMed(String newMed) {
		list.add(newMed);
	}

	public void addMeds(ArrayList<String> newMeds) {
		list.addAll(newMeds);
	}

	public void clearList() {
		list.clear();
	}

	public void removeMed(String removeMed) {
		list.remove(removeMed);
	}

	public void removeMeds(ArrayList<String> removeMeds) {
		list.removeAll(removeMeds);
	}

	public int countMeds() {
		return list.size();
	}

	public int findMed(String med) {
		return list.indexOf(med);
	}
	
	public String getMed(int index) {
		return list.get(index);
	}
	
	@SuppressWarnings("unchecked")
	public ArrayList<String> duplicateList(){
		return (ArrayList<String>) list.clone();
	}
	
	// FIXME HOW TO HANDLE COMMON DATA??? GOOD ENOUGH? FUTURE PROOF?
	@SuppressWarnings("unchecked")
	public JSONObject toJSON() {
		JSONObject object = new JSONObject();
		JSONArray jsonArray = new JSONArray();
		jsonArray.addAll(Arrays.asList(this.getList()));
		object.put("list", jsonArray);
		object.put("size", this.getList());
		// COMMON DATA
		object.put("author", this.getAuthor());
		object.put("date", this.getDate().toString());
		object.put("time", this.getTime().toString());
		object.put("ticket", this.getTicket());
		object.put("documentID", this.getDocumentID());
		return object;
	}
	
	@Override
	public String toString() {
		JSONObject object = this.toJSON();
		return object.toString();
	}
}