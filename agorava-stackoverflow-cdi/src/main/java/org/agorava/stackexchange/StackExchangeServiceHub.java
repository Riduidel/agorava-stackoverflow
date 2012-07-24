/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import java.lang.annotation.Annotation;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import org.agorava.core.cdi.AbstractSocialMediaApiHub;
import org.jboss.solder.logging.Logger;

/**
 *
 * @author ndx
 */
public class StackExchangeServiceHub extends AbstractSocialMediaApiHub {
    public static final String MEDIA_NAME = "StackExchange";
    
    @Inject Logger logger;
    
    @Inject Instance<StackExchangeBaseService> services;

    @Override
    public Annotation getQualifier() {
        return StackExchangeLiteral.INSTANCE;
    }

    @Override
    public String getSocialMediaName() {
        return MEDIA_NAME;
    }
    
    
}
