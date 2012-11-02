
package org.agorava.stackexchange.model.wrappers;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedList;
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
    "total",
    "page_size",
    "page",
    "type",
    "items",
    "quota_remaining",
    "quota_max",
    "backoff",
    "has_more"
})
public class AbstractWrapper<WrappedData> {
	/**
	 * Filtering interface allowing guava-like processing
	 *
	 * @param <WrappedData>
	 */
	public static interface ItemFilter<WrappedData> {
		public boolean matches(WrappedData toMatch);
	}

    @JsonProperty("total")
    private Integer total;
    @JsonProperty("page_size")
    private Integer pageSize;
    @JsonProperty("page")
    private Integer page;
    @JsonProperty("type")
    private String type;
    @JsonProperty("items")
    private List<WrappedData> items = new ArrayList<WrappedData>();
    @JsonProperty("quota_remaining")
    private Integer quotaRemaining;
    @JsonProperty("quota_max")
    private Integer quotaMax;
    @JsonProperty("backoff")
    private Integer backoff;
    @JsonProperty("has_more")
    private Boolean hasMore;
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("total")
    public Integer getTotal() {
        return total;
    }

    @JsonProperty("total")
    public void setTotal(Integer total) {
        this.total = total;
    }

    public AbstractWrapper<WrappedData> withTotal(Integer total) {
        this.total = total;
        return this;
    }

    @JsonProperty("page_size")
    public Integer getPageSize() {
        return pageSize;
    }

    @JsonProperty("page_size")
    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public AbstractWrapper<WrappedData> withPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }

    @JsonProperty("page")
    public Integer getPage() {
        return page;
    }

    @JsonProperty("page")
    public void setPage(Integer page) {
        this.page = page;
    }

    public AbstractWrapper<WrappedData> withPage(Integer page) {
        this.page = page;
        return this;
    }

    @JsonProperty("type")
    public String getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(String type) {
        this.type = type;
    }

    public AbstractWrapper<WrappedData> withType(String type) {
        this.type = type;
        return this;
    }

    @JsonProperty("items")
    public List<WrappedData> getItems() {
        return items;
    }

    @JsonProperty("items")
    public void setItems(List<WrappedData> items) {
        this.items = items;
    }

    public AbstractWrapper<WrappedData> withItems(List<WrappedData> items) {
        this.items = items;
        return this;
    }

    @JsonProperty("quota_remaining")
    public Integer getQuotaRemaining() {
        return quotaRemaining;
    }

    @JsonProperty("quota_remaining")
    public void setQuotaRemaining(Integer quotaRemaining) {
        this.quotaRemaining = quotaRemaining;
    }

    public AbstractWrapper<WrappedData> withQuotaRemaining(Integer quotaRemaining) {
        this.quotaRemaining = quotaRemaining;
        return this;
    }

    @JsonProperty("quota_max")
    public Integer getQuotaMax() {
        return quotaMax;
    }

    @JsonProperty("quota_max")
    public void setQuotaMax(Integer quotaMax) {
        this.quotaMax = quotaMax;
    }

    public AbstractWrapper<WrappedData> withQuotaMax(Integer quotaMax) {
        this.quotaMax = quotaMax;
        return this;
    }

    @JsonProperty("backoff")
    public Integer getBackoff() {
        return backoff;
    }

    @JsonProperty("backoff")
    public void setBackoff(Integer backoff) {
        this.backoff = backoff;
    }

    public AbstractWrapper<WrappedData> withBackoff(Integer backoff) {
        this.backoff = backoff;
        return this;
    }

    @JsonProperty("has_more")
    public Boolean getHasMore() {
        return hasMore;
    }

    @JsonProperty("has_more")
    public void setHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
    }

    public AbstractWrapper<WrappedData> withHasMore(Boolean hasMore) {
        this.hasMore = hasMore;
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

    public List<WrappedData> filter(ItemFilter<WrappedData> filter) {
    	List<WrappedData> returned = new LinkedList<WrappedData>();
    	for(WrappedData item : getItems()) {
    		if(filter.matches(item)) {
    			returned.add(item);
    		}
    	}
    	return returned;
    }
}
