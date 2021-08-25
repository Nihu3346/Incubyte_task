package Caclulator;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Calculator {

    public static int addittion(String s) {

        if(s.equals(""))
        {
            //If string is empty return 0;
            return 0;
        }
        else if(s.length() == 1)
        {
            //If string contains only number than return that number only
            if(Integer.parseInt(s) < 0)
            {
                throw new RuntimeException("Negatives not allowed: "+Integer.parseInt(s));
            }
            return Integer.parseInt(s);
        }
        else
        {
            String[] numbers = new String[0];
            if(s.charAt(0) == '/' && s.charAt(1) == '/' &&  s.charAt(3)=='\n')
            {
                String substr = s.substring(4);
                char sig = s.charAt(2);
                numbers = substr.split(String.valueOf(sig));
            }
            else if(s.indexOf(',') != -1 || s.indexOf('\n') != -1 )
            {
                //If String contains ',' separated values like "1,2"
                numbers = s.split("[,\n]");
            }
            List<Integer> list= checkNegativity(numbers);
            if(!list.isEmpty())
            {
                throw new RuntimeException("Negatives not allowed: "+ Arrays.toString(list.toArray()));
            }

            return summation(numbers);
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
    private static List<Integer> checkNegativity(String[] numbers)
    {
        List<Integer> list=new ArrayList<>();
        for(String i:numbers)
        {
            if( Integer.parseInt(i) < 0)
            {
                list.add(Integer.parseInt(i));
            }
        }
        return list;
    }
}
