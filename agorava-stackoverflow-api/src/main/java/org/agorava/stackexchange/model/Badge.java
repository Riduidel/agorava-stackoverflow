
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
    "badge_id",
    "rank",
    "name",
    "description",
    "award_count",
    "badge_type",
    "link"
})
public class Badge {

    public static enum Rank {

        gold, silver, bronze;
    }

    public static enum Type {

        named, tag_based;
    }
    
    @JsonProperty("badge_id")
    private Integer badgeId;
    @JsonProperty("rank")
    private Rank rank;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private String description;
    @JsonProperty("award_count")
    private Integer awardCount;
    @JsonProperty("badge_type")
    private Type badgeType;
    @JsonProperty("link")
    private String link;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("badge_id")
    public Integer getBadgeId() {
        return badgeId;
    }

    @JsonProperty("badge_id")
    public void setBadgeId(Integer badgeId) {
        this.badgeId = badgeId;
    }

    public Badge withBadgeId(Integer badgeId) {
        this.badgeId = badgeId;
        return this;
    }

    @JsonProperty("rank")
    public Rank getRank() {
        return rank;
    }

    @JsonProperty("rank")
    public void setRank(Rank rank) {
        this.rank = rank;
    }

    public Badge withRank(Rank rank) {
        this.rank = rank;
        return this;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Badge withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("description")
    public String getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(String description) {
        this.description = description;
    }

    public Badge withDescription(String description) {
        this.description = description;
        return this;
    }

    @JsonProperty("award_count")
    public Integer getAwardCount() {
        return awardCount;
    }

    @JsonProperty("award_count")
    public void setAwardCount(Integer awardCount) {
        this.awardCount = awardCount;
    }

    public Badge withAwardCount(Integer awardCount) {
        this.awardCount = awardCount;
        return this;
    }

    @JsonProperty("badge_type")
    public Type getBadgeType() {
        return badgeType;
    }

    @JsonProperty("badge_type")
    public void setBadgeType(Type badgeType) {
        this.badgeType = badgeType;
    }

    public Badge withBadgeType(Type badgeType) {
        this.badgeType = badgeType;
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

    public Badge withLink(String link) {
        this.link = link;
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
