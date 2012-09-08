/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import org.agorava.stackexchange.model.wrappers.BadgesWrapper;

/**
 *
 * @author ndx
 */
public interface StackExchangeBadgesService extends StackExchangeURIs {
   
    /**
     * defined from https://api.stackexchange.com/docs/badges
     */
    public static final String SITE_BADGES = "badges/";
    public static final String SITE_BADGES_WITH_IDS = "badges/{0}";
   
    /**
     * defined from https://api.stackexchange.com/docs/badge-recipients
     */
    public static final String SITE_BADGES_RECIPIENTS = "badges/recipients";
    public static final String SITE_BADGES_RECIPIENTS_WITH_IDS = "badges/{0}/recipients";
   
    /**
     * defined from https://api.stackexchange.com/docs/badges-by-name
     */
    public static final String SITE_NAMED_BADGES = "badges/name";
   
    /**
     * defined from https://api.stackexchange.com/docs/badges-by-tag
     */
    public static final String SITE_TAGGED_BADGES = "badges/tags";
    /**
     * In this case, there is a complicated use of sorting parameters : 
     * <blockquote>
     * This means that you can get a list of all tag based badges by passing min=tag_based, and conversely all the named badges by passing max=named, with sort=type.
     * For ranks, bronze is greater than silver which is greater than gold. Along with sort=rank, set max=gold for just gold badges, max=silver&min=silver for just silver, and min=bronze for just bronze.
     * </blockquote>
     * @param query
     * @return 
     */
    public BadgesWrapper getBadges(StackExchangeQueryParameters<String> query);
    
    public BadgesWrapper getBadges(StackExchangeQueryParameters<String> query, Integer...badgeIds);
    
    public BadgesWrapper getNamedBadges(StackExchangeQueryParameters<String> query);

    public BadgesWrapper getNamedBadges(StackExchangeQueryParameters<String> query, String inname);
    
    public BadgesWrapper getTaggedBadges(StackExchangeQueryParameters<String> query);

    public BadgesWrapper getTaggedBadges(StackExchangeQueryParameters<String> query, String inname);

    public BadgesWrapper getRecentlyAwarded(StackExchangeQueryParameters<Void> query);

    public BadgesWrapper getRecentlyAwarded(StackExchangeQueryParameters<Void> query, Integer...badgeIds);
}
