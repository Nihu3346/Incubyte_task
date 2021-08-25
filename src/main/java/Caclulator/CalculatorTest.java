package Caclulator;

import org.junit.*;
import static org.junit.Assert.*;

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

    @Test
    //For strings which contains numbers separated by ','
    public void TestCase_3_ReturnSumIfCommaFound()
    {
        assertEquals(3,Calculator.addittion("1,2"));
    }

    @Test
    //For Multivalues separated by comma
    public void TestCase_4_ReturnSumOfMultipleValuesIfCommaFound()
    {
        assertEquals(6,Calculator.addittion("1,2,3"));
    }
}
