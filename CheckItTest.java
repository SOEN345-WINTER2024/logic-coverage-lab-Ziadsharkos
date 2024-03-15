import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CheckItTest {
    private ByteArrayOutputStream outContent;

    @Before
    public void setUpStreams() {
        outContent = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void cleanUpStreams() {
        System.setOut(null);
    }

    @Test
    public void predicateCoverageTest1() {
        CheckIt.checkIt(true, true, true);
        assertEquals("P is true\n", outContent.toString());
    }

    @Test
    public void predicateCoverageTest2() {
        CheckIt.checkIt(false, true, false);
        assertEquals("P isn't true\n", outContent.toString());
    }

    @Test
    public void clauseCoverageTest1() {
        CheckIt.checkIt(true, true, true);
        assertEquals("P is true\n", outContent.toString());
    }

    @Test
    public void clauseCoverageTest2() {
        CheckIt.checkIt(true, true, false);
        assertEquals("P is true\n", outContent.toString());
    }

    @Test
    public void clauseCoverageTest3() {
        CheckIt.checkIt(false, true, true);
        assertEquals("P is true\n", outContent.toString());
    }

    @Test
    public void clauseCoverageTest4() {
        CheckIt.checkIt(false, true, false);
        assertEquals("P isn't true\n", outContent.toString());
    }

    @Test
    public void caccCoverageTest1() {
        CheckIt.checkIt(true, true, true);
        assertEquals("P is true\n", outContent.toString());
    }

    @Test
    public void caccCoverageTest2() {
        CheckIt.checkIt(false, true, false);
        assertEquals("P isn't true\n", outContent.toString());
    }

    @Test
    public void raccCoverageTest1() {
        CheckIt.checkIt(true, true, true);
        assertEquals("P is true\n", outContent.toString());
    }

    @Test
    public void raccCoverageTest2() {
        CheckIt.checkIt(true, true, true);
        assertEquals("P is true\n", outContent.toString());
    }

    @Test
    public void mccCoverageTest1() {
        CheckIt.checkIt(false, true, true);
        assertEquals("P is true\n", outContent.toString());
    }
}
