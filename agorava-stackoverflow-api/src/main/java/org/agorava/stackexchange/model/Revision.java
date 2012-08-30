/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange.model;

import java.util.Collection;
import java.util.Date;
import java.util.LinkedList;

/**
 * Modeled from https://api.stackexchange.com/docs/types/revision
 * @author ndx
 */
public class Revision {

    public static enum Type {

        single_user, vote_based;
    }
    public String revision_guid;
    public int revision_number;
    public Type revision_type;
    public PostType post_type;
    public int post_id;
    public String comment;
    public Date creation_date;
    public boolean is_rollback;
    public String last_body;
    public String last_title;
    public Collection<String> last_tags = new LinkedList<String>();
    public String body;
    public String title;
    public Collection<String> tags = new LinkedList<String>();
    public boolean set_community_wiki;
    public ShallowUser user;
}
