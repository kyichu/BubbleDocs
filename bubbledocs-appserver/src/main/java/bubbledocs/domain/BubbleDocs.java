package bubbledocs.domain;

import java.util.ArrayList;
import java.util.List;

import bubbledocs.exception.BubbleDocsDocDoesNotExistException;
import bubbledocs.exception.BubbleDocsUserDoesNotExistException;
import pt.ist.fenixframework.FenixFramework;

public class BubbleDocs extends BubbleDocs_Base {

	public static BubbleDocs getInstance() {
		BubbleDocs bd = FenixFramework.getDomainRoot().getBubbledocs();

		if (bd == null)
			bd = new BubbleDocs();

		return bd;
	}

	private BubbleDocs() {
		FenixFramework.getDomainRoot().setBubbledocs(this);
		setDocAmmount(0);
	}

	public User getUserByUsername(String username)
			throws BubbleDocsUserDoesNotExistException {
		for (User item : getUserSet()) {
			if (item.getUsername().equals(username))
				return item;
		}

		throw new BubbleDocsUserDoesNotExistException();
	}

	public List<User> getUserListByName(String name)
			throws BubbleDocsUserDoesNotExistException {
		List<User> userList = new ArrayList<User>();

		for (User item : getUserSet()) {
			if (item.getName().equals(name))
				userList.add(item);
		}

		if (userList.size() == 0)
			throw new BubbleDocsUserDoesNotExistException();

		return userList;
	}

	public Document getDocumentById(int id)
			throws BubbleDocsDocDoesNotExistException {
		for (Document item : getDocumentSet()) {
			if (item.getId() == id)
				return item;
		}

		throw new BubbleDocsDocDoesNotExistException();
	}

	public List<Document> getDocumentListByName(String name)
			throws BubbleDocsDocDoesNotExistException {
		List<Document> docList = new ArrayList<Document>();

		for (Document item : getDocumentSet()) {
			if (item.getName().equals(name))
				docList.add(item);
		}

		if (docList.size() == 0)
			throw new BubbleDocsDocDoesNotExistException();

		return docList;
	}

	public void addDocument(Document doc) {
		super.addDocument(doc);

		setDocAmmount(getDocAmmount() + 1);
		doc.setId(getDocAmmount());
	}
	
//	public void delete() {
//		for (User item : getUserSet()) {
//			item.delete();
//		}
//		
//		for (Document item : getDocumentSet()) {
//			item.delete();
//		}
//		
//		deleteDomainObject();
//	}
}
