/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import org.agorava.stackexchange.StackExchangeUserService;

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
}
