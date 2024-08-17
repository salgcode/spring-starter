package karate;

import com.intuit.karate.junit5.Karate;
import org.junit.platform.runner.JUnitPlatform;
import org.junit.runner.RunWith;

@RunWith(JUnitPlatform.class)
class KarateTests {

    @Karate.Test
    Karate dummyTest() {
        return Karate.run("classpath:karate/dummy.feature");
    }

    @Karate.Test
    Karate helloStatusTest() {
        return Karate.run("classpath:karate/hello/status.feature");
    }

    @Karate.Test
    Karate pokemonListTest() {
        return Karate.run("classpath:karate/hello/pokemonlist.feature");
    }


}