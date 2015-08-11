package bubbledocs.domain;

import org.joda.time.LocalDateTime;

public class Document extends Document_Base {
	
	public Document() {
		super();
	}
    
    public Document(String name) {
        super();
        
        LocalDateTime dateObj = new LocalDateTime();
        String date = dateObj.toString();
        
        setName(name);
        setDate(date);
    }
}
