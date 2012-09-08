/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import org.agorava.stackexchange.model.wrappers.QuestionsWrapper;
import java.util.Collection;
import java.util.Date;
import org.agorava.stackexchange.StackExchangeQueryParameters;
import org.agorava.stackexchange.StackExchangeURIs;
import org.agorava.stackexchange.model.wrappers.AnswersWrapper;
import org.agorava.stackexchange.model.wrappers.CommentsWrapper;

/**
 *
 * @author ndx
 */
public interface StackExchangeQuestionsService extends StackExchangeURIs {
    public static final String QUESTIONS_URI = "questions";
    public static final String QUESTIONS_URI_WITH_IDS = "questions/{0}";
    public static final String QUESTIONS_ANSWERS = "questions/{0}/answers";
    public static final String QUESTIONS_COMMENTS = "questions/{0}/comments";
    public static final String QUESTIONS_LINKED = "questions/{0}/linked";
    public static final String QUESTIONS_RELATED = "questions/{0}/related";
    public static final String QUESTIONS_TIMELINE = "questions/{0}/timeline";
    public static final String QUESTIONS_FEATURED = "questions/featured";
    public static final String QUESTIONS_UNANSWERED = "questions/unanswered";
    public static final String QUESTIONS_NO_ANSWERS = "questions/no-answers";
    
    public QuestionsWrapper getQuestions(StackExchangeQueryParameters<Date> query);
    public QuestionsWrapper getQuestions(StackExchangeQueryParameters<Date> query, Collection<String> tags);
    public QuestionsWrapper getQuestions(StackExchangeQueryParameters<Date> query, String...tags);
    public QuestionsWrapper getQuestions(StackExchangeQueryParameters<Date> query, Integer...ids);
    public AnswersWrapper getAnswersFor(StackExchangeQueryParameters<Date> query, Integer...ids);
    public CommentsWrapper getCommentsFor(StackExchangeQueryParameters<Date> query, Integer...ids);
    public QuestionsWrapper getLinked(StackExchangeQueryParameters<Date> query, Integer...ids);
//    public QuestionsTimelineWrapper getTimeline(StackExchangeQueryParameters<Date> query, Integer...ids);
    public QuestionsWrapper getFeatured(StackExchangeQueryParameters<Date> query);
    public QuestionsWrapper getFeatured(StackExchangeQueryParameters<Date> query, Collection<String> tags);
    public QuestionsWrapper getUnanswered(StackExchangeQueryParameters<Date> query);
    public QuestionsWrapper getUnanswered(StackExchangeQueryParameters<Date> query, Collection<String> tags);
    public QuestionsWrapper getWithNoAnswers(StackExchangeQueryParameters<Date> query);
    public QuestionsWrapper getWithNoAnswers(StackExchangeQueryParameters<Date> query, Collection<String> tags);
}
