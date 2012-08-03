/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import org.agorava.stackexchange.model.InfosWrapper;
import org.agorava.stackexchange.model.PrivilegesWrapper;

/**
 * @author Nicolas
 */
public class StackExchangeInfosServiceImpl extends StackExchangeBaseService implements StackExchangeInfoService {

    @Override
    public InfosWrapper getInfos() {
        // TODO obtain site name from any other possible way (ideally an injection ?)
        return getService().get(buildUri(SITE_INFOS, "site", SITE_TO_USE), InfosWrapper.class, false);
    }

    @Override
    public PrivilegesWrapper getPrivileges() {
        // TODO obtain site name from any other possible way (ideally an injection ?)
        return getService().get(buildUri(SITE_PRIVILEGES, "site", SITE_TO_USE), PrivilegesWrapper.class, false);
    }
}
