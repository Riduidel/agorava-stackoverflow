package org.agorava.stackexchange;

import java.util.Date;

import org.agorava.stackexchange.model.wrappers.RevisionsWrapper;

public class StackExchangeRevisionsServiceImpl extends StackExchangeBaseService implements
		StackExchangeRevisionsService {

	@Override
	public RevisionsWrapper getRevisions(
			StackExchangeQueryParameters<Date> query, String... ids) {
        return get(REVISIONS_URI_WITH_IDS, RevisionsWrapper.class, query, asCollection(ids));
	}

}
