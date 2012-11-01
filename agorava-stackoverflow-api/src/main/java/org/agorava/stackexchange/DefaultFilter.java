package org.agorava.stackexchange;

/**
 * See http://api.stackexchange.com/docs/filters for more infos on filters
 * 
 * @author Nicolas
 * 
 */
public enum DefaultFilter implements Filter {
	/*
	 * each type documents which fields are returned under the default filter
	 * (for example, answers).
	 */
	defaultFilter("default"),
	/* which is default plus the *.body fields */
	withbody,
	/* which is empty */
	none,
	/* which includes just .total */
	total;
	
	private final String text;

	public String getText() {
		return text;
	}

	private DefaultFilter(String text) {
		this.text = text;
	}

	private DefaultFilter() {
		this.text = name();
	}
}
