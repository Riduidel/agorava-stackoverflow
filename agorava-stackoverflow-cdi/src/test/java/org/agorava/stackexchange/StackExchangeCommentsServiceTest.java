package org.agorava.stackexchange;

import static org.junit.Assert.*;

import java.util.Date;

import javax.inject.Inject;

import org.agorava.stackexchange.model.Comment;
import org.agorava.stackexchange.model.wrappers.CommentsWrapper;
import org.hamcrest.core.IsNot;
import org.hamcrest.core.IsNull;
import org.junit.Test;

public class StackExchangeCommentsServiceTest extends StackExchangeTest {
	@Inject
	private StackExchangeCommentsService tested;

	@Test
	public void thereAreComments() {
		StackExchangeQueryParameters<Date> query = new StackExchangeQueryParameters<Date>();
		query.setFilter(StackExchangeCommentsService.FULL_COMMENTS);
		CommentsWrapper wrapper = tested.getComments(query);
		assertThat(wrapper.getItems().size(), IsNot.not(0));
		Comment first = wrapper.getItems().get(0);
		assertThat(first.getBodyMarkdown(), IsNull.notNullValue());
	}

}
