/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import java.lang.annotation.Annotation;
import javax.enterprise.util.AnnotationLiteral;

/**
 *
 * @author ndx
 */
public class StackExchangeLiteral extends AnnotationLiteral<StackExchange> implements StackExchange {
    public static StackExchangeLiteral INSTANCE = new StackExchangeLiteral();
    
}
