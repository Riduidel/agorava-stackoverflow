/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import org.agorava.stackexchange.model.wrappers.SuggestedEditsWrapper;
import org.agorava.stackexchange.model.wrappers.RevisionsWrapper;
import org.agorava.stackexchange.model.wrappers.PostsWrapper;
import java.util.Date;
import org.agorava.stackexchange.model.wrappers.CommentsWrapper;

/**
 *
 * @author ndx
 */
public interface StackExchangePostsService extends StackExchangeURIs {
    public static final String POSTS_URI = "posts";
    public static final String POSTS_URI_WITH_IDS = "posts/%s";
    public static final String POSTS_COMMENTS_URI_WITH_IDS = "posts/%s/comments";
    public static final String POSTS_REVISIONS_URI_WITH_IDS = "posts/%s/revisions";
    public static final String POSTS_SUGGESTED_EDITS_URI_WITH_IDS = "posts/%s/comments";
    
    public PostsWrapper getPosts(StackExchangeQueryParameters<Date> query);
    public PostsWrapper getPosts(StackExchangeQueryParameters<Date> query, Integer...ids);
    public CommentsWrapper getCommentsOfPosts(StackExchangeQueryParameters<Date> query, Integer...ids);
    public RevisionsWrapper getRevisionsOfPosts(StackExchangeQueryParameters<Date> query, Integer...ids);
    public SuggestedEditsWrapper getSuggestedEditsOfPosts(StackExchangeQueryParameters<Date> query, Integer...ids);
}
