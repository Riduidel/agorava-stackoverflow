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
    private static final int JAVA_SHAPE_RECOGNITION_LIBRARY_ID = 2453337;
	private static final int CLASS_MAPPING_ANSWER_ID = 2426513;
	@Inject
    StackExchangeAnswersService answers;


    @Test
    public void ensureSiteHasAnswers() {
        AnswersWrapper found = answers.getAnswers(new StackExchangeQueryParameters<Date>());
        assertThat(found, IsNull.notNullValue());
        assertThat(found.getQuotaMax().intValue(), IsNot.not(0));
        assertThat(found.getQuotaRemaining().intValue(), IsNot.not(0));
        // currently StackExchange API only return one "items" object, containing infos for the current site
        // so this collections is expected to contain only one item as of now
        assertThat(found.getItems().size(), IsNot.not(0));
        assertThat(found.getItems().size(), IsNot.not(1));
    }


    /**
     * Obtain two answers by id and do some tests on these answers
     */
    @Test
    public void ensureStackoverflowHasAnAnswerWithTheIds2426513And2453337() {
        StackExchangeQueryParameters<Date> stackExchangeQueryParameters = new StackExchangeQueryParameters<Date>();
        // This filter allows me to have all answer fields set
        stackExchangeQueryParameters.setFilter(StackExchangeAnswersService.FULL_ANSWER);
        stackExchangeQueryParameters.setSort(StackExchangeAnswersService.Sort.creation.name());
		AnswersWrapper found = answers.getAnswers(stackExchangeQueryParameters, CLASS_MAPPING_ANSWER_ID, JAVA_SHAPE_RECOGNITION_LIBRARY_ID);
        assertThat(found, IsNull.notNullValue());
        assertThat(found.getQuotaMax().intValue(), IsNot.not(0));
        assertThat(found.getQuotaRemaining().intValue(), IsNot.not(0));
        // currently StackExchange API only return one "items" object, containing infos for the current site
        // so this collections is expected to contain only one item as of now
        assertThat(found.getItems().size(), Is.is(2));
        Answer first = found.getItems().get(0);
        assertThat(first.getLink(), Is.is("http://stackoverflow.com/questions/2453316/any-simple-shape-recognition-libraries-for-java/2453337#2453337"));
        Answer second = found.getItems().get(1);
        assertThat(second.getLink(), Is.is("http://stackoverflow.com/questions/2426444/intelligent-mapping-of-class-keys/2426513#2426513"));
    }

    /**
     * Obtain two answers by id and do some tests on these answers
     */
    @Test
    public void ensureRiduidelAnsweredIntelligentMappingOfClassKeys() {
        StackExchangeQueryParameters<Date> stackExchangeQueryParameters = new StackExchangeQueryParameters<Date>();
        // This filter allows me to have all answer fields set
        int classMappingUpdatedDate = 1268323204;
		stackExchangeQueryParameters.withFilter(StackExchangeAnswersService.FULL_ANSWER)
        	.withSort(StackExchangeAnswersService.Sort.creation.name())
        	// that quasi-random number has been pulled from previous test
        	.withFromDate(new Date(classMappingUpdatedDate-10))
        	.withToDate(new Date(classMappingUpdatedDate+10));
		AnswersWrapper found = answers.getAnswersOf(stackExchangeQueryParameters, RIDUIDEL_ON_STACKOVERFLOW);
        assertThat(found, IsNull.notNullValue());
        assertThat(found.getQuotaMax().intValue(), IsNot.not(0));
        assertThat(found.getQuotaRemaining().intValue(), IsNot.not(0));
        // currently StackExchange API only return one "items" object, containing infos for the current site
        // so this collections is expected to contain only one item as of now
        assertThat(found.getItems().size(), Is.is(1));
        Answer second = found.getItems().get(0);
        assertThat(second.getAnswerId(), Is.is(CLASS_MAPPING_ANSWER_ID));
        assertThat(second.getLink(), Is.is("http://stackoverflow.com/questions/2426444/intelligent-mapping-of-class-keys/2426513#2426513"));
    }
}
