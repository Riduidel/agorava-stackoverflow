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
import org.agorava.stackexchange.model.wrappers.InfosWrapper;
import org.agorava.stackexchange.model.Privilege;
import org.agorava.stackexchange.model.wrappers.PrivilegesWrapper;
import org.agorava.stackexchange.model.SiteStats;
import org.agorava.stackexchange.model.wrappers.SitesWrapper;
import org.hamcrest.core.IsNot;

import static org.junit.Assert.assertThat;

/**
 * @author Nicolas
 */
@RunWith(Arquillian.class)
public class StackExchangeInfoServiceTest extends StackExchangeTest {
	@Inject
	StackExchangeInfoService info;

	@Test
	public void ensureThereAreSites() {
		SitesWrapper infos = info.getSites();
		assertThat(infos, IsNull.notNullValue());
		// assertThat(infos.getQuota_max().intValue(), IsNot.not(0));
		assertThat(infos.getQuotaRemaining().intValue(), IsNot.not(0));
		// currently StackExchange API only return one "items" object,
		// containing infos for the current site
		// so this collections is expected to contain only one item as of now
		assertThat(infos.getItems().size(), IsNot.not(0));
		assertThat(infos.getItems().size(), IsNot.not(1));
		assertThat(infos.getTotal(), IsNot.not(0));
	}

	@Test
	public void ensureSiteHasInfos() {
		InfosWrapper infos = info.getInfos(new StackExchangeQueryParameters<Void>());
		assertThat(infos, IsNull.notNullValue());
		// assertThat(infos.getQuota_max().intValue(), IsNot.not(0));
		assertThat(infos.getQuotaRemaining().intValue(), IsNot.not(0));
		// currently StackExchange API only return one "items" object,
		// containing infos for the current site
		// so this collections is expected to contain only one item as of now
		assertThat(infos.getItems().size(), Is.is(1));
		SiteStats i = infos.getItems().get(0);
		assertThat(i.getAnswersPerMinute().floatValue(), IsNot.not(0f));
	}

	@Test
	public void ensureSiteHasPrivileges() {
		PrivilegesWrapper infos = info.getPrivileges(new StackExchangeQueryParameters<Void>());
		assertThat(infos, IsNull.notNullValue());
		// assertThat(infos.getQuota_max().intValue(), IsNot.not(0));
		assertThat(infos.getQuotaRemaining().intValue(), IsNot.not(0));
		// currently StackExchange API only return one "items" object,
		// containing infos for the current site
		// so this collections is expected to contain only one item as of now
		assertThat(infos.getItems().size(), IsNot.not(0));
		Privilege createPosts = infos.findWithShortDescription("create posts");
		assertThat(createPosts, IsNull.notNullValue());
		assertThat(createPosts.getDescription(), IsNull.notNullValue());
	}
}
