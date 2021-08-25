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

    @Test
    //sum of multivalues separated by new line character
    public void TestCase_5_SumOfMultivaluesSeparatedByNewLineCharacter()
    {
        assertEquals(6,Calculator.addittion("1\n2,3"));
    }

    @Test
    //Sum of multivalues separated by given delimiter
    public void TestCase_6_SumOfMultivaluesSeparatedByGivenDelimiter()
    {
        assertEquals(6,Calculator.addittion("//#\n1#2#3"));
        assertEquals(9,Calculator.addittion("//;\n4;4;1"));
    }

    @Test
    //Exception Message For Negative Numbers
    public void TestCase_7_NegativeNumberException()
    {
        try{
                Calculator.addittion("-5,6,9,-10,5,6");
                fail("Exception expected");
        }
        catch(RuntimeException ex)
        {
            assertEquals("Negatives not allowed: [-5, -10]", ex.getMessage());
        }
    }

    @Test
    //Numbers bigger than 1000 should be ignored, so adding 2 + 1001 = 2
    public void TestCase_8_NumberGreaterThanThousandsIgnored()
    {
        assertEquals(5,Calculator.addittion("2,1000,3"));
    }
}
