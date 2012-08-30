/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange.model;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

/**
 * Modeled from https://api.stackexchange.com/docs/types/answer
 * @author ndx
 */
public class Answer extends AbstractPost {
    public int answer_id;
    /**
     * an array of comments. may be absent.
     */
    public Collection<Comment> comments = new LinkedList<Comment>();
    public Date community_owned_date;
    public boolean  is_accepted;
    /**
     * may be absent
     */
    public Date locked_date;
    public int question_id;
    public Collection<String> tags = new LinkedList<String>();
    /**
     * may be absent
     */
    public String title;
}
