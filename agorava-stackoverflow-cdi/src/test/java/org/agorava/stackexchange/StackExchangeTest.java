/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackexchange;

import static org.junit.Assert.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import javax.inject.Inject;

import org.agorava.core.api.SocialMediaApiHub;
import org.agorava.core.api.oauth.OAuthToken;
import org.agorava.core.oauth.scribe.OAuthTokenScribe;
import org.hamcrest.core.IsNull;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.DependencyResolvers;
import org.jboss.shrinkwrap.resolver.api.maven.MavenDependencyResolver;
import org.junit.Before;
import org.junit.runner.RunWith;

/**
 * @author ndx
 */
@RunWith(Arquillian.class)
public abstract class StackExchangeTest {

	public static final int RIDUIDEL_ON_STACKOVERFLOW = 15619;
	public static final Integer ANTOINE_SD_ON_STACKOVERFLOW = 523758;
	@Inject
    @StackExchange
    SocialMediaApiHub serviceHub;

    @Deployment
    public static Archive<?> createTestArchive() throws FileNotFoundException {

        WebArchive ret = ShrinkWrap
                .create(WebArchive.class, "test.war")
                .addPackages(true, "org.agorava")
                .addClass(StackExchangeProducer.class)
                        // TODO make use of system properties to inject dependencies and resolve stackoverflow
                .addAsLibraries(new File("../agorava-stackoverflow-api/target/agorava-stackoverflow-api.jar"));
        System.out.println(System.getProperty("arquillian"));
        if (("weld-ee-embedded-1.1".equals(System.getProperty("arquillian")) || System.getProperty("arquillian") == null)) {
            // Don't embed dependencies that are already in the CL in the embedded container from surefire
            /*ret.addAsLibraries(DependencyResolvers.use(MavenDependencyResolver.class).loadMetadataFromPom("pom.xml")
                    .artifact("org.jboss.solder:solder-impl").resolveAs(GenericArchive.class));
        */
        } else {
            ret.addAsLibraries(DependencyResolvers.use(MavenDependencyResolver.class).loadMetadataFromPom("pom.xml")
                    .artifact("org.jboss.solder:solder-impl").artifact("org.scribe:scribe")
                    .artifact("org.apache.commons:commons-lang3").artifact("org.codehaus.jackson:jackson-mapper-asl")
                    .artifact("com.google.guava:guava").resolveAsFiles());
        }
        return ret;
    }

    @Before
    public void init() throws IOException {
    	InputStream stream = getClass().getClassLoader().getResourceAsStream("stackexchange-token.properties");
    	Properties oauth = new Properties();
    	oauth.load(stream);
    	String token, secret;
    	assertThat(token = oauth.getProperty("stackexchange.test.token"), IsNull.notNullValue());
  	    assertThat(secret = oauth.getProperty("stackexchange.test.secret"), IsNull.notNullValue());
        OAuthToken stackExchangeAuth = new OAuthTokenScribe(token, secret );
        serviceHub.getSession().setAccessToken(stackExchangeAuth);
        serviceHub.getService().initAccessToken();
    }
}
