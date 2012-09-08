/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange.model;

/**
 * modeled from https://api.stackexchange.com/docs/types/badge
 * @author ndx
 */
public class Badge {

    public static enum Rank {

        gold, silver, bronze;
    }

    public static enum Type {

        named, tag_based;
    }
    public int badge_id;
    public Rank rank;
    public String name;
    public String description;
    public int award_count;
    public Type badge_type;
    public String link;
    public ShallowUser user;
}
