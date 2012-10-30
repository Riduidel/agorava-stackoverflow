/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import java.util.Date;
import org.agorava.stackexchange.model.wrappers.InfosWrapper;
import org.agorava.stackexchange.model.wrappers.PrivilegesWrapper;
import org.agorava.stackexchange.model.wrappers.SitesWrapper;

/**
 * @author Nicolas
 */
public class StackExchangeInfosServiceImpl extends StackExchangeBaseService implements StackExchangeInfoService {

    @Override
    public InfosWrapper getInfos(StackExchangeQueryParameters<Void> query) {
        return get(SITE_INFOS, InfosWrapper.class, query);
    }

    @Override
    public PrivilegesWrapper getPrivileges(StackExchangeQueryParameters<Void> query) {
        return get(SITE_PRIVILEGES, PrivilegesWrapper.class, query);
    }

    @Override
    public SitesWrapper getSites() {
        SitesWrapper returned = new SitesWrapper();
        returned.setHasMore(true);
        StackExchangeQueryParameters<Object> parameters = new StackExchangeQueryParameters<Object>();
        parameters.setSite(null);
        parameters.setPage(StackExchangeQueryParameters.FIRST_PAGE);
        parameters.setPagesize(StackExchangeQueryParameters.MAX_PAGE_SIZE);
        while(returned.getHasMore()) {
            SitesWrapper local = getService().get(buildUri(ALL_SITES, parameters.toMap()), SitesWrapper.class, false);
            returned.setHasMore(local.getHasMore());
            if(local.getHasMore()) {
            	parameters.setPage(parameters.getPage()+1);
            }
            returned.setQuotaRemaining(local.getQuotaRemaining());
            returned.getItems().addAll(local.getItems());
        }
        return returned;
    }
}
