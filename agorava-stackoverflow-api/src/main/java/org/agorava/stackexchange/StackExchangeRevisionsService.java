package org.agorava.stackexchange;

import java.util.Date;

import org.agorava.stackexchange.model.wrappers.QuestionsWrapper;
import org.agorava.stackexchange.model.wrappers.RevisionsWrapper;

public interface StackExchangeRevisionsService extends StackExchangeURIs {
    public static final String REVISIONS_URI_WITH_IDS = "revisions/{0}";
	/**
	 * Get revisions corresponding to questions with the given set of ids
	 * @param query
	 * @param ids
	 * @return
	 */
    public RevisionsWrapper getRevisions(StackExchangeQueryParameters<Date> query, String... ids);

}
X