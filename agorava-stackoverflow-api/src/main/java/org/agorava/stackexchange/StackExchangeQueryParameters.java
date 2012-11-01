/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Date;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * A builder-pattern based implementation of common query parrameters of all StackExchange queries
 * @author ndx
 * @param RangeType defines the type used for min and max values
 */
public class StackExchangeQueryParameters<RangeType> {
    /**
     * Defined by https://api.stackexchange.com/docs/paging
     */
    public static final int FIRST_PAGE = 1;
    /**
     * Defined by https://api.stackexchange.com/docs/paging
     */
    public static final int MAX_PAGE_SIZE = 100;
    /**
     * Define answers ordering
     */
    public static enum Order {
        desc,
        asc;
    }

    /**
     * used site,d efaults to stackoverflow. Can be any value in https://api.stackexchange.com/docs/sites api_site_parameter (or site_url).
     * These values can also be obtained by calling 
     */
    private String site = "stackoverflow";
    private int page;
    private int pagesize;
    private Date fromDate;
    private Date toDate;
    private Order order = Order.desc;
    private RangeType min;
    private RangeType max;
    private String sort;
    
    /**
     * Used filter, defined according to https://api.stackexchange.com/docs/filters
     */
    private String filter;

    public Date getFromDate() {
        return fromDate;
    }

    public void setFromDate(Date fromDate) {
        this.fromDate = fromDate;
    }
    
    public StackExchangeQueryParameters<RangeType> withFromDate(Date fromDate) {
        setFromDate(fromDate);
        return this;
    }

    public RangeType getMax() {
        return max;
    }

    public void setMax(RangeType max) {
        this.max = max;
    }
    
    public StackExchangeQueryParameters<RangeType> withMax(RangeType max) {
        setMax(max);
        return this;
    }

    public RangeType getMin() {
        return min;
    }

    public void setMin(RangeType min) {
        this.min = min;
    }
    
    public StackExchangeQueryParameters<RangeType> withMin(RangeType min) {
        setMin(min);
        return this;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }
    
    public StackExchangeQueryParameters<RangeType> withOrder(Order order) {
        setOrder(order);
        return this;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
    
    public StackExchangeQueryParameters<RangeType> withPage(int page) {
        setPage(page);
        return this;
    }

    public int getPagesize() {
        return pagesize;
    }

    public void setPagesize(int pagesize) {
        this.pagesize = pagesize;
    }
    
    public StackExchangeQueryParameters<RangeType> withPagesize(int page) {
        setPagesize(page);
        return this;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }
    
    public StackExchangeQueryParameters<RangeType> withSite(String site) {
        setSite(site);
        return this;
    }

    public Date getToDate() {
        return toDate;
    }

    public void setToDate(Date toDate) {
        this.toDate = toDate;
    }
    
    public StackExchangeQueryParameters<RangeType> withToDate(Date date) {
        setToDate(date);
        return this;
    }

    public String getSort() {
        return sort;
    }

    /**
     * When setting a sort order, service interface usually provides an enum with valid values. You are GREATLY encouraged to use that Sort enum instead of a random string.
     * @param sort
     */
    public void setSort(String sort) {
        this.sort = sort;
    }
    
    public StackExchangeQueryParameters<RangeType> withSort(String sort) {
        setSort(sort);
        return this;
    }

    public String getFiler() {
        return filter;
    }

    /**
     * Set filter to be used on that query. We HIGHLY recommend you use one of {@link DefaultFilter} values 
     * @param filer
     */
    @Deprecated
    public void setFilter(String filer) {
        this.filter = filer;
    }
    
    public void setFilter(Filter filter) {
		setFilter(filter.getText());
	}
    
    
    public StackExchangeQueryParameters<RangeType> withFilter(String filter) {
        setFilter(filter);
        return this;
    }
   
    public StackExchangeQueryParameters<RangeType> withFilter(DefaultFilter filter) {
        setFilter(filter);
        return this;
    }

    /**
     * Generates a map of parameters from this object fields values.
     * @return a map linking parameter names to their values
     */
    public Map<String, Object> toMap() {
        Map<String, Object> returned = new TreeMap<String, Object>();
        // being a lazy guy, i use reflection instead of a bunch of ifs ... bad ? maybe, but efficient like hell !
        for(Field f : getClass().getDeclaredFields()) {
            if(!Modifier.isStatic(f.getModifiers()) && !Modifier.isFinal(f.getModifiers())) {
                try {
                    Object value = f.get(this);
                    if(value!=null && !value.equals(0))
                        returned.put(f.getName(), value);
                } catch (IllegalArgumentException ex) {
                    Logger.getLogger(StackExchangeQueryParameters.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                    Logger.getLogger(StackExchangeQueryParameters.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        return returned;
    }
}
