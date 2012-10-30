
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
    "post_id",
    "post_type",
    "body",
    "owner",
    "creation_date",
    "last_activity_date",
    "last_edit_date",
    "score",
    "up_vote_count",
    "down_vote_count",
    "link",
    "comments"
})
public class Post {

    @JsonProperty("post_id")
    private Integer postId;
    @JsonProperty("post_type")
    private String postType;
    @JsonProperty("body")
    private String body;
    @JsonProperty("owner")
    private ShallowUser owner;
    @JsonProperty("creation_date")
    private Integer creationDate;
    @JsonProperty("last_activity_date")
    private Integer lastActivityDate;
    @JsonProperty("last_edit_date")
    private Integer lastEditDate;
    @JsonProperty("score")
    private Integer score;
    @JsonProperty("up_vote_count")
    private Integer upVoteCount;
    @JsonProperty("down_vote_count")
    private Integer downVoteCount;
    @JsonProperty("link")
    private String link;
    @JsonProperty("comments")
    private List<Comment> comments = new ArrayList<Comment>();
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("post_id")
    public Integer getPostId() {
        return postId;
    }

    @JsonProperty("post_id")
    public void setPostId(Integer postId) {
        this.postId = postId;
    }

    public Post withPostId(Integer postId) {
        this.postId = postId;
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

    public Post withPostType(String postType) {
        this.postType = postType;
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

    public Post withBody(String body) {
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

    public Post withOwner(ShallowUser owner) {
        this.owner = owner;
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

    public Post withCreationDate(Integer creationDate) {
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

    public Post withLastActivityDate(Integer lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
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

    public Post withLastEditDate(Integer lastEditDate) {
        this.lastEditDate = lastEditDate;
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

    public Post withScore(Integer score) {
        this.score = score;
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

    public Post withUpVoteCount(Integer upVoteCount) {
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

    public Post withDownVoteCount(Integer downVoteCount) {
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

    public Post withLink(String link) {
        this.link = link;
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

    public Post withComments(List<Comment> comments) {
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
