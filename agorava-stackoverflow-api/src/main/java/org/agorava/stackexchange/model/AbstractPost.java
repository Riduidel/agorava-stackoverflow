/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange.model;

import java.util.Date;

/**
 *
 * @author ndx
 */
public abstract class AbstractPost {
    /**
     * may be absent
     */
    public String link;
    public String body;
    public Date creation_date;
    public int down_vote_count;
    public Date last_activity_date;
    public Date last_edit_date;
    public ShallowUser owner;
    public PostType post_type;
    public int score;
    public int up_vote_count;
    
}
