/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;
import static org.junit.Assert.assertThat;

import javax.inject.Inject;
import org.agorava.stackexchange.model.Infos;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNull;
import org.jboss.arquillian.junit.Arquillian;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author Nicolas
 */
@RunWith(Arquillian.class)
public class StackExchangeInfoServiceTest extends StackExchangeTest {
    @Inject StackExchangeInfoService info;


    @Test
    public void ensureSiteHasInfos() {
	Infos infos = info.getInfos();
	assertThat(infos, IsNull.notNullValue());
	assertThat(infos.getQuota_max().intValue(), Is.is(10000));
    }
}
