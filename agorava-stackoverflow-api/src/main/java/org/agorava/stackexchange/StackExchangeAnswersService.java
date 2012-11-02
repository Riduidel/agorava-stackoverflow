/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import java.util.Date;

import org.agorava.stackexchange.model.wrappers.AnswersWrapper;

/**
 * service specifically managing site answers
 * @author ndx
 */
public interface StackExchangeAnswersService extends StackExchangeURIs {
    /**
     * defined from https://api.stackexchange.com/docs/answers
     */
    public static final String ANSWERS_URI = "answers/";
    public static final String ANSWERS_WITH_IDS_URI = "answers/%s";
    
    /**
     * Get the answers given by this list of users. Documented in http://api.stackexchange.com/docs/answers-on-users
     */
    public static final String ANSWERS_BY_USERS_URI = "users/%s/answers";
    
    /**
     * Documented inhttp://api.stackexchange.com/docs/me-answers
     */
    public static final String ANSWERS_BY_ME_URI = "me/answers";
    
    /**
     * Sort orders usable with {@link StackExchangeQueryParameters} for answers queries
     * @author Nicolas
     *
     */
    public static enum Sort {
    	activity,
		creation,
		votes;
    	
    }

    /**
     * Filter displaying full answers
     */
    public static final Filter FULL_ANSWER = new Filter("!-u2CTDQ4");
    
    /**
     * Get answers with query parameters.
     * @param parameters in these parameters, min and max, when defined, have to be date values
     * @return an answer wrapper containing answers matching the given criterias
     */
    AnswersWrapper getAnswers(StackExchangeQueryParameters<Date> parameters);
    
    /**
     * Get answers with given id list and query parameters.
     * @param ids a list of string identifying the answers we want
     * @param parameters in these parameters, min and max, when defined, have to be date values
     * @return an answer wrapper containing answers matching the given criterias, and with the given ids
     */
    AnswersWrapper getAnswers(StackExchangeQueryParameters<Date> parameters, Integer...ids);
    
    
    /**
     * Get answers provided by the given list of users ids.
     * @param parameters
     * @param ids a lizt of users id
     * @return
     */
    AnswersWrapper getAnswersOf(StackExchangeQueryParameters<Date> parameters, Integer...ids);

    /**
     * Get answers the logged in user answered.
     * @param parameters
     * @return
     */
    AnswersWrapper getMyAnswers(StackExchangeQueryParameters<Date> parameters);
}
