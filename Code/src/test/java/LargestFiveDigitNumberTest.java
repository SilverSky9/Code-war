import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

// TODO: Replace examples and use TDD by writing your own tests

public class LargestFiveDigitNumberTest {
    LargestFiveDigitNumber largestFiveDigitNumber;
    @Before
    public void setUp(){
        largestFiveDigitNumber = new LargestFiveDigitNumber();
    }
    @Test
    public void simpleTest(){
        assertEquals("Test", largestFiveDigitNumber.simpleTest());
    }
    @Test
    public void  test(){
        assertEquals(83910, largestFiveDigitNumber.solve("283910"));
        assertEquals(67890, largestFiveDigitNumber.solve("67890"));
        assertEquals(74765, largestFiveDigitNumber.solve("731674765"));
    }
    @Test
    public void  BP_test(){
        assertEquals(83910, largestFiveDigitNumber.BP_solve("283910"));
        assertEquals(67890, largestFiveDigitNumber.BP_solve("67890"));
        assertEquals(74765, largestFiveDigitNumber.BP_solve("731674765"));
    }
//    @Test
//    public void exampleTests() {
//        Preloaded.doTest("283910", 83910);
//        Preloaded.doTest("67890", 67890);
//        Preloaded.doTest("731674765", 74765);
//    }
}