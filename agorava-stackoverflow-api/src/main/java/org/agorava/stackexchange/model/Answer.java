
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
    "answer_id",
    "creation_date",
    "last_edit_date",
    "last_activity_date",
    "score",
    "is_accepted",
    "body",
    "owner",
    "title",
    "up_vote_count",
    "down_vote_count",
    "link",
    "tags",
    "last_edit_date",
    "comments"
})
public class Answer {

    @JsonProperty("question_id")
    private Integer questionId;
    @JsonProperty("answer_id")
    private Integer answerId;
    @JsonProperty("creation_date")
    private Integer creationDate;
    @JsonProperty("last_edit_date")
    private Integer lastEditDate;
    @JsonProperty("last_activity_date")
    private Integer lastActivityDate;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("is_accepted")
    private Boolean isAccepted;
    @JsonProperty("body")
    private String body;
    @JsonProperty("owner")
    private ShallowUser owner;
    @JsonProperty("title")
    private String title;
    @JsonProperty("up_vote_count")
    private Integer upVoteCount;
    @JsonProperty("down_vote_count")
    private Integer downVoteCount;
    @JsonProperty("link")
    private String link;
    @JsonProperty("tags")
    private List<Object> tags = new ArrayList<Object>();
    @JsonProperty("comments")
    private List<Comment> comments = new ArrayList<Comment>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("question_id")
    public Integer getQuestionId() {
        return questionId;
    }

    @JsonProperty("question_id")
    public void setQuestionId(Integer questionId) {
        this.questionId = questionId;
    }

    public Answer withQuestionId(Integer questionId) {
        this.questionId = questionId;
        return this;
    }

    @JsonProperty("answer_id")
    public Integer getAnswerId() {
        return answerId;
    }

    @JsonProperty("answer_id")
    public void setAnswerId(Integer answerId) {
        this.answerId = answerId;
    }

    public Answer withAnswerId(Integer answerId) {
        this.answerId = answerId;
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

    public Answer withCreationDate(Integer creationDate) {
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

    public Answer withLastActivityDate(Integer lastActivityDate) {
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

    public Answer withScore(Integer score) {
        this.score = score;
        return this;
    }

    @JsonProperty("is_accepted")
    public Boolean getIsAccepted() {
        return isAccepted;
    }

    @JsonProperty("is_accepted")
    public void setIsAccepted(Boolean isAccepted) {
        this.isAccepted = isAccepted;
    }

    public Answer withIsAccepted(Boolean isAccepted) {
        this.isAccepted = isAccepted;
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

    public Answer withBody(String body) {
        this.body = body;
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

    public Answer withOwner(ShallowUser owner) {
        this.owner = owner;
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

    public Answer withTitle(String title) {
        this.title = title;
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

    public Answer withUpVoteCount(Integer upVoteCount) {
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

    public Answer withDownVoteCount(Integer downVoteCount) {
        this.downVoteCount = downVoteCount;
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

    public Answer withLink(String link) {
        this.link = link;
        return this;
    }

    @JsonProperty("tags")
    public List<Object> getTags() {
        return tags;
    }

    @JsonProperty("tags")
    public void setTags(List<Object> tags) {
        this.tags = tags;
    }

    public Answer withTags(List<Object> tags) {
        this.tags = tags;
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

    public Answer withLastEditDate(Integer lastEditDate) {
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

    public Answer withComments(List<Comment> comments) {
        this.comments = comments;
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
