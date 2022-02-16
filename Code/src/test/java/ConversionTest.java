import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ConversionTest {

//    private Conversion conversion = new Conversion();
    Conversion conversion;

    @Before
    public void setUp(){
        conversion = new Conversion();
    }
//    @Test
//    public void simpleTest(){
//        assertEquals("1", conversion.solution(1));
//    }
    @Test
    public  void simplesimpleTestCase(){
        assertEquals("I", conversion.solution(1));
        assertEquals("III", conversion.solution(3));
        assertEquals("VI", conversion.solution(6));
        assertEquals("IX", conversion.solution(9));
        assertEquals("M", conversion.solution(1000));
        assertEquals("CMXC", conversion.solution(990));
    }
    @Test
    public void simpleTestCase() {
        assertEquals("solution(1) should equal to I", "I", conversion.solution(1));
        assertEquals("solution(4) should equal to IV", "IV", conversion.solution(4));
        assertEquals("solution(6) should equal to VI", "VI", conversion.solution(6));
    }
    @Test
    public void SummitTestCase(){
        assertEquals("solution(10) should equal to X", "CDVIII", conversion.solution(408));
        assertEquals("solution(10) should equal to X", "MMMCCLI", conversion.solution(3251));
    }
}

