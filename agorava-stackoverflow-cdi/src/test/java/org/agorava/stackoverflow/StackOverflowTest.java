/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.agorava.stackoverflow;

import java.io.File;
import java.io.FileNotFoundException;
import org.agorava.core.api.SocialMediaApiHub;

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
                .addClass(TwitterServiceProducer.class)
                .addAsLibraries(new File("../agorava-twitter-api/target/agorava-twitter-api.jar"));
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
}
