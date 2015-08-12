package bubbledocs.domain;

import bubbledocs.exception.CellDoesNotExistException;
import bubbledocs.exception.InvalidContentException;
import bubbledocs.exceptions.ValueDividedByZeroException;

public class Add extends Add_Base {
    
    public Add() {
        super();
    }
    
    public Add(Content c1, Content c2) throws InvalidContentException{
    	if (c1 instanceof Function || c2 instanceof Function){
    		setContent1(c1);
    		setContent2(c2);
    	}
    	else
    		throw new InvalidContentException(c1.toString());
    		throw new InvalidContentException(c2.toString());
    }
    
    public Integer getValue() throws ValueDividedByZeroException, CellDoesNotExistException{
    	Integer result;
    	
    	if (getContent1() == null || getContent2() == null){
    		return 0;
    	}
    	result = getContent1().getValue() + getContent2().getValue();
    	return result;
    }
}
