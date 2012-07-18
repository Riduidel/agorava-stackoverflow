/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackoverflow;

import java.lang.annotation.Annotation;
import org.agorava.core.cdi.AbstractSocialNetworkService;

/**
    // TODO find a way to inject API root from used StackOverflow site
 *
 * @author ndx
 */
public class StackOverflowBaseService extends AbstractSocialNetworkService {

    @Override
    public Annotation getQualifier() {
        return StackOverflowLiteral.INSTANCE;
    }
    
    
}
