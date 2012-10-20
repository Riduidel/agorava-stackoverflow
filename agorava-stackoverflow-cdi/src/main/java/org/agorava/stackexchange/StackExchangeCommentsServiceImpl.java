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
public class StackExchangeCommentsServiceImpl extends StackExchangeBaseService implements StackExchangeCommentsService {

    @Override
    public CommentsWrapper getComments(StackExchangeQueryParameters<Date> query) {
        return get(COMMENTS_URI, CommentsWrapper.class, query);
    }

    @Override
    public CommentsWrapper getComments(StackExchangeQueryParameters<Date> query, Integer... ids) {
        return get(COMMENTS_URI_WITH_IDS, CommentsWrapper.class, query, asCollection(ids));
    }
    
}
