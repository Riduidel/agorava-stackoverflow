/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange.model.wrappers;

import org.agorava.stackexchange.model.Privilege;

/**
 *
 * @author ndx
 */
public class PrivilegesWrapper extends AbstractWrapper<Privilege> {
    /**
     * Find privilege with the given short description.
     * @param shortDesc description to find
     * @return found element or null if none found
     */
    public Privilege findWithShortDescription(String shortDesc) {
        if(shortDesc==null)
            return null;
        for(Privilege p : getItems()) {
            if(shortDesc.equals(p.getShortDescription())) {
                return p;
            }
        }
        return null;
    }
}
