/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import org.agorava.stackexchange.model.Infos;

/**
 * @author Nicolas
 */
public class StackExchangeInfosServiceImpl extends StackExchangeBaseService implements StackExchangeInfoService {

    @Override
    public Infos getInfos() {
        // TODO obtain site name from any other possible way (ideally an injection ?)
        return getService().get(buildUri(SITE_INFOS, "site", "stackoverflow"), Infos.class, false);
    }
}
