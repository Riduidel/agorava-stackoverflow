package org.agorava.stackexchange;

public interface StackExchangeTagsService extends StackExchangeURIs {
	/** Get the tags on the site. */ 
	public static final String TAGS_URI = "/tags"; 
	 

	/** Get tags on the site by their names. */
	public static final String TAGS_BY_NAME_URI = "/tags/{tags}/info"; 
	 
	/** Get the tags on the site that only moderators can use.  */
	public static final String TAGS_FOR_MODERATORS_URI = "/tags/moderator-only"; 
	 
	/** Get the tags on the site that fulfill required tag constraints. */ 
	public static final String TAGS_BY_CONSTRAINTS_URI = "/tags/required"; 
	
	/** Get all the tag synonyms on the site.  */
	public static final String TAGS_SYNONYMS_URI = "/tags/synonyms";
	
	/** Get frequently asked questions in a set of tags. */
	public static final String TAGS_FREQUENT_QUESTIONS = "/tags/{tags}/faq"; 
	 
	/** Get related tags, based on common tag pairings. */
	public static final String TAGS_RELATED_URI = "/tags/{tags}/related"; 
	 
	/** Get the synonyms for a specific set of tags. */
	public static final String TAGS_SYNONYMS_BY_IDS_URI = "/tags/{tags}/synonyms"; 

	/** Get the top answer posters in a specific tag, either in the last month or for all time.*/
	public static final String TAGS_TOP_ANSWERED_URI = "/tags/{tag}/top-answerers/{period}"; 
	 
	/** Get the top question askers in a specific tag, either in the last month or for all time. */
	public static final String TAGS_TOP_ASKED_URI = "/tags/{tag}/top-askers/{period}"; 
	 
	/** Get the wiki entries for a set of tags.*/
	public static final String TAGS_WIKIS_URI = "/tags/{tags}/wikis"; 
	 
}
