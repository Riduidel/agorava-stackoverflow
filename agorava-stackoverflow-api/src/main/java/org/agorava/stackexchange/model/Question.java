
package org.agorava.stackexchange.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "question_id",
    "creation_date",
    "last_activity_date",
    "score",
    "answer_count",
    "body",
    "title",
    "tags",
    "up_vote_count",
    "down_vote_count",
    "favorite_count",
    "view_count",
    "owner",
    "answers",
    "link",
    "is_answered",
    "close_vote_count",
    "reopen_vote_count",
    "delete_vote_count",
    "last_edit_date",
    "comments",
    "accepted_answer_id"
})
public class Question {

    @JsonProperty("question_id")
    private Integer questionId;
    @JsonProperty("creation_date")
    private Integer creationDate;
    @JsonProperty("last_activity_date")
    private Integer lastActivityDate;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("answer_count")
    private Integer answerCount;
    @JsonProperty("body")
    private String body;
    @JsonProperty("title")
    private String title;
    @JsonProperty("tags")
    private List<String> tags = new ArrayList<String>();
    @JsonProperty("up_vote_count")
    private Integer upVoteCount;
    @JsonProperty("down_vote_count")
    private Integer downVoteCount;
    @JsonProperty("favorite_count")
    private Integer favoriteCount;
    @JsonProperty("view_count")
    private Integer viewCount;
    @JsonProperty("owner")
    private ShallowUser owner;
    @JsonProperty("answers")
    private List<Answer> answers = new ArrayList<Answer>();
    @JsonProperty("link")
    private String link;
    @JsonProperty("is_answered")
    private Boolean isAnswered;
    @JsonProperty("close_vote_count")
    private Integer closeVoteCount;
    @JsonProperty("reopen_vote_count")
    private Integer reopenVoteCount;
    @JsonProperty("delete_vote_count")
    private Integer deleteVoteCount;
    @JsonProperty("last_edit_date")
    private Integer lastEditDate;
    @JsonProperty("comments")
    private List<Comment> comments = new ArrayList<Comment>();
    @JsonProperty("accepted_answer_id")
    private Integer acceptedAnswerId;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("question_id")
    public Integer getQuestionId() {
        return questionId;
    }

    @JsonProperty("question_id")
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Question withQuestionId(Integer questionId) {
        this.questionId = questionId;
        return this;
    }

    @JsonProperty("creation_date")
    public Integer getCreationDate() {
        return creationDate;
    }

    @JsonProperty("creation_date")
    public void setCreationDate(Integer creationDate) {
        this.creationDate = creationDate;
    }

