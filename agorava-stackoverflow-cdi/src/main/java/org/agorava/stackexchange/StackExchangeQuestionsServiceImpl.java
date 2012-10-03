package org.agorava.stackexchange;

import java.util.Collection;
import java.util.Date;

import org.agorava.stackexchange.model.wrappers.AnswersWrapper;
import org.agorava.stackexchange.model.wrappers.CommentsWrapper;
import org.agorava.stackexchange.model.wrappers.QuestionsWrapper;

public class StackExchangeQuestionsServiceImpl extends StackExchangeBaseService
		implements StackExchangeQuestionsService {

	@Override
	public QuestionsWrapper getQuestions(
			StackExchangeQueryParameters<Date> query) {
		return get(QUESTIONS_URI, QuestionsWrapper.class, query);
	}

	@Override
	public QuestionsWrapper getQuestions(
			StackExchangeQueryParameters<Date> query, Integer... ids) {
		return get(QUESTIONS_URI_WITH_IDS, QuestionsWrapper.class, query, asCollection(ids));
	}

	@Override
	public AnswersWrapper getAnswersFor(
			StackExchangeQueryParameters<Date> query, Integer... ids) {
		return get(QUESTIONS_ANSWERS, AnswersWrapper.class, query, asCollection(ids));
	}

	@Override
	public CommentsWrapper getCommentsFor(
			StackExchangeQueryParameters<Date> query, Integer... ids) {
		return get(QUESTIONS_COMMENTS, CommentsWrapper.class, query, asCollection(ids));
	}

	@Override
	public QuestionsWrapper getLinked(StackExchangeQueryParameters<Date> query,
			Integer... ids) {
		return get(QUESTIONS_LINKED, QuestionsWrapper.class, query, asCollection(ids));
	}

	@Override
	public QuestionsWrapper getFeatured(StackExchangeQueryParameters<Date> query) {
		return get(QUESTIONS_FEATURED, QuestionsWrapper.class, query);
	}

	@Override
	public QuestionsWrapper getUnanswered(
			StackExchangeQueryParameters<Date> query) {
		return get(QUESTIONS_UNANSWERED, QuestionsWrapper.class, query);
	}

	@Override
	public QuestionsWrapper getWithNoAnswers(
			StackExchangeQueryParameters<Date> query) {
		return get(QUESTIONS_NO_ANSWERS, QuestionsWrapper.class, query);
	}

}
