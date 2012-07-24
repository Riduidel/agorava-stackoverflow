/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

/**
 * TODO borrow code from https://github.com/agorava/agorava-twitter/blob/develop/agorava-twitter-api/src/main/java/org/agorava/twitter/TwitterUserService.java
 * @author ndx
 */
public interface StackExchangeUserService {
    /**
     * TODO chec how it matches SO concepts
     */
    public String getProfileId();

    /**
     * TODO chec how it matches SO concepts
     */
    public String getScreenName();
}
