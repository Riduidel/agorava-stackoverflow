
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
    "gold",
    "silver",
    "bronze"
})
public class BadgeCounts {

    @JsonProperty("gold")
    private Integer gold;
    @JsonProperty("silver")
    private Integer silver;
    @JsonProperty("bronze")
    private Integer bronze;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("gold")
    public Integer getGold() {
        return gold;
    }

    @JsonProperty("gold")
    public void setGold(Integer gold) {
        this.gold = gold;
    }

    public BadgeCounts withGold(Integer gold) {
        this.gold = gold;
        return this;
    }

    @JsonProperty("silver")
    public Integer getSilver() {
        return silver;
    }

    @JsonProperty("silver")
    public void setSilver(Integer silver) {
        this.silver = silver;
    }

    public BadgeCounts withSilver(Integer silver) {
        this.silver = silver;
        return this;
    }

    @JsonProperty("bronze")
    public Integer getBronze() {
        return bronze;
    }

    @JsonProperty("bronze")
    public void setBronze(Integer bronze) {
        this.bronze = bronze;
    }

    public BadgeCounts withBronze(Integer bronze) {
        this.bronze = bronze;
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
