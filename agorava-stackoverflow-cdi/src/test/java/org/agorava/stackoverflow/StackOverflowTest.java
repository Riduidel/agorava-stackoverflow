/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackoverflow;

import java.io.File;
import java.io.FileNotFoundException;

import javax.inject.Inject;

import org.agorava.core.api.SocialMediaApiHub;
import org.agorava.core.api.oauth.OAuthToken;
import org.agorava.core.oauth.scribe.OAuthTokenScribe;
import org.jboss.arquillian.container.test.api.Deployment;
import org.jboss.arquillian.junit.Arquillian;
import org.jboss.shrinkwrap.api.Archive;
import org.jboss.shrinkwrap.api.GenericArchive;
import org.jboss.shrinkwrap.api.ShrinkWrap;
import org.jboss.shrinkwrap.api.spec.WebArchive;
import org.jboss.shrinkwrap.resolver.api.DependencyResolvers;
import org.jboss.shrinkwrap.resolver.api.maven.MavenDependencyResolver;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

/**
 *
 * @author ndx
 */
@RunWith(Arquillian.class)
public class StackOverflowTest {

    @Inject
    @StackOverflow
    SocialMediaApiHub serviceHub;

    @Inject
    StackOverflowUserService userService;

    @Deployment
    public static Archive<?> createTestArchive() throws FileNotFoundException {

        WebArchive ret = ShrinkWrap
                .create(WebArchive.class, "test.war")
                .addPackages(true, "org.agorava")
                .addClass(StackOverflowProducer.class)
                // TODO make use of system properties to inject dependencies and resolve stackoverflow
                .addAsLibraries(new File("../agorava-stackoverflow-api/target/agorava-stackoverflow-api.jar"));
        System.out.println(System.getProperty("arquillian"));
        if (("weld-ee-embedded-1.1".equals(System.getProperty("arquillian")) || System.getProperty("arquillian") == null)) {
            // Don't embed dependencies that are already in the CL in the embedded container from surefire
            ret.addAsLibraries(DependencyResolvers.use(MavenDependencyResolver.class).loadMetadataFromPom("pom.xml")
                    .artifact("org.jboss.solder:solder-impl").resolveAs(GenericArchive.class));
        } else {
            ret.addAsLibraries(DependencyResolvers.use(MavenDependencyResolver.class).loadMetadataFromPom("pom.xml")
                    .artifact("org.jboss.solder:solder-impl").artifact("org.scribe:scribe")
                    .artifact("org.apache.commons:commons-lang3").artifact("org.codehaus.jackson:jackson-mapper-asl")
                    .artifact("com.google.guava:guava").resolveAsFiles());
        }
        return ret;
    }

    @Before
    public void init() {
        OAuthToken token = new OAuthTokenScribe("X)SStU6ugHkVHwu0zZ3JBg((", "r5keqeo7rtTq0NXBea9ZqQ((");
        serviceHub.getSession().setAccessToken(token);
        serviceHub.getService().initAccessToken();
    }

    @Test
    public void authorizationUrlTest() {
        Assert.assertTrue(serviceHub.getService().getAuthorizationUrl().startsWith("http"));
    }
}
