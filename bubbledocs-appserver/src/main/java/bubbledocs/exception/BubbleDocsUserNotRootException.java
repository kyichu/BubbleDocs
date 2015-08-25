package bubbledocs.exception;

public class BubbleDocsUserNotRootException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 private String noRootName;

	    public BubbleDocsUserNotRootException(String noRootName) {
	        this.noRootName = noRootName;
	    }

	    public String getnoRootName() {
	        return this.noRootName;

	    }

	    @Override
	    public String getMessage() {
	        return "This name " + this.noRootName + " is not root";
	    }
}
