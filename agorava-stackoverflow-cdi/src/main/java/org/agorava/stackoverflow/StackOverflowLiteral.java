/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackoverflow;

import java.lang.annotation.Annotation;
import javax.enterprise.util.AnnotationLiteral;

/**
 *
 * @author ndx
 */
public class StackOverflowLiteral extends AnnotationLiteral<StackOverflow> implements StackOverflow {
    public static StackOverflowLiteral INSTANCE = new StackOverflowLiteral();
    
}
