

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class Magpie2Test.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class Magpie2Test
{
    /**
     * Default constructor for test class Magpie2Test
     */
    public Magpie2Test()
    {
    }

    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp()
    {
    }

    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown()
    {
    }

    @Test
    public void testGetGreeting()
    {
        Magpie2 magpie21 = new Magpie2();
        assertEquals("Hello, let's talk.", magpie21.getGreeting());
    }

    @Test
    public void testGetResponse()
    {
        Magpie2 magpie21 = new Magpie2();
        assertEquals("Why so negative?", magpie21.getResponse("no"));
        assertEquals("Tell me more about your family.", magpie21.getResponse("mother"));
        assertEquals("Tell me more about your family.", magpie21.getResponse("father"));
        assertEquals("Tell me more about your family.", magpie21.getResponse("sister"));
        assertEquals("Tell me more about your family.", magpie21.getResponse("brother"));
        assertEquals("Tell me more about your pets.",magpie21.getResponse("cat"));
        assertEquals("Tell me more about your pets.",magpie21.getResponse("dog"));
        assertEquals("Say something, please.",magpie21.getResponse(""));
    }
}


