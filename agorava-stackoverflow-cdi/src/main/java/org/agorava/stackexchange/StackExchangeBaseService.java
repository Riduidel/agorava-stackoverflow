/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import com.google.common.collect.Lists;
import org.agorava.core.api.oauth.OAuthService;
import org.agorava.core.cdi.AbstractSocialMediaApi;
import org.agorava.stackexchange.model.wrappers.AbstractWrapper;

import javax.inject.Inject;
import java.util.Collection;
import java.util.Map;

/**
 * // TODO find a way to inject API root from used StackOverflow site
 *
 * @author ndx
 */
public class StackExchangeBaseService extends AbstractSocialMediaApi {
    /**
     * TODO REMOVE THAT CONSTANT !!!!
     */
    protected static final String SITE_TO_USE = "stackoverflow";

    @Inject
    @StackExchange
    private OAuthService service;

    public String getApiRootUrl() {
        return StackExchangeURIs.API_ROOT;
    }

    protected <WrapperClass extends AbstractWrapper<?>> WrapperClass get(String uri, Class<WrapperClass> wrapper, StackExchangeQueryParameters<?> query) {
        return getService().get(buildUri(uri, query.toMap()), wrapper, false);
    }

    protected <WrapperClass extends AbstractWrapper<?>> WrapperClass get(String uri, Class<WrapperClass> wrapper, StackExchangeQueryParameters<?> query, Map<String, Object> parameters) {
        parameters.putAll(query.toMap());
        return getService().get(buildUri(uri, parameters), wrapper, false);
    }

    /**
     * @param <WrapperClass>
     * @param uri            in that case, that uri must have a "{0}" element that will receive filter vectorized values
     * @param wrapper
     * @param query
     * @param vectorized
     * @return
     */
    protected <WrapperClass extends AbstractWrapper<?>> WrapperClass get(String uri, Class<WrapperClass> wrapper, StackExchangeQueryParameters<?> query, Collection vectorized) {
        return getService().get(buildUri(uri, vectorized, query.toMap()), wrapper, false);
    }

    protected String buildUri(String url, Collection vectorized, Map<String, ? extends Object> parameters) {
        return buildUri(String.format(url, combine(vectorized)), parameters);
    }

    /**
     * Combine a collection of objects into a vectorized query
     *
     * @param vectorized
     * @return
     */
    protected String combine(Collection vectorized) {
        StringBuilder sOut = new StringBuilder();
        for (Object o : vectorized) {
            if (sOut.length() > 0)
                sOut.append(";");
            sOut.append(o.toString());
        }
        return sOut.toString();
    }

    protected Collection<Object> asCollection(Object[] values) {
        return Lists.newArrayList(values);
    }

    @Override
    public OAuthService getService() {
        return service;
    }
}
