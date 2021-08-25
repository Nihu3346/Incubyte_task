package Caclulator;

public class Calculator {

    //The method can take up to two numbers, separated by commas, and will return their sum.

    public static int addittion(String s) {
        if(s.equals(""))
        {
            //If string is empty return 0;
            return 0;
        }
        else
        {
            //If string contains only number then return that number only
            return Integer.parseInt(s);
        }

    }
}
