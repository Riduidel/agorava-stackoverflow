
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
    "user_id",
    "display_name",
    "reputation",
    "user_type",
    "profile_image",
    "link",
    "accept_rate"
})
public class ShallowUser {

    @JsonProperty("user_id")
    private Integer userId;
    @JsonProperty("display_name")
    private String displayName;
    @JsonProperty("reputation")
    private Integer reputation;
    @JsonProperty("user_type")
    private String userType;
    @JsonProperty("profile_image")
    private String profileImage;
    @JsonProperty("link")
    private String link;
    @JsonProperty("accept_rate")
    private Integer acceptRate;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("user_id")
    public Integer getUserId() {
        return userId;
    }

    @JsonProperty("user_id")
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public ShallowUser withUserId(Integer userId) {
        this.userId = userId;
        return this;
    }

    @JsonProperty("display_name")
    public String getDisplayName() {
        return displayName;
    }

    @JsonProperty("display_name")
    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public ShallowUser withDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }

    @JsonProperty("reputation")
    public Integer getReputation() {
        return reputation;
    }

    @JsonProperty("reputation")
    public void setReputation(Integer reputation) {
        this.reputation = reputation;
    }

    public ShallowUser withReputation(Integer reputation) {
        this.reputation = reputation;
        return this;
    }

    @JsonProperty("user_type")
    public String getUserType() {
        return userType;
    }

    @JsonProperty("user_type")
    public void setUserType(String userType) {
        this.userType = userType;
    }

    public ShallowUser withUserType(String userType) {
        this.userType = userType;
        return this;
    }

    @JsonProperty("profile_image")
    public String getProfileImage() {
        return profileImage;
    }

    @JsonProperty("profile_image")
    public void setProfileImage(String profileImage) {
        this.profileImage = profileImage;
    }

    public ShallowUser withProfileImage(String profileImage) {
        this.profileImage = profileImage;
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

    public ShallowUser withLink(String link) {
        this.link = link;
        return this;
    }

    @JsonProperty("accept_rate")
    public Integer getAcceptRate() {
        return acceptRate;
    }

    @JsonProperty("accept_rate")
    public void setAcceptRate(Integer acceptRate) {
        this.acceptRate = acceptRate;
    }

    public ShallowUser withAcceptRate(Integer acceptRate) {
        this.acceptRate = acceptRate;
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
