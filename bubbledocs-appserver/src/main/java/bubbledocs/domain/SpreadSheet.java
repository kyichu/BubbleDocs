package bubbledocs.domain;

import org.joda.time.LocalDateTime;

import bubbledocs.exception.BubbleDocsCoordsOutOfBoundsException;

public class SpreadSheet extends SpreadSheet_Base {
    
    public SpreadSheet() {
        super();
    }
    
    public SpreadSheet(String name, int lines, int columns) {
    	super();
        
        LocalDateTime dateObj = new LocalDateTime();
        String date = dateObj.toString();
        
        setName(name);
        setDate(date);
        setLines(lines);
        setColumns(columns);
    }
    
    public Cell getCellByCoords(int line, int column) throws BubbleDocsCoordsOutOfBoundsException {
    	if(line >= getLines() || column >= getColumns())
    		throw new BubbleDocsCoordsOutOfBoundsException();
    	
    	for (Cell item : getCellSet()) {
    		if(item.getLine() == line && item.getColumn() == column)
    			return item;
    	}
    	
    	return null;
    }
    
//    public void delete() {
//    	for(Cell item : getCellSet()) {
//    		item.delete();
//    	}
//    	
//    	deleteDomainObject();
//    }
}
