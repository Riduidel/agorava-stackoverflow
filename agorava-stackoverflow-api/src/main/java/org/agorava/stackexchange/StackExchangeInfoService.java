/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import org.agorava.stackexchange.model.InfosWrapper;
import org.agorava.stackexchange.model.PrivilegesWrapper;

/**
 * Interface providing access to global site infos
 * @author Nicolas
 */
public interface StackExchangeInfoService extends StackExchangeURIs {
    /**
     * Get infos about
     * @return 
     */
    InfosWrapper getInfos();
    /**
     * Get all privileges on one site
     * Privileges define abilities a user can earn (via reputation) on any Stack Exchange site.
     * While fairly stable, over time they do change. New ones are introduced with new features, and the reputation requirements change as a site matures.
     * @return a wrapper containing a list of Privilege
     */
    PrivilegesWrapper getPrivileges();
}
