/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackoverflow;

import org.agorava.core.api.SocialMediaApiHub;
import org.agorava.core.api.oauth.Param;
import org.agorava.core.oauth.OAuthApplication;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import static org.agorava.core.api.oauth.OAuthAppSettingsBuilder.API_KEY;
import static org.agorava.core.api.oauth.OAuthAppSettingsBuilder.API_SECRET;

/**
 *
 * @author ndx
 */
public class StackOverflowProducer {

    @StackOverflow
    @ApplicationScoped
    @OAuthApplication(params = {
        @Param(name = API_KEY, value = "TODO generate api key"),
        @Param(name = API_SECRET, value = "TODO generate api secret")})
    @Produces
    public SocialMediaApiHub OAuthSettinsProducer(StackOverflowServiceHub service) {
        return service;
    }
}
