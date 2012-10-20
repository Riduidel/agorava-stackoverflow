/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import java.util.HashMap;
import java.util.Map;
import org.agorava.stackexchange.model.wrappers.BadgesWrapper;

/**
 *
 * @author ndx
 */
public class StackExchangeBadgesServcieImpl extends StackExchangeBaseService implements StackExchangeBadgesService {

    @Override
    public BadgesWrapper getBadges(StackExchangeQueryParameters<String> query) {
        return get(SITE_BADGES, BadgesWrapper.class, query);
    }

    @Override
    public BadgesWrapper getBadges(StackExchangeQueryParameters<String> query, Integer... badgeIds) {
        return get(SITE_BADGES_WITH_IDS, BadgesWrapper.class, query, asCollection(badgeIds));
    }

    @Override
    public BadgesWrapper getNamedBadges(StackExchangeQueryParameters<String> query) {
        return get(SITE_NAMED_BADGES, BadgesWrapper.class, query);
    }

    @Override
    public BadgesWrapper getNamedBadges(StackExchangeQueryParameters<String> query, String inname) {
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("inname", inname);
        return get(SITE_NAMED_BADGES, BadgesWrapper.class, query, parameters);
    }

    @Override
    public BadgesWrapper getTaggedBadges(StackExchangeQueryParameters<String> query) {
        return get(SITE_TAGGED_BADGES, BadgesWrapper.class, query);
    }

    @Override
    public BadgesWrapper getTaggedBadges(StackExchangeQueryParameters<String> query, String inname) {
        Map<String, Object> parameters = new HashMap<String, Object>();
        parameters.put("inname", inname);
        return get(SITE_TAGGED_BADGES, BadgesWrapper.class, query, parameters);
    }

    @Override
    public BadgesWrapper getRecentlyAwarded(StackExchangeQueryParameters<Void> query) {
        return get(SITE_BADGES_RECIPIENTS, BadgesWrapper.class, query);
    }

    // That one I'm not really proud of
    @Override
    public BadgesWrapper getRecentlyAwarded(StackExchangeQueryParameters<Void> query, Integer... badgeIds) {
        return get(SITE_BADGES_RECIPIENTS_WITH_IDS, BadgesWrapper.class, query, asCollection(badgeIds));
    }
    
}
