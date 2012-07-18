/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackoverflow;

import java.lang.annotation.Annotation;
import javax.enterprise.inject.Instance;
import javax.inject.Inject;
import org.agorava.core.cdi.AbstractSocialMediaApiHub;
import org.jboss.solder.logging.Logger;

/**
 *
 * @author ndx
 */
public class StackOverflowServiceHub extends AbstractSocialMediaApiHub {
    public static final String MEDIA_NAME = "StackOverflow";
    
    @Inject Logger logger;
    
    @Inject Instance<StackOverflowBaseService> services;

    @Override
    public Annotation getQualifier() {
        return StackOverflowLiteral.INSTANCE;
    }

    @Override
    public String getSocialMediaName() {
        return MEDIA_NAME;
    }
    
    
}
