/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scribe.builder.api;

import org.scribe.model.OAuthConfig;

/**
 * Created thanks to antoine_sd and the doc available both from scribe and from https://api.stackexchange.com/docs/authentication
 * @author ndx
 */
public class StackOverflowApi extends DefaultApi20 {

    @Override
    public String getAccessTokenEndpoint() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public String getAuthorizationUrl(OAuthConfig oac) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
