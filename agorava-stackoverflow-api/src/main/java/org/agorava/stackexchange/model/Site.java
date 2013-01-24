
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
    "site_type",
    "name",
    "logo_url",
    "api_site_parameter",
    "site_url",
    "audience",
    "icon_url",
    "aliases",
    "site_state",
    "styling",
    "launch_date",
    "favicon_url",
    "related_sites",
    "markdown_extensions",
    "high_resolution_icon_url"
})
public class Site {
    public static enum State {

        normal, closed_beta, open_beta, linked_meta;
    }

    public static enum Type {

        main_site, meta_site;
    }

    @JsonProperty("site_type")
    private Type siteType;
    @JsonProperty("name")
    private String name;
    @JsonProperty("logo_url")
    private String logoUrl;
    @JsonProperty("api_site_parameter")
    private String apiSiteParameter;
    @JsonProperty("site_url")
    private String siteUrl;
    @JsonProperty("audience")
    private String audience;
    @JsonProperty("icon_url")
    private String iconUrl;
    @JsonProperty("aliases")
    private List<String> aliases = new ArrayList<String>();
    @JsonProperty("site_state")
    private State siteState;
    @JsonProperty("styling")
    private Styling styling;
    @JsonProperty("launch_date")
    private Integer launchDate;
    @JsonProperty("favicon_url")
    private String faviconUrl;
    @JsonProperty("related_sites")
    private List<RelatedSite> relatedSites = new ArrayList<RelatedSite>();
    @JsonProperty("markdown_extensions")
    private List<String> markdownExtensions = new ArrayList<String>();
    @JsonProperty("high_resolution_icon_url")
    private String highResolutionIconUrl;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("site_type")
    public Type getSiteType() {
        return siteType;
    }

    @JsonProperty("site_type")
    public void setSiteType(Type siteType) {
        this.siteType = siteType;
    }

    public Site withSiteType(Type siteType) {
        this.siteType = siteType;
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

    public Site withName(String name) {
        this.name = name;
        return this;
    }

    @JsonProperty("logo_url")
    public String getLogoUrl() {
        return logoUrl;
    }

    @JsonProperty("logo_url")
    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public Site withLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
        return this;
    }

    @JsonProperty("api_site_parameter")
    public String getApiSiteParameter() {
        return apiSiteParameter;
    }

    @JsonProperty("api_site_parameter")
    public void setApiSiteParameter(String apiSiteParameter) {
        this.apiSiteParameter = apiSiteParameter;
    }

    public Site withApiSiteParameter(String apiSiteParameter) {
        this.apiSiteParameter = apiSiteParameter;
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

    public Site withSiteUrl(String siteUrl) {
        this.siteUrl = siteUrl;
        return this;
    }

    @JsonProperty("audience")
    public String getAudience() {
        return audience;
    }

    @JsonProperty("audience")
    public void setAudience(String audience) {
        this.audience = audience;
    }

    public Site withAudience(String audience) {
        this.audience = audience;
        return this;
    }

    @JsonProperty("icon_url")
    public String getIconUrl() {
        return iconUrl;
    }

    @JsonProperty("icon_url")
    public void setIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
    }

    public Site withIconUrl(String iconUrl) {
        this.iconUrl = iconUrl;
        return this;
    }

    @JsonProperty("aliases")
    public List<String> getAliases() {
        return aliases;
    }

    @JsonProperty("aliases")
    public void setAliases(List<String> aliases) {
        this.aliases = aliases;
    }

    public Site withAliases(List<String> aliases) {
        this.aliases = aliases;
        return this;
    }

    @JsonProperty("site_state")
    public State getSiteState() {
        return siteState;
    }

    @JsonProperty("site_state")
    public void setSiteState(State siteState) {
        this.siteState = siteState;
    }

    public Site withSiteState(State siteState) {
        this.siteState = siteState;
        return this;
    }

    @JsonProperty("styling")
    public Styling getStyling() {
        return styling;
    }

    @JsonProperty("styling")
    public void setStyling(Styling styling) {
        this.styling = styling;
    }

    public Site withStyling(Styling styling) {
        this.styling = styling;
        return this;
    }

    @JsonProperty("launch_date")
    public Integer getLaunchDate() {
        return launchDate;
    }

    @JsonProperty("launch_date")
    public void setLaunchDate(Integer launchDate) {
        this.launchDate = launchDate;
    }

    public Site withLaunchDate(Integer launchDate) {
        this.launchDate = launchDate;
        return this;
    }

    @JsonProperty("favicon_url")
    public String getFaviconUrl() {
        return faviconUrl;
    }

    @JsonProperty("favicon_url")
    public void setFaviconUrl(String faviconUrl) {
        this.faviconUrl = faviconUrl;
    }

    public Site withFaviconUrl(String faviconUrl) {
        this.faviconUrl = faviconUrl;
        return this;
    }

    @JsonProperty("related_sites")
    public List<RelatedSite> getRelatedSites() {
        return relatedSites;
    }

    @JsonProperty("related_sites")
    public void setRelatedSites(List<RelatedSite> relatedSites) {
        this.relatedSites = relatedSites;
    }

    public Site withRelatedSites(List<RelatedSite> relatedSites) {
        this.relatedSites = relatedSites;
        return this;
    }

    @JsonProperty("markdown_extensions")
    public List<String> getMarkdownExtensions() {
        return markdownExtensions;
    }

    @JsonProperty("markdown_extensions")
    public void setMarkdownExtensions(List<String> markdownExtensions) {
        this.markdownExtensions = markdownExtensions;
    }

    public Site withMarkdownExtensions(List<String> markdownExtensions) {
        this.markdownExtensions = markdownExtensions;
        return this;
    }

    @JsonProperty("high_resolution_icon_url")
    public String getHighResolutionIconUrl() {
        return highResolutionIconUrl;
    }

    @JsonProperty("high_resolution_icon_url")
    public void setHighResolutionIconUrl(String highResolutionIconUrl) {
        this.highResolutionIconUrl = highResolutionIconUrl;
    }

    public Site withHighResolutionIconUrl(String highResolutionIconUrl) {
        this.highResolutionIconUrl = highResolutionIconUrl;
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
