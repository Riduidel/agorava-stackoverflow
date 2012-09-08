/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange.model;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

/**
 * Modeled from https://api.stackexchange.com/docs/types/suggested-edit
 * @author ndx
 */
public class SuggestedEdit {
    public Date approval_date;
    public String body;
    public String comment;
    public Date creation_date;
    public int post_id;
    public PostType post_type;
    public ShallowUser proposing_user;
    public Date rejection_date;
    public int suggested_edit_id;
    public Collection<String> tags = new LinkedList<String>();
    public String title;
}
