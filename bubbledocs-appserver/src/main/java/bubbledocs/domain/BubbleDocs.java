package bubbledocs.domain;

import java.util.ArrayList;
import java.util.List;

import pt.ist.fenixframework.FenixFramework;

public class BubbleDocs extends BubbleDocs_Base {
    
	public static BubbleDocs getInstance() {
		BubbleDocs bd = FenixFramework.getDomainRoot().getBubbledocs();
		
		if(bd == null)
			bd = new BubbleDocs();
		
		return bd;
	}
	
    private BubbleDocs() {
        FenixFramework.getDomainRoot().setBubbledocs(this);
        setDocAmmount(0);
    }
    
    public User getUserByUsername(String username) {
    	for (User item : getUserSet()) {
    		if (item.getUsername().equals(username))
    			return item;
    	}
    	
    	return null;
    }
    
    public List<User> getUserListByName(String name) {
    	List<User> userList = new ArrayList<User>();
    	
    	for (User item : getUserSet()) {
    		if (item.getName().equals(name))
    			userList.add(item);
    	}
    	
    	return userList;
    }
    
    public Document getDocumentById(int id) {
    	for (Document item : getDocumentSet()) {
    		if (item.getId() == id)
    			return item;
    	}
    	
    	return null;
    }
    
    public List<Document> getDocumentListByName(String name) {
    	List<Document> docList = new ArrayList<Document>();
    	
    	for (Document item : getDocumentSet()) {
    		if (item.getName().equals(name))
    			docList.add(item);
    	}
    	
    	return docList;
    }
}
