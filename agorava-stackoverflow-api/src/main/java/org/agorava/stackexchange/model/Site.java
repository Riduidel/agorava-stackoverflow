/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange.model;

import java.util.Collection;
import java.util.Date;

/**
 * modeled from https://api.stackexchange.com/docs/types/site
 * @author ndx
 */
public class Site {

    public static class RelatedSite {

        public String name;
        public String site_url;
        public Relation relation;
    /**
     * may be absent
     */
        public String api_site_parameter;
    }

    public static enum Relation {

        parent, meta, chat;
    }

    public static enum State {

        normal, closed_beta, open_beta, linked_meta;
    }

    public static enum Type {

        main_site, meta_site;
    }
    public Type site_type;
    /**
     * may be absent
     */
    public Collection<String> aliases;
    public String name;
    public String logo_url;
    public String api_site_parameter;
    public String site_url;
    public String audience;
    public String icon_url;
    public State site_state;
    /**
     * may be absent
     */
    public Date closed_beta_date;
    /**
     * may be absent
     */
    public Date open_beta_date;
    public Date launch_date;
    public String favicon_url;
    /**
     * may be absent
     */
    public Collection<RelatedSite> related_sites;
    /**
     * may be absent
     */
    public String twitter_account;
    
    public Styling styling;
    
    /**
     * may be absent
     */
    public Collection<String> markdown_extensions;
}
