/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

/**
 * Interface holding all web service uris, used to provide unique definition
 * @author Nicolas
 */
public interface StackExchangeURIs {
    public static String API_ROOT = "https://api.stackexchange.com/";
    /**
     * defined from https://api.stackexchange.com/docs/info
     */
    public static final String SITE_INFOS = "2.0/info";
   
    /**
     * defined from https://api.stackexchange.com/docs/privileges
     */
    public static final String SITE_PRIVILEGES = "2.0/privileges";
}
