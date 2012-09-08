/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import org.agorava.core.cdi.AbstractSocialMediaApi;

/**
 * // TODO find a way to inject API root from used StackOverflow site
 *
 * @author ndx
 */
public abstract class StackExchangeBaseService extends AbstractSocialMediaApi {


    @Override
    public String buildUri(String url) {
        return StackExchangeURIs.API_ROOT + url;    //To change body of overridden methods use File | Settings | File Templates.
    }

}
