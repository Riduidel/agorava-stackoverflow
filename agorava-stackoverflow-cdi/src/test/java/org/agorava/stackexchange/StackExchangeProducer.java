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
    public static final String STACKOVERFLOW_SECRET = "r5keqeo7rtTq0NXBea9ZqQ((";
    public static final String STACKOVERFLOW_TOKEN = "X)SStU6ugHkVHwu0zZ3JBg((";

    @StackExchange
    @ApplicationScoped
    @OAuthApplication(params = {
            @Param(name = API_KEY, value = STACKOVERFLOW_TOKEN),
            @Param(name = API_SECRET, value = STACKOVERFLOW_SECRET)})
    @Produces
    public SocialMediaApiHub OAuthSettinsProducer(StackExchangeServiceHub service) {
        return service;
    }
}
