
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
    "site_url",
    "relation"
})
public class RelatedSite {

    @JsonProperty("name")
    private String name;
    @JsonProperty("site_url")
    private String siteUrl;
    @JsonProperty("relation")
    private Relation relation;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    public RelatedSite withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("site_url")
    public String getSiteUrl() {
        return siteUrl;
    }

    @JsonProperty("site_url")
    public void setSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
    }

    public RelatedSite withSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
        return this;
    }

    @JsonProperty("relation")
    public Relation getRelation() {
        return relation;
    }

    @JsonProperty("relation")
    public void setRelation(Relation relation) {
        this.relation = relation;
    }

    public RelatedSite withRelation(Relation relation) {
        this.relation = relation;
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
