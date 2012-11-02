/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import java.util.Date;
import org.agorava.stackexchange.model.wrappers.AnswersWrapper;

/**
 *
 * @author ndx
 */
public class StackExchangeAnswersServiceImpl  extends StackExchangeBaseService implements StackExchangeAnswersService {

    @Override
    public AnswersWrapper getAnswers(StackExchangeQueryParameters<Date> parameters) {
        return get(ANSWERS_URI, AnswersWrapper.class, parameters);
    }

    @Override
    public AnswersWrapper getAnswers(StackExchangeQueryParameters<Date> parameters, Integer... ids) {
        return get(ANSWERS_WITH_IDS_URI, AnswersWrapper.class, parameters, asCollection(ids));
    }

	@Override
	public AnswersWrapper getAnswersOf(
			StackExchangeQueryParameters<Date> parameters, Integer... ids) {
        return get(ANSWERS_BY_USERS_URI, AnswersWrapper.class, parameters, asCollection(ids));
	}

	@Override
	public AnswersWrapper getMyAnswers(
			StackExchangeQueryParameters<Date> parameters) {
        return get(ANSWERS_BY_ME_URI, AnswersWrapper.class, parameters);
	}
}
