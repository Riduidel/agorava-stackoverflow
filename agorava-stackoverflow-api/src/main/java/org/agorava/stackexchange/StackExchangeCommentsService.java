/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import java.util.Date;

import org.agorava.stackexchange.model.wrappers.CommentsWrapper;

/**
 * Service providing specific access to comments
 * @author ndx
 * TODO add write access (delete and update)
 */
public interface StackExchangeCommentsService extends StackExchangeURIs {
    public static final String COMMENTS_URI = "comments";
    public static final String COMMENTS_URI_WITH_IDS = "comments/%s";
    
    /**
     * Available sort orderings
     * @author Nicolas
     *
     */
    public static enum Sort {
    	creation,
    	votes;
    }
    
    public static final Filter FULL_COMMENTS = new Filter("!9hnGt(PPz");
    
    CommentsWrapper getComments(StackExchangeQueryParameters<Date> query);
    CommentsWrapper getComments(StackExchangeQueryParameters<Date> query, Integer...ids);
}
