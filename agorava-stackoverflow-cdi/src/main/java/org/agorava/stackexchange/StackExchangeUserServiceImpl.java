/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import org.agorava.stackexchange.model.wrappers.UsersWrapper;

/**
 *
 * @author ndx
 */
public class StackExchangeUserServiceImpl extends StackExchangeBaseService implements StackExchangeUserService {

    @Override
    public String getProfileId() {
	return getSession().getUserProfile().getId();
    }
    
    @Override
    public String getScreenName() {
        return getSession().getUserProfile().getFullName();
    }

	@Override
	public UsersWrapper getMe(StackExchangeQueryParameters<Date> query) {
        return get(ME_URI, UsersWrapper.class, query);
	}

	@Override
	public UsersWrapper getUsers(StackExchangeQueryParameters<Date> query) {
        return get(USERS_URI, UsersWrapper.class, query);
	}
	
	@Override
	public UsersWrapper getUsers(StackExchangeQueryParameters<Date> query,
			String inname) {
		Map<String, Object> parameters = new HashMap<String, Object>();
		parameters.put("inname", inname);
		return get(USERS_URI, UsersWrapper.class, query, parameters);
	}

	@Override
	public UsersWrapper getUsers(StackExchangeQueryParameters<Date> query,
			Integer... usersIds) {
        return get(USERS_WITH_IDS_URI, UsersWrapper.class, query, asCollection(usersIds));
	}
}
