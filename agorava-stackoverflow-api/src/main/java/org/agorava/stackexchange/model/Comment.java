/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange.model;

import java.util.Date;

/**
 * Modeled from https://api.stackexchange.com/docs/types/comment
 * @author ndx
 */
public class Comment {
    /**
     * may be absent
     */
    public String body;
    /**
     * may be absent
     */
    public String body_markdown;
    public int comment_id;
    public Date creation_date;
    public boolean edited;
    /**
     * may be absent
     */
    public String link;
    public ShallowUser owner;
    public int post_id;
    /**
     * may be absent
     */
    public PostType post_type;
    public ShallowUser reply_to_user;
    public int score;
}
