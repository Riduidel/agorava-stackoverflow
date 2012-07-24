/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.scribe.builder.api;

import org.scribe.model.OAuthConfig;
import org.scribe.utils.OAuthEncoder;
import org.scribe.utils.Preconditions;

/**
 * Created thanks to antoine_sd and the doc available both from scribe and from
 * https://api.stackexchange.com/docs/authentication TODO integrate api key and
 * api secret (available both on StackOverflow site)
 * 
 * @author ndx
 */
public class StackExchangeApi extends DefaultApi20 {

	private static final String AUTHORIZE_URL = "https://stackexchange.com/oauth?client_id=%s&redirect_uri=%s";
	private static final String SCOPED_AUTHORIZE_URL = AUTHORIZE_URL+"&scope=%s";

	@Override
	public String getAccessTokenEndpoint() {
		return "https://stackexchange.com/oauth/access_token";
	}

	@Override
	public String getAuthorizationUrl(OAuthConfig config) {
//		Preconditions
//				.checkValidUrl(config.getCallback(),
//						"Must provide a valid url as callback. StackOverflow");

		// Append scope if present
		if (config.hasScope()) {
			return String.format(SCOPED_AUTHORIZE_URL, config.getApiKey(),
					OAuthEncoder.encode(config.getCallback()),
					OAuthEncoder.encode(config.getScope()));
		} else {
			return String.format(AUTHORIZE_URL, config.getApiKey(),
					OAuthEncoder.encode(config.getCallback()));
		}
	}

}
