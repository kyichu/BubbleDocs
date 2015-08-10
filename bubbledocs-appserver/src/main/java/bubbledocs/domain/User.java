package bubbledocs.domain;

public class User extends User_Base {
    
    public User(String name, String username, String password) {
        super();
        setName(name);
        setUsername(username);
        setPassword(password);
    }
    
    public void addUser(String name, String username, String password){
    	if (this.getUsername() == "root"){
    		BubbleDocs.getInstance().addUser(new User(name, username, password));
    	}
    	else
    		throw new Exception(this.getUsername());
    }
    
    public void removeUser(String name, String username, String password){
    	if (this.getUsername() == "root"){
    		BubbleDocs.getInstance().removeUser(new User(name, username, password));
    	}
    	else
    		throw new Exception(this.getUsername());
    }
    
    
}
