/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import org.agorava.stackexchange.StackExchangeUserService;
import javax.inject.Inject;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author Nicolas
 */
@RunWith(Arquillian.class)
public class StackExchangeUserServiceTest extends StackExchangeTest {

    @Inject
    StackExchangeUserService userService;

    @Test
    public void authorizationUrlTest() {
        Assert.assertTrue(serviceHub.getService().getAuthorizationUrl().startsWith("http"));
    }
}
