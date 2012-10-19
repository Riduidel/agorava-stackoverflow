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
        return get(SITE_ANSWERS, AnswersWrapper.class, parameters);
    }

    @Override
    public AnswersWrapper getAnswers(StackExchangeQueryParameters<Date> parameters, Integer... ids) {
        return get(SITE_ANSWERS_WITH_IDS, AnswersWrapper.class, parameters, asCollection(ids));
    }
}
