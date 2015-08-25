package bubbledocs.domain;

import bubbledocs.exception.BubbleDocsCellDoesNotExistException;
import bubbledocs.exception.BubbleDocsInvalidContentException;
import bubbledocs.exception.BubbleDocsValueDividedByZeroException;

public class Add extends Add_Base {
    
    public Add() {
        super();
    }
    
    public Add(Content c1, Content c2) throws BubbleDocsInvalidContentException{
    	if (c1 instanceof Function || c2 instanceof Function){
    		setContent1(c1);
    		setContent2(c2);
    	}
    	else
    		throw new BubbleDocsInvalidContentException(c1.toString());
    		throw new BubbleDocsInvalidContentException(c2.toString());
    }
    
    public Integer getValue() throws BubbleDocsValueDividedByZeroException, BubbleDocsCellDoesNotExistException{
    	Integer result;
    	
    	if (getContent1() == null || getContent2() == null){
    		return 0;
    	}
    	result = getContent1().getValue() + getContent2().getValue();
    	return result;
    }
}
