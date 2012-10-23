/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import org.agorava.stackexchange.model.wrappers.CommentsWrapper;
import java.util.Date;

/**
 *
 * @author ndx
 */
public interface StackExchangeCommentsService extends StackExchangeURIs {
    public static final String COMMENTS_URI = "comments";
    public static final String COMMENTS_URI_WITH_IDS = "comments/%s";
    CommentsWrapper getComments(StackExchangeQueryParameters<Date> query);
    CommentsWrapper getComments(StackExchangeQueryParameters<Date> query, Integer...ids);
}
