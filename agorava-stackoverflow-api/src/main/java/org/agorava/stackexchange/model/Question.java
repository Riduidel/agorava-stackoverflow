/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange.model;

import java.util.Collection;
import java.util.Date;

/**
 * Modeled from https://api.stackexchange.com/docs/types/question
 * @author ndx
 */
public class Question extends AbstractPost {
    public int accepted_answer_id;
    public int answer_count;
    public Collection<Answer> answers;
    public int bounty_amount;
    public Date bounty_closes_date;
    public int close_vote_count;
    public Date closed_date;
    public String closed_reason;
    public Collection<Comment> comments;
    public Date community_owned_date;
    public int delete_vote_count;
    public int favorite_count;
    public boolean is_answered;
    public Date locked_date;
    public MigrationInfo migrated_from;
    public MigrationInfo migrated_to;
    public Notice notice;
    public Date protected_date;
    public int question_id;
    public int reopen_vote_count;
    public int view_count;
}
