/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import org.hamcrest.core.Is;
import org.hamcrest.core.IsNull;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;

import javax.inject.Inject;
import org.agorava.core.api.exception.AgoravaRestException;
import org.agorava.stackexchange.model.InfosWrapper;
import org.agorava.stackexchange.model.PrivilegesWrapper;
import org.agorava.stackexchange.model.SiteSpecificStats;
import org.hamcrest.core.IsNot;

import static org.junit.Assert.assertThat;
import org.junit.Ignore;

/**
 * @author Nicolas
 */
@RunWith(Arquillian.class)
public class StackExchangeInfoServiceTest extends StackExchangeTest {
    @Inject
    StackExchangeInfoService info;


    @Test @Ignore
    public void ensureSiteHasInfos() {
        InfosWrapper infos = info.getInfos();
        assertThat(infos, IsNull.notNullValue());
        assertThat(infos.getQuota_max().intValue(), IsNot.not(0));
        assertThat(infos.getQuota_remaining().intValue(), IsNot.not(0));
        // currently StackExchange API only return one "items" object, containing infos for the current site
        // so this collections is expected to contain only one item as of now
        assertThat(infos.getItems().size(), Is.is(1));
        SiteSpecificStats i = infos.getItems().get(0);
        assertThat(i.getAnswers_per_minute().floatValue(), IsNot.not(0f));
    }

    @Test
    public void ensureSiteHasPrivileges() {
        PrivilegesWrapper infos = info.getPrivileges();
        assertThat(infos, IsNull.notNullValue());
        assertThat(infos.getQuota_max().intValue(), IsNot.not(0));
        assertThat(infos.getQuota_remaining().intValue(), IsNot.not(0));
        // currently StackExchange API only return one "items" object, containing infos for the current site
        // so this collections is expected to contain only one item as of now
        assertThat(infos.getItems().size(), Is.is(1));
    }
}
