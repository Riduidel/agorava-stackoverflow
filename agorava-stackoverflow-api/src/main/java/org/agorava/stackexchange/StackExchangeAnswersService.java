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
    public static final String SITE_ANSWERS = "answers/";
    public static final String SITE_ANSWERS_WITH_IDS = "answers/{0}";
    
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
}
