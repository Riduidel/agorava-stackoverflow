
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
    "comment_id",
    "post_id",
    "creation_date",
    "post_type",
    "score",
    "edited",
    "body",
    "owner",
    "link",
    "body_markdown",
    "reply_to_user"
})
public class Comment {

    @JsonProperty("comment_id")
    private Integer commentId;
    @JsonProperty("post_id")
    private Integer postId;
    @JsonProperty("creation_date")
    private Integer creationDate;
    @JsonProperty("post_type")
    private String postType;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("edited")
    private Boolean edited;
    @JsonProperty("body")
    private String body;
    @JsonProperty("owner")
    private ShallowUser owner;
    @JsonProperty("link")
    private String link;
    @JsonProperty("body_markdown")
    private String bodyMarkdown;
    @JsonProperty("reply_to_user")
    private ShallowUser replyToUser;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("comment_id")
    public Integer getCommentId() {
        return commentId;
    }

    @JsonProperty("comment_id")
    public void setCommentId(Integer commentId) {
        this.commentId = commentId;
    }

    public Comment withCommentId(Integer commentId) {
        this.commentId = commentId;
        return this;
    }

    @JsonProperty("post_id")
    public Integer getPostId() {
        return postId;
    }

    @JsonProperty("post_id")
    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Comment withPostId(Integer postId) {
        this.postId = postId;
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

    public Comment withCreationDate(Integer creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    @JsonProperty("post_type")
    public String getPostType() {
        return postType;
    }

    @JsonProperty("post_type")
    public void setPostType(String postType) {
        this.postType = postType;
    }

    public Comment withPostType(String postType) {
        this.postType = postType;
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

    public Comment withScore(Integer score) {
        this.score = score;
        return this;
    }

    @JsonProperty("edited")
    public Boolean getEdited() {
        return edited;
    }

    @JsonProperty("edited")
    public void setEdited(Boolean edited) {
        this.edited = edited;
    }

    public Comment withEdited(Boolean edited) {
        this.edited = edited;
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

    public Comment withBody(String body) {
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

    public Comment withOwner(ShallowUser owner) {
        this.owner = owner;
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

    public Comment withLink(String link) {
        this.link = link;
        return this;
    }

    @JsonProperty("reply_to_user")
    public ShallowUser getReplyToUser() {
        return replyToUser;
    }

    @JsonProperty("reply_to_user")
    public void setReplyToUser(ShallowUser replyToUser) {
        this.replyToUser = replyToUser;
    }

    public Comment withReplyToUser(ShallowUser replyToUser) {
        this.replyToUser = replyToUser;
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

	/**
	 * @return the bodyMarkdown
	 * @category getter
	 * @category bodyMarkdown
	 */
    @JsonProperty("body_markdown")
	public String getBodyMarkdown() {
		return bodyMarkdown;
	}

	/**
	 * @param bodyMarkdown the bodyMarkdown to set
	 * @category setter
	 * @category bodyMarkdown
	 */
    @JsonProperty("body_markdown")
	public void setBodyMarkdown(String bodyMarkdown) {
		this.bodyMarkdown = bodyMarkdown;
	}

}
