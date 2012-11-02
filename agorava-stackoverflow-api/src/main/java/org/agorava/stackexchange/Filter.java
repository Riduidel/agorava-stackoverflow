package org.agorava.stackexchange;

/**
 * See http://api.stackexchange.com/docs/filters for more infos on filters
 * 
 * @author Nicolas
 * 
 */
public class Filter {
	/*
	 * each type documents which fields are returned under the default filter
	 * (for example, answers).
	 */
	public static final Filter DEFAULT_FILTER = new Filter("default");
	/* which is default plus the *.body fields */
	public static final Filter WITH_BODY = new Filter("withbody");
	/* which is empty */
	public static final Filter NONE = new Filter("none");
	/* which includes just .total */
	public static final Filter TOTAL = new Filter("total");
	
	private final String text;

	public String getText() {
		return text;
	}

	public Filter(String text) {
		this.text = text;
	}
}
