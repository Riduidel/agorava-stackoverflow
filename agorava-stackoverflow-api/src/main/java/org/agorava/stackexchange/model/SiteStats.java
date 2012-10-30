
package org.agorava.stackexchange.model;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonProperty;
import org.codehaus.jackson.annotate.JsonPropertyOrder;
import org.codehaus.jackson.map.annotate.JsonSerialize;

@JsonSerialize(include = JsonSerialize.Inclusion.NON_NULL)
@Generated("com.googlecode.jsonschema2pojo")
@JsonPropertyOrder({
    "total_questions",
    "total_unanswered",
    "total_accepted",
    "total_answers",
    "questions_per_minute",
    "answers_per_minute",
    "total_comments",
    "total_votes",
    "total_badges",
    "badges_per_minute",
    "total_users",
    "new_active_users",
    "api_revision",
    "site"
})
public class SiteStats {

    @JsonProperty("total_questions")
    private Integer totalQuestions;
    @JsonProperty("total_unanswered")
    private Integer totalUnanswered;
    @JsonProperty("total_accepted")
    private Integer totalAccepted;
    @JsonProperty("total_answers")
    private Integer totalAnswers;
    @JsonProperty("questions_per_minute")
    private Double questionsPerMinute;
    @JsonProperty("answers_per_minute")
    private Double answersPerMinute;
    @JsonProperty("total_comments")
    private Integer totalComments;
    @JsonProperty("total_votes")
    private Integer totalVotes;
    @JsonProperty("total_badges")
    private Integer totalBadges;
    @JsonProperty("badges_per_minute")
    private Double badgesPerMinute;
    @JsonProperty("total_users")
    private Integer totalUsers;
    @JsonProperty("new_active_users")
    private Integer newActiveUsers;
    @JsonProperty("api_revision")
    private String apiRevision;
    @JsonProperty("site")
    private Site site;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("total_questions")
    public Integer getTotalQuestions() {
        return totalQuestions;
    }

    @JsonProperty("total_questions")
    public void setTotalQuestions(Integer totalQuestions) {
        this.totalQuestions = totalQuestions;
    }

    public SiteStats withTotalQuestions(Integer totalQuestions) {
        this.totalQuestions = totalQuestions;
        return this;
    }

    @JsonProperty("total_unanswered")
    public Integer getTotalUnanswered() {
        return totalUnanswered;
    }

    @JsonProperty("total_unanswered")
    public void setTotalUnanswered(Integer totalUnanswered) {
        this.totalUnanswered = totalUnanswered;
    }

    public SiteStats withTotalUnanswered(Integer totalUnanswered) {
        this.totalUnanswered = totalUnanswered;
        return this;
    }

    @JsonProperty("total_accepted")
    public Integer getTotalAccepted() {
        return totalAccepted;
    }

    @JsonProperty("total_accepted")
    public void setTotalAccepted(Integer totalAccepted) {
        this.totalAccepted = totalAccepted;
    }

    public SiteStats withTotalAccepted(Integer totalAccepted) {
        this.totalAccepted = totalAccepted;
        return this;
    }

    @JsonProperty("total_answers")
    public Integer getTotalAnswers() {
        return totalAnswers;
    }

    @JsonProperty("total_answers")
    public void setTotalAnswers(Integer totalAnswers) {
        this.totalAnswers = totalAnswers;
    }

    public SiteStats withTotalAnswers(Integer totalAnswers) {
        this.totalAnswers = totalAnswers;
        return this;
    }

    @JsonProperty("questions_per_minute")
    public Double getQuestionsPerMinute() {
        return questionsPerMinute;
    }

    @JsonProperty("questions_per_minute")
    public void setQuestionsPerMinute(Double questionsPerMinute) {
        this.questionsPerMinute = questionsPerMinute;
    }

    public SiteStats withQuestionsPerMinute(Double questionsPerMinute) {
        this.questionsPerMinute = questionsPerMinute;
        return this;
    }

    @JsonProperty("answers_per_minute")
    public Double getAnswersPerMinute() {
        return answersPerMinute;
    }

    @JsonProperty("answers_per_minute")
    public void setAnswersPerMinute(Double answersPerMinute) {
        this.answersPerMinute = answersPerMinute;
    }

    public SiteStats withAnswersPerMinute(Double answersPerMinute) {
        this.answersPerMinute = answersPerMinute;
        return this;
    }

    @JsonProperty("total_comments")
    public Integer getTotalComments() {
        return totalComments;
    }

    @JsonProperty("total_comments")
    public void setTotalComments(Integer totalComments) {
        this.totalComments = totalComments;
    }

    public SiteStats withTotalComments(Integer totalComments) {
        this.totalComments = totalComments;
        return this;
    }

    @JsonProperty("total_votes")
    public Integer getTotalVotes() {
        return totalVotes;
    }

    @JsonProperty("total_votes")
    public void setTotalVotes(Integer totalVotes) {
        this.totalVotes = totalVotes;
    }

    public SiteStats withTotalVotes(Integer totalVotes) {
        this.totalVotes = totalVotes;
        return this;
    }

    @JsonProperty("total_badges")
    public Integer getTotalBadges() {
        return totalBadges;
    }

    @JsonProperty("total_badges")
    public void setTotalBadges(Integer totalBadges) {
        this.totalBadges = totalBadges;
    }

    public SiteStats withTotalBadges(Integer totalBadges) {
        this.totalBadges = totalBadges;
        return this;
    }

    @JsonProperty("badges_per_minute")
    public Double getBadgesPerMinute() {
        return badgesPerMinute;
    }

    @JsonProperty("badges_per_minute")
    public void setBadgesPerMinute(Double badgesPerMinute) {
        this.badgesPerMinute = badgesPerMinute;
    }

    public SiteStats withBadgesPerMinute(Double badgesPerMinute) {
        this.badgesPerMinute = badgesPerMinute;
        return this;
    }

    @JsonProperty("total_users")
    public Integer getTotalUsers() {
        return totalUsers;
    }

    @JsonProperty("total_users")
    public void setTotalUsers(Integer totalUsers) {
        this.totalUsers = totalUsers;
    }

    public SiteStats withTotalUsers(Integer totalUsers) {
        this.totalUsers = totalUsers;
        return this;
    }

    @JsonProperty("new_active_users")
    public Integer getNewActiveUsers() {
        return newActiveUsers;
    }

    @JsonProperty("new_active_users")
    public void setNewActiveUsers(Integer newActiveUsers) {
        this.newActiveUsers = newActiveUsers;
    }

    public SiteStats withNewActiveUsers(Integer newActiveUsers) {
        this.newActiveUsers = newActiveUsers;
        return this;
    }

    @JsonProperty("api_revision")
    public String getApiRevision() {
        return apiRevision;
    }

    @JsonProperty("api_revision")
    public void setApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
    }

    public SiteStats withApiRevision(String apiRevision) {
        this.apiRevision = apiRevision;
        return this;
    }

    @JsonProperty("site")
    public Site getSite() {
        return site;
    }

    @JsonProperty("site")
    public void setSite(Site site) {
        this.site = site;
    }

    public SiteStats withSite(Site site) {
        this.site = site;
        return this;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this);
    }

    @Override
    public int hashCode() {
        return HashCodeBuilder.reflectionHashCode(this);
    }

    @Override
    public boolean equals(Object other) {
        return EqualsBuilder.reflectionEquals(this, other);
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperties(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

}
