/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import org.agorava.stackexchange.model.wrappers.InfosWrapper;
import org.agorava.stackexchange.model.wrappers.PrivilegesWrapper;
import org.agorava.stackexchange.model.wrappers.SitesWrapper;

/**
 * Interface providing access to global site infos
 * @author Nicolas
 */
public interface StackExchangeInfoService extends StackExchangeURIs {
   
    /**
     * defined from https://api.stackexchange.com/docs/sites
     */
    public static final String ALL_SITES = "sites/";
    /**
     * defined from https://api.stackexchange.com/docs/info
     */
    public static final String SITE_INFOS = "info/";
   
    /**
     * defined from https://api.stackexchange.com/docs/privileges
     */
    public static final String SITE_PRIVILEGES = "privileges/";
    /**
     * Get information about the entire site.
     * @return wrapper containing (theoretically) only one infos object.
     */
    InfosWrapper getInfos(StackExchangeQueryParameters<Void> query);
    /**
     * Get all privileges on one site
     * Privileges define abilities a user can earn (via reputation) on any Stack Exchange site.
     * While fairly stable, over time they do change. New ones are introduced with new features, and the reputation requirements change as a site matures.
     * @return a wrapper containing a list of Privilege
     */
    PrivilegesWrapper getPrivileges(StackExchangeQueryParameters<Void> query);
    
    /**
     * Get the list of available sites. That very call allows one to obtain the whole list of site (by doing as many REST call that are needed).
     * @return a wrapper containing the whole list of sites
     */
    SitesWrapper getSites();
}
