package bubbledocs.domain;

import bubbledocs.exception.BubbleDocsUserNotRootException;

public class User extends User_Base {
    
    public User(String name, String username, String password) {
        super();
        setName(name);
        setUsername(username);
        setPassword(password);
    }
    
    public void addUser(String name, String username, String password) throws BubbleDocsUserNotRootException{
    	if (this.getUsername() == "root"){
    		BubbleDocs.getInstance().addUser(new User(name, username, password));
    	}
    	else
    		throw new BubbleDocsUserNotRootException(this.getUsername());
    }
    
    public void removeUser(String name, String username, String password) throws BubbleDocsUserNotRootException{
    	if (this.getUsername() == "root"){
    		BubbleDocs.getInstance().removeUser(new User(name, username, password));
    	}
    	else
    		throw new BubbleDocsUserNotRootException(this.getUsername());
    }
    
   public boolean WritePerm(Document doc) {
	   for (Document item : getWriteDocSet()){
		   if (item.getId() == doc.getId())
			   return true;
	   }
	   return false;
   }
    
}
