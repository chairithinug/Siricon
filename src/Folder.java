import java.util.ArrayList;
import java.util.Comparator;

/**
 * @author Anapat Chairithinugull
 *
 */
public class Folder {
	private Patient owner;
	private ArrayList<Document> history;

	public Folder(Patient owner) {
		this.owner = owner;
		this.history = new ArrayList<Document>();
	}
	
	public String whoseFolder() {
		return this.owner.toString(); // firstName lastName
	}

	public void addDocument(Document newDoc) {
		history.add(newDoc);
	}

	public void addDocuments(ArrayList<Document> newDocList) {
		history.addAll(newDocList);
	}

	public void removeDocument(Document deleteDoc) {
		history.remove(deleteDoc);
	}

	public void removeDocument(ArrayList<Document> deleteDocList) {
		history.removeAll(deleteDocList);
	}

	public void clearDocuments() {
		history.clear();
	}

	public void sortByDate() {
		history.sort(new Comparator<Document>() {
			@Override
			public int compare(Document doc1, Document doc2) {
				int res = doc1.getDate().compareTo(doc2.getDate());
				if(res == 0) {
					return doc1.getTime().compareTo(doc2.getTime());
				}
				return res;
			}
		});
	}

	public void sortByAuthor() {
		history.sort(new Comparator<Document>() {
			@Override
			public int compare(Document doc1, Document doc2) {
				return doc1.getAuthor().compareToIgnoreCase(doc2.getAuthor());
			}
		});
	}
}
