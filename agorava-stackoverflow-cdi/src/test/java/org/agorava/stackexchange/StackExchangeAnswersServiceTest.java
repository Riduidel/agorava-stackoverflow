/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import java.util.Date;
import org.agorava.stackexchange.model.wrappers.AnswersWrapper;
import javax.inject.Inject;
import org.agorava.stackexchange.model.*;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNot;
import org.hamcrest.core.IsNull;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.assertThat;

/**
 *
 * @author ndx
 */
@RunWith(Arquillian.class)
public class StackExchangeAnswersServiceTest extends StackExchangeTest {
    @Inject
    StackExchangeAnswersService answers;


    @Test
    public void ensureSiteHasAnswers() {
        AnswersWrapper found = answers.getAnswers(new StackExchangeQueryParameters<Date>());
        assertThat(found, IsNull.notNullValue());
        assertThat(found.getQuota_max().intValue(), IsNot.not(0));
        assertThat(found.getQuota_remaining().intValue(), IsNot.not(0));
        // currently StackExchange API only return one "items" object, containing infos for the current site
        // so this collections is expected to contain only one item as of now
        assertThat(found.getItems().size(), IsNot.not(0));
        assertThat(found.getItems().size(), IsNot.not(1));
    }


    @Test
    public void ensureStackoverflowHasAnAnswerWithTheIds2426513And2453337() {
        AnswersWrapper found = answers.getAnswers(new StackExchangeQueryParameters<Date>(), 2426513, 2453337);
        assertThat(found, IsNull.notNullValue());
        assertThat(found.getQuota_max().intValue(), IsNot.not(0));
        assertThat(found.getQuota_remaining().intValue(), IsNot.not(0));
        // currently StackExchange API only return one "items" object, containing infos for the current site
        // so this collections is expected to contain only one item as of now
        assertThat(found.getItems().size(), Is.is(2));
    }
}
