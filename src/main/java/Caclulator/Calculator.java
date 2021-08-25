package Caclulator;

public class Calculator {

    //The method can take up to two numbers, separated by commas, and will return their sum.

    public static int addittion(String s) {
        if(s.equals(""))
        {
            //If string is empty return 0;
            return 0;
        }
        else if(s.indexOf(',') != -1)
        {
            //If String contains ',' separated values like "1,2"

            String[] numbers = s.split(",");
            return Integer.parseInt(numbers[0]) + Integer.parseInt(numbers[1]);
        }
        else
        {
            //If string contains only number than return that number only
            return Integer.parseInt(s);
        }

    }
}
