/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import java.util.Date;

import org.agorava.stackexchange.model.wrappers.CommentsWrapper;

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
