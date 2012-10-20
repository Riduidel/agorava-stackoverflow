/*
 * Copyright 2012 Agorava
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.agorava.stackoverflow.utils;

import org.agorava.core.api.SocialMediaApiHub;
import org.agorava.core.api.oauth.OAuthSession;
import org.agorava.core.api.oauth.Param;
import org.agorava.core.cdi.OAuthApplication;
import org.agorava.core.cdi.OAuthSessionImpl;
import org.agorava.core.oauth.PropertyOAuthAppSettingsBuilder;
import org.agorava.stackexchange.StackExchange;
import org.agorava.stackexchange.StackExchangeLiteral;
import org.agorava.stackexchange.StackExchangeServiceHub;

import javax.enterprise.context.ApplicationScoped;
import javax.enterprise.inject.Produces;

import static org.agorava.core.oauth.PropertyOAuthAppSettingsBuilder.PREFIX;

/**
 * @author ndx
 */
public class StackExchangeHubProducer {

    @StackExchange
    @ApplicationScoped
    @OAuthApplication(builder = PropertyOAuthAppSettingsBuilder.class,
            params = {@Param(name = PREFIX, value = "stack")})
    @Produces
    public SocialMediaApiHub OAuthSettinsProducer(StackExchangeServiceHub service) {
        return service;
    }

    @Produces
    @StackExchange
    @SessionLess
    public OAuthSession produceSession() {
        return new OAuthSessionImpl(StackExchangeLiteral.INSTANCE);
    }
}
