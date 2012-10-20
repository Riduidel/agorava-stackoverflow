/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import org.agorava.core.api.ServiceRelated;

import javax.inject.Qualifier;
import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import static java.lang.annotation.ElementType.*;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

/**
 * service annotation for StackOverflow
 * TODO add effectively connected site (SuperUser ? StackOverflow ?)
 * @author ndx
 */
@Qualifier
@ServiceRelated
@Target({TYPE, METHOD, PARAMETER, FIELD})
@Retention(RUNTIME)
@Documented
public @interface StackExchange {
    
}
