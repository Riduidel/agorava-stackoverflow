/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import org.agorava.core.api.SocialMediaApiHub;
import org.agorava.core.api.oauth.Param;
import org.agorava.core.cdi.OAuthApplication;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import static org.agorava.core.api.oauth.OAuthAppSettingsBuilder.API_KEY;
import static org.agorava.core.api.oauth.OAuthAppSettingsBuilder.API_SECRET;

/**
 * @author ndx
 */
public class StackExchangeProducer {

    @StackExchange
    @ApplicationScoped
    @OAuthApplication(params = {
            @Param(name = API_KEY, value = "TODO generate api key"),
            @Param(name = API_SECRET, value = "TODO generate api secret")})
    @Produces
    public SocialMediaApiHub OAuthSettinsProducer(StackExchangeServiceHub service) {
        return service;
    }
}
