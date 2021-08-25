package Caclulator;

public class Calculator {

    public static int addittion(String s) {
        if(s.equals(""))
        {
            //If string is empty return 0;
            return 0;
        }
        else if(s.indexOf(',') != -1 || s.indexOf('\n') != -1 )
        {
            //If String contains ',' separated values like "1,2"

            String[] numbers = s.split("[,\n]");
            return summation(numbers);
        }
        else
        {
            //If string contains only number than return that number only
            return Integer.parseInt(s);
        }

    }

    private static int summation(String[] numbers)
    {
        int sum = 0;
        for(String i: numbers)
        {
            sum = sum + Integer.parseInt(i);
        }
        return sum;
    }
}
