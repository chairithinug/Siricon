package com.main;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import com.deprecated.DEPRECATED_Document;

/**
 * @author Anapat Chairithinugull
 *
 */
public class Folder {
	private Patient patient;
	private ArrayList<DEPRECATED_Document> list;

	public Folder(Patient patient) {
		this.patient = patient;
		this.list = new ArrayList<DEPRECATED_Document>();
	}

	public String whoseFolder() {
		return this.patient.toString(); // firstName lastName
	}

	public void addDocument(DEPRECATED_Document newDoc) {
		list.add(newDoc);
	}

	public void addDocuments(ArrayList<DEPRECATED_Document> newDocList) {
		list.addAll(newDocList);
	}

	public void removeDocument(DEPRECATED_Document deleteDoc) {
		list.remove(deleteDoc);
	}

	public void removeDocument(ArrayList<DEPRECATED_Document> deleteDocList) {
		list.removeAll(deleteDocList);
	}

	public void clearDocuments() {
		list.clear();
	}

	public ArrayList<DEPRECATED_Document> getList() {
		return this.list;
	}
	
	public Patient getPatient() {
		return this.patient;
	}

	@SuppressWarnings("unchecked")
	public JSONObject toJSON() {
		JSONObject object = new JSONObject();
		object.put("patient", this.getPatient().toJSON());
		JSONArray jsonArray = new JSONArray();
		jsonArray.addAll(Arrays.asList(this.getList()));
		object.put("list", jsonArray);
		return object;
	}

	@Override
	public String toString() {
		JSONObject object = this.toJSON();
		return object.toString();
	}

	public void sortByDate() {
		list.sort(new Comparator<DEPRECATED_Document>() {
			@Override
			public int compare(DEPRECATED_Document doc1, DEPRECATED_Document doc2) {
				int res = doc1.getDate().compareTo(doc2.getDate());
				if (res == 0) {
					return doc1.getTime().compareTo(doc2.getTime());
				}
				return res;
			}
		});
	}

	public void sortByAuthor() {
		list.sort(new Comparator<DEPRECATED_Document>() {
			@Override
			public int compare(DEPRECATED_Document doc1, DEPRECATED_Document doc2) {
				return doc1.getAuthor().compareToIgnoreCase(doc2.getAuthor());
			}
		});
	}
}
