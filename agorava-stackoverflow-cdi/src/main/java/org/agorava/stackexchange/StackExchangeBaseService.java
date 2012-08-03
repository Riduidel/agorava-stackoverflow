/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import java.lang.annotation.Annotation;
import org.agorava.core.cdi.AbstractSocialNetworkService;

/**
    // TODO find a way to inject API root from used StackOverflow site
 *
 * @author ndx
 */
public class StackExchangeBaseService extends AbstractSocialNetworkService {
    /**
     * TODO REMOVE THAT CONSTANT !!!!
     */
    protected static final String SITE_TO_USE = "stackoverflow";

    @Override
    public Annotation getQualifier() {
        return StackExchangeLiteral.INSTANCE;
    }

    @Override
    public String getApiRootUrl() {
        return StackExchangeURIs.API_ROOT;
    }
    
    
}
