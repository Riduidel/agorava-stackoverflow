
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
    "name",
    "count",
    "is_required",
    "is_moderator_only",
    "has_synonyms",
    "last_activity_date"
})
public class Tag {

    @JsonProperty("name")
    private String name;
    @JsonProperty("count")
    private Integer count;
    @JsonProperty("is_required")
    private Boolean isRequired;
    @JsonProperty("is_moderator_only")
    private Boolean isModeratorOnly;
    @JsonProperty("has_synonyms")
    private Boolean hasSynonyms;
    @JsonProperty("last_activity_date")
    private Integer lastActivityDate;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public Tag withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("count")
    public Integer getCount() {
        return count;
    }

    @JsonProperty("count")
    public void setCount(Integer count) {
        this.count = count;
    }

    public Tag withCount(Integer count) {
        this.count = count;
        return this;
    }

    @JsonProperty("is_required")
    public Boolean getIsRequired() {
        return isRequired;
    }

    @JsonProperty("is_required")
    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    public Tag withIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    @JsonProperty("is_moderator_only")
    public Boolean getIsModeratorOnly() {
        return isModeratorOnly;
    }

    @JsonProperty("is_moderator_only")
    public void setIsModeratorOnly(Boolean isModeratorOnly) {
        this.isModeratorOnly = isModeratorOnly;
    }

    public Tag withIsModeratorOnly(Boolean isModeratorOnly) {
        this.isModeratorOnly = isModeratorOnly;
        return this;
    }

    @JsonProperty("has_synonyms")
    public Boolean getHasSynonyms() {
        return hasSynonyms;
    }

    @JsonProperty("has_synonyms")
    public void setHasSynonyms(Boolean hasSynonyms) {
        this.hasSynonyms = hasSynonyms;
    }

    public Tag withHasSynonyms(Boolean hasSynonyms) {
        this.hasSynonyms = hasSynonyms;
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

    public Tag withLastActivityDate(Integer lastActivityDate) {
        this.lastActivityDate = lastActivityDate;
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