    public Question withCreationDate(Integer creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    @JsonProperty("last_activity_date")
    public Integer getLastActivityDate() {
        return lastActivityDate;
    }

    @JsonProperty("last_activity_date")
    public void setLastActivityDate(Integer lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
    }

    public Question withLastActivityDate(Integer lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
        return this;
    }

    @JsonProperty("score")
    public Integer getScore() {
        return score;
    }

    @JsonProperty("score")
    public void setScore(Integer score) {
        this.score = score;
    }

    public Question withScore(Integer score) {
        this.score = score;
        return this;
    }

    @JsonProperty("answer_count")
    public Integer getAnswerCount() {
        return answerCount;
    }

    @JsonProperty("answer_count")
    public void setAnswerCount(Integer answerCount) {
        this.answerCount = answerCount;
    }

    public Question withAnswerCount(Integer answerCount) {
        this.answerCount = answerCount;
        return this;
    }

    @JsonProperty("body")
    public String getBody() {
        return body;
    }

    @JsonProperty("body")
    public void setBody(String body) {
        this.body = body;
    }

    public Question withBody(String body) {
        this.body = body;
        return this;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(String title) {
        this.title = title;
    }

    public Question withTitle(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("tags")
    public List<String> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    public Question withTags(List<String> tags) {
        this.tags = tags;
        return this;
    }

    @JsonProperty("up_vote_count")
    public Integer getUpVoteCount() {
        return upVoteCount;
    }

    @JsonProperty("up_vote_count")
    public void setUpVoteCount(Integer upVoteCount) {
        this.upVoteCount = upVoteCount;
    }

    public Question withUpVoteCount(Integer upVoteCount) {
        this.upVoteCount = upVoteCount;
        return this;
    }

    @JsonProperty("down_vote_count")
    public Integer getDownVoteCount() {
        return downVoteCount;
    }

    @JsonProperty("down_vote_count")
    public void setDownVoteCount(Integer downVoteCount) {
        this.downVoteCount = downVoteCount;
    }

    public Question withDownVoteCount(Integer downVoteCount) {
        this.downVoteCount = downVoteCount;
        return this;
    }

    @JsonProperty("favorite_count")
    public Integer getFavoriteCount() {
        return favoriteCount;
    }

    @JsonProperty("favorite_count")
    public void setFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
    }

    public Question withFavoriteCount(Integer favoriteCount) {
        this.favoriteCount = favoriteCount;
        return this;
    }

    @JsonProperty("view_count")
    public Integer getViewCount() {
        return viewCount;
    }

    @JsonProperty("view_count")
    public void setViewCount(Integer viewCount) {
        this.viewCount = viewCount;
    }

    public Question withViewCount(Integer viewCount) {
        this.viewCount = viewCount;
        return this;
    }

    @JsonProperty("owner")
    public ShallowUser getOwner() {
        return owner;
    }

    @JsonProperty("owner")
    public void setOwner(ShallowUser owner) {
        this.owner = owner;
    }

    public Question withOwner(ShallowUser owner) {
        this.owner = owner;
        return this;
    }

    @JsonProperty("answers")
    public List<Answer> getAnswers() {
        return answers;
    }

    @JsonProperty("answers")
    public void setAnswers(List<Answer> answers) {
        this.answers = answers;
    }

    public Question withAnswers(List<Answer> answers) {
        this.answers = answers;
        return this;
    }

    @JsonProperty("link")
    public String getLink() {
        return link;
    }

    @JsonProperty("link")
    public void setLink(String link) {
        this.link = link;
    }

    public Question withLink(String link) {
        this.link = link;
        return this;
    }

    @JsonProperty("is_answered")
    public Boolean getIsAnswered() {
        return isAnswered;
    }

    @JsonProperty("is_answered")
    public void setIsAnswered(Boolean isAnswered) {
        this.isAnswered = isAnswered;
    }

    public Question withIsAnswered(Boolean isAnswered) {
        this.isAnswered = isAnswered;
        return this;
    }

    @JsonProperty("close_vote_count")
    public Integer getCloseVoteCount() {
        return closeVoteCount;
    }

    @JsonProperty("close_vote_count")
    public void setCloseVoteCount(Integer closeVoteCount) {
        this.closeVoteCount = closeVoteCount;
    }

    public Question withCloseVoteCount(Integer closeVoteCount) {
        this.closeVoteCount = closeVoteCount;
        return this;
    }

    @JsonProperty("reopen_vote_count")
    public Integer getReopenVoteCount() {
        return reopenVoteCount;
    }

    @JsonProperty("reopen_vote_count")
    public void setReopenVoteCount(Integer reopenVoteCount) {
        this.reopenVoteCount = reopenVoteCount;
    }

    public Question withReopenVoteCount(Integer reopenVoteCount) {
        this.reopenVoteCount = reopenVoteCount;
        return this;
    }

    @JsonProperty("delete_vote_count")
    public Integer getDeleteVoteCount() {
        return deleteVoteCount;
    }

    @JsonProperty("delete_vote_count")
    public void setDeleteVoteCount(Integer deleteVoteCount) {
        this.deleteVoteCount = deleteVoteCount;
    }

    public Question withDeleteVoteCount(Integer deleteVoteCount) {
        this.deleteVoteCount = deleteVoteCount;
        return this;
    }

    @JsonProperty("last_edit_date")
    public Integer getLastEditDate() {
        return lastEditDate;
    }

    @JsonProperty("last_edit_date")
    public void setLastEditDate(Integer lastEditDate) {
        this.lastEditDate = lastEditDate;
    }

    public Question withLastEditDate(Integer lastEditDate) {
        this.lastEditDate = lastEditDate;
        return this;
    }

    @JsonProperty("comments")
    public List<Comment> getComments() {
        return comments;
    }

    @JsonProperty("comments")
    public void setComments(List<Comment> comments) {
        this.comments = comments;
    }

    public Question withComments(List<Comment> comments) {
        this.comments = comments;
        return this;
    }

    @JsonProperty("accepted_answer_id")
    public Integer getAcceptedAnswerId() {
        return acceptedAnswerId;
    }

    @JsonProperty("accepted_answer_id")
    public void setAcceptedAnswerId(Integer acceptedAnswerId) {
        this.acceptedAnswerId = acceptedAnswerId;
    }

    public Question withAcceptedAnswerId(Integer acceptedAnswerId) {
        this.acceptedAnswerId = acceptedAnswerId;
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
