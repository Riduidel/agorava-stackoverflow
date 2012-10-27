package org.agorava.stackexchange;

import static org.junit.Assert.assertThat;

import javax.inject.Inject;

import org.agorava.stackexchange.model.Badge;
import org.agorava.stackexchange.model.wrappers.BadgesWrapper;
import org.hamcrest.core.Is;
import org.junit.Test;

public class StackExchangeBadgesServiceTest extends StackExchangeTest  {
	@Inject
	private StackExchangeBadgesService badges;

	@Test
	public void getFamousQuestionBadgeGlobally() {
		StackExchangeQueryParameters<String> query = new StackExchangeQueryParameters<String>();
		BadgesWrapper famousQuestionWrapper = badges.getBadges(query, 28);
		assertThat(famousQuestionWrapper.getItems().size(), Is.is(1));
		Badge famous = famousQuestionWrapper.getItems().get(0);
		assertThat(famous.name, Is.is("Famous Question"));
		assertThat(famous.badge_type, Is.is(Badge.Type.named));
		assertThat(famous.rank, Is.is(Badge.Rank.gold));
	}

	@Test
	public void getQuestionPopularityBadgesHierarchy() {
		StackExchangeQueryParameters<String> query = new StackExchangeQueryParameters<String>();
		query.setSort(StackExchangeBadgesService.SORT_BY_RANK);
		BadgesWrapper questionPopularityWrapper = badges.getBadges(query, 28, 27, 26);
		assertThat(questionPopularityWrapper.getItems().size(), Is.is(3));
		// according to sort, first question is bronze, then silver,n then gold
		assertThat(questionPopularityWrapper.getItems().get(0).rank, Is.is(Badge.Rank.bronze));
		assertThat(questionPopularityWrapper.getItems().get(0).name, Is.is("Popular Question"));
		assertThat(questionPopularityWrapper.getItems().get(1).rank, Is.is(Badge.Rank.silver));
		assertThat(questionPopularityWrapper.getItems().get(1).name, Is.is("Notable Question"));
		assertThat(questionPopularityWrapper.getItems().get(2).rank, Is.is(Badge.Rank.gold));
		assertThat(questionPopularityWrapper.getItems().get(2).name, Is.is("Famous Question"));
	}
	
	@Test
	public void getATagBasedBadge() {
		StackExchangeQueryParameters<String> query = new StackExchangeQueryParameters<String>();
		BadgesWrapper famousQuestionWrapper = badges.getBadges(query, 44);
		assertThat(famousQuestionWrapper.getItems().size(), Is.is(1));
		Badge famous = famousQuestionWrapper.getItems().get(0);
		assertThat(famous.name, Is.is("java"));
		assertThat(famous.badge_type, Is.is(Badge.Type.tag_based));
		assertThat(famous.rank, Is.is(Badge.Rank.gold));
	}
}
