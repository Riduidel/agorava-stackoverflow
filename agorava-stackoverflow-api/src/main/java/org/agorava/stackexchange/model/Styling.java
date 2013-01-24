
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
    "link_color",
    "tag_foreground_color",
    "tag_background_color"
})
public class Styling {

    @JsonProperty("link_color")
    private String linkColor;
    @JsonProperty("tag_foreground_color")
    private String tagForegroundColor;
    @JsonProperty("tag_background_color")
    private String tagBackgroundColor;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("link_color")
    public String getLinkColor() {
        return linkColor;
    }

    @JsonProperty("link_color")
    public void setLinkColor(String linkColor) {
        this.linkColor = linkColor;
    }

    public Styling withLinkColor(String linkColor) {
        this.linkColor = linkColor;
        return this;
    }

    @JsonProperty("tag_foreground_color")
    public String getTagForegroundColor() {
        return tagForegroundColor;
    }

    @JsonProperty("tag_foreground_color")
    public void setTagForegroundColor(String tagForegroundColor) {
        this.tagForegroundColor = tagForegroundColor;
    }

    public Styling withTagForegroundColor(String tagForegroundColor) {
        this.tagForegroundColor = tagForegroundColor;
        return this;
    }

    @JsonProperty("tag_background_color")
    public String getTagBackgroundColor() {
        return tagBackgroundColor;
    }

    @JsonProperty("tag_background_color")
    public void setTagBackgroundColor(String tagBackgroundColor) {
        this.tagBackgroundColor = tagBackgroundColor;
    }

    public Styling withTagBackgroundColor(String tagBackgroundColor) {
        this.tagBackgroundColor = tagBackgroundColor;
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
