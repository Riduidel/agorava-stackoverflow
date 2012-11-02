package org.agorava.stackexchange;

import static org.junit.Assert.assertThat;

import java.util.List;

import javax.inject.Inject;

import org.agorava.stackexchange.model.Badge;
import org.agorava.stackexchange.model.wrappers.AbstractWrapper.ItemFilter;
import org.agorava.stackexchange.model.wrappers.BadgesWrapper;
import org.hamcrest.core.Is;
import org.hamcrest.core.IsNot;
import org.junit.Test;

public class StackExchangeBadgesServiceTest extends StackExchangeTest  {
	private static final String JAVA = "java";
	@Inject
	private StackExchangeBadgesService badges;

	@Test
	public void getFamousQuestionBadgeGlobally() {
		StackExchangeQueryParameters<String> query = new StackExchangeQueryParameters<String>();
		BadgesWrapper famousQuestionWrapper = badges.getBadges(query, 28);
		assertThat(famousQuestionWrapper.getItems().size(), Is.is(1));
		Badge famous = famousQuestionWrapper.getItems().get(0);
		assertThat(famous.getName(), Is.is("Famous Question"));
		assertThat(famous.getBadgeType(), Is.is(Badge.Type.named));
		assertThat(famous.getRank(), Is.is(Badge.Rank.gold));
	}

	@Test
	public void getQuestionPopularityBadgesHierarchy() {
		StackExchangeQueryParameters<String> query = new StackExchangeQueryParameters<String>();
		query.setSort(StackExchangeBadgesService.Sort.rank.name());
		BadgesWrapper questionPopularityWrapper = badges.getBadges(query, 28, 27, 26);
		assertThat(questionPopularityWrapper.getItems().size(), Is.is(3));
		// according to sort, first question is bronze, then silver,n then gold
		assertThat(questionPopularityWrapper.getItems().get(0).getRank(), Is.is(Badge.Rank.bronze));
		assertThat(questionPopularityWrapper.getItems().get(0).getName(), Is.is("Popular Question"));
		assertThat(questionPopularityWrapper.getItems().get(1).getRank(), Is.is(Badge.Rank.silver));
		assertThat(questionPopularityWrapper.getItems().get(1).getName(), Is.is("Notable Question"));
		assertThat(questionPopularityWrapper.getItems().get(2).getRank(), Is.is(Badge.Rank.gold));
		assertThat(questionPopularityWrapper.getItems().get(2).getName(), Is.is("Famous Question"));
	}
	
	@Test
	public void getATagBasedBadge() {
		StackExchangeQueryParameters<String> query = new StackExchangeQueryParameters<String>();
		BadgesWrapper javaWrapper = badges.getBadges(query, 44);
		assertThat(javaWrapper.getItems().size(), Is.is(1));
		Badge famous = javaWrapper.getItems().get(0);
		assertThat(famous.getName(), Is.is(JAVA));
		assertThat(famous.getBadgeType(), Is.is(Badge.Type.tag_based));
		assertThat(famous.getRank(), Is.is(Badge.Rank.gold));
	}
	
	@Test
	public void getAllJavaBadges() {
		StackExchangeQueryParameters<String> query = new StackExchangeQueryParameters<String>();
		query.setSort(StackExchangeBadgesService.Sort.rank.name());
		BadgesWrapper javaWrapper = badges.getTaggedBadges(query, JAVA);
		assertThat(javaWrapper.getItems().size(), IsNot.not(0));
		/* as the given inname is only a part of name, javaWrapper contains all badges containing the "java" text, like javaee, java-me, javafx, and so on */
		List<Badge> java = javaWrapper.filter(new ItemFilter<Badge>() {

			@Override
			public boolean matches(Badge toMatch) {
				return toMatch.getName().equals(JAVA);
			}
		});
		// there are 3 badges with the java name
		// according to sort, which filter keeps, first is bronze, then silver, then gold
		assertThat(java.size(), Is.is(3));
		assertThat(java.get(0).getRank(), Is.is(Badge.Rank.bronze));
		assertThat(java.get(0).getName(), Is.is(JAVA));
		assertThat(java.get(1).getRank(), Is.is(Badge.Rank.silver));
		assertThat(java.get(1).getName(), Is.is(JAVA));
		assertThat(java.get(2).getRank(), Is.is(Badge.Rank.gold));
		assertThat(java.get(2).getName(), Is.is(JAVA));
	}
}
