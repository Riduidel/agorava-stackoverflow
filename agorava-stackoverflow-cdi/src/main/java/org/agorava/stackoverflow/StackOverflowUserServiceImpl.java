/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackoverflow;

/**
 *
 * @author ndx
 */
public class StackOverflowUserServiceImpl extends StackOverflowBaseService implements StackOverflowUserService {

    @Override
    public String getProfileId() {
	return getSession().getUserProfile().getId();
    }
    
    @Override
    public String getScreenName() {
        return getSession().getUserProfile().getFullName();
    }
}
