package com.company;

public class Main
{
    public static void main(String[] args)
    {
        int[] a = {6, 2, 3, 4, 6};
        System.out.print (unique (a));
    }
    static boolean unique (int[] numbers)
    {
        //returns true if all the elements of numbers are unique and false otherwise
        boolean isUnique = true;
        for (int n = 0; n < numbers.length; n++)
        {
            for (int m = n + 1; m < numbers.length && isUnique; m++)
                if (numbers [m] == numbers [n])
                    isUnique = false;
        }
        return isUnique;
    }
}
