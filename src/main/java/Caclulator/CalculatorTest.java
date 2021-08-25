package Caclulator;

import org.junit.*;
import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void TestCase_1_MustReturnZeroOnEmptyString(){
        assertEquals(0, Calculator.addittion(""));
    }
}
