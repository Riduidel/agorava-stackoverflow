/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import java.util.Date;
import org.agorava.stackexchange.model.wrappers.CommentsWrapper;
import org.agorava.stackexchange.model.wrappers.PostsWrapper;
import org.agorava.stackexchange.model.wrappers.RevisionsWrapper;
import org.agorava.stackexchange.model.wrappers.SuggestedEditsWrapper;

/**
 *
 * @author ndx
 */
public class StackExchangePostsServiceImpl extends StackExchangeBaseService implements StackExchangePostsService {

    @Override
    public PostsWrapper getPosts(StackExchangeQueryParameters<Date> query) {
        return get(POSTS_URI, PostsWrapper.class, query);
    }

    @Override
    public PostsWrapper getPosts(StackExchangeQueryParameters<Date> query, Integer... ids) {
        return get(POSTS_URI_WITH_IDS, PostsWrapper.class, query, asCollection(ids));
    }

    @Override
    public CommentsWrapper getCommentsOfPosts(StackExchangeQueryParameters<Date> query, Integer... ids) {
        return get(POSTS_COMMENTS_URI_WITH_IDS, CommentsWrapper.class, query, asCollection(ids));
    }

    @Override
    public RevisionsWrapper getRevisionsOfPosts(StackExchangeQueryParameters<Date> query, Integer... ids) {
        return get(POSTS_REVISIONS_URI_WITH_IDS, RevisionsWrapper.class, query, asCollection(ids));
    }

    @Override
    public SuggestedEditsWrapper getSuggestedEditsOfPosts(StackExchangeQueryParameters<Date> query, Integer... ids) {
        return get(POSTS_SUGGESTED_EDITS_URI_WITH_IDS, SuggestedEditsWrapper.class, query, asCollection(ids));
    }
    
}
