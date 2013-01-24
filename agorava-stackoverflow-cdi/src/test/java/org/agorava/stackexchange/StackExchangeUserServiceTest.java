/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import static org.junit.Assert.assertThat;

import java.util.Date;

import javax.inject.Inject;

import org.agorava.stackexchange.StackExchangeQueryParameters.Order;
import org.agorava.stackexchange.model.User;
import org.agorava.stackexchange.model.wrappers.UsersWrapper;
import org.hamcrest.core.Is;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author Nicolas
 */
@RunWith(Arquillian.class)
public class StackExchangeUserServiceTest extends StackExchangeTest {

    private static final String USER_RIDUIDEL = "Riduidel";
	@Inject
    StackExchangeUserService userService;

    /**
     * If that test fails, it can only mean user is not logged in.
     */
    @Test
    public void getAGivenUser() {
    	StackExchangeQueryParameters<Date> query = new StackExchangeQueryParameters<Date>()
    			.withSort(StackExchangeUserService.Sort.name.name())
    			.withOrder(Order.asc);
    	query.setFilter(StackExchangeUserService.FULL_USER);
    	UsersWrapper wrapper = userService.getUsers(query, RIDUIDEL_ON_STACKOVERFLOW, ANTOINE_SD_ON_STACKOVERFLOW);
    	assertThat(wrapper.getItems().size(), Is.is(2));
    	User antoine_sd = wrapper.getItems().get(0); 
    	User riduidel = wrapper.getItems().get(1); 
    	assertThat(antoine_sd.getDisplayName(), Is.is("Antoine Sabot-Durand"));
    	assertThat(riduidel.getDisplayName(), Is.is(USER_RIDUIDEL));
    }

    /**
     * If that test fails, it can only mean user is not logged in.
     */
    @Test
    public void IAmLoggedInByMyCredentials() {
    	StackExchangeQueryParameters<Date> query = new StackExchangeQueryParameters<Date>();
    	UsersWrapper wrapper = userService.getMe(query);
    	assertThat(wrapper.getItems().size(), Is.is(1));
    	User riduidel = wrapper.getItems().get(0);
    	assertThat(riduidel.getDisplayName(), Is.is(USER_RIDUIDEL));
    }
}
