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
    public void shouldConvertToRoman() {
        assertEquals("solution(1) should equal to I", "I", conversion.solution(1));
        assertEquals("solution(4) should equal to IV", "IV", conversion.solution(4));
        assertEquals("solution(6) should equal to VI", "VI", conversion.solution(6));
        assertEquals("solution(10) should equal to X", "CDVII", conversion.solution(408));
    }
}

