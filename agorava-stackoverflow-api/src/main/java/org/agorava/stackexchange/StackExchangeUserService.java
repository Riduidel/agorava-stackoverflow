/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import java.util.Date;

import org.agorava.stackexchange.model.wrappers.UsersWrapper;

/**
 * TODO borrow code from https://github.com/agorava/agorava-twitter/blob/develop/agorava-twitter-api/src/main/java/org/agorava/twitter/TwitterUserService.java
 * @author ndx
 */
public interface StackExchangeUserService {
	
	/**
	 * Available sorts for users
	 *
	 */
	public static enum  Sort {
		reputation,
		creation,
		name,
		modified;
	}

	public static final Filter FULL_USER = new Filter("!9hnGsu85z");
	
	/**
	 * URI allowing access to the "me" user for any site.
	 * See here (https://api.stackexchange.com/docs/me) for more infos
	 */
	public static final String ME_URI = "me";
	/**
	 * URI accessing to the users uri
	 */
	public static final String USERS_URI = "users";
	/**
	 * Declination of {@link #USERS_URI} with users ids given
	 */
	public static final String USERS_WITH_IDS_URI = "users/%s";
    /**
     * TODO chec how it matches SO concepts
     */
    public String getProfileId();

    /**
     * TODO check how it matches SO concepts
     */
    public String getScreenName();

    /**
     * Get the UsersWrapper corresponding to the logged in user.
     * No sort or filter is required here, cause we assume filter is {@link #FULL_USER}.
     * @param query the only meaningfull parameter here is the site (a user can have different profiles on different stackexchange sites, you know)
     * @return a wrapper containing logged in user (IF user is logged in).
     */
	public UsersWrapper getMe(StackExchangeQueryParameters<Date> query);

	/**
	 * Get users from the given site
	 * @param query classical parameters
	 * @return a wrapper containing queried users
	 */
	public UsersWrapper getUsers(StackExchangeQueryParameters<Date> query);

	/**
	 * Get users from the given site
	 * @param query classical parameters
	 * @return a wrapper containing queried users
	 */
	public UsersWrapper getUsers(StackExchangeQueryParameters<Date> query, String inname);

	public UsersWrapper getUsers(StackExchangeQueryParameters<Date> query,
			Integer...usersIds);
}
