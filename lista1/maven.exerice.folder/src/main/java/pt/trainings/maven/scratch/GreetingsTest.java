package main.java.pt.trainings.maven.scratch;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class GreetingsTest {
    @Test
    public void testSayHello() {
        Greetings greetings = new Greetings();
        assertEquals("Hello John Doe", greetings.sayHello(null));
        assertEquals("Hello Bob", greetings.sayHello("Bob"));
    }
}
