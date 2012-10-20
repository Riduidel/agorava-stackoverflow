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

import org.agorava.core.api.oauth.OAuthSession;
import org.agorava.core.cdi.OAuthServiceImpl;
import org.agorava.stackexchange.StackExchange;

import javax.enterprise.inject.Specializes;
import javax.inject.Inject;

/**
 * @author Antoine Sabot-Durand
 */
@Specializes
public class OAuthServiceSessionLess extends OAuthServiceImpl {

    @Inject
    @SessionLess
    @StackExchange
    private OAuthSession session;


    @Override
    public OAuthSession getSession() {
        return session;

    }
}
