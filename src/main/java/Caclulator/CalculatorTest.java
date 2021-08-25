package Caclulator;

import org.junit.*;
import static org.junit.Assert.*;

/*
Testcase 2: The method can take up to two numbers, separated by commas, and will return their sum.
*/

public class CalculatorTest {
    @Test
    //for empty strings like ""
    public void TestCase_1_MustReturnZeroOnEmptyString(){
        assertEquals(0, Calculator.addittion(""));
    }

    @Test
    //for strings which contains only number like "1"
    public void TestCase_2_SimplyReturnNumber()
    {
        assertEquals(1,Calculator.addittion("1"));
    }
}
