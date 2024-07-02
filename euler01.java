/* 
 * Solution to Project Euler problem 1
 * Copyright (c) Project of Tommy Shelby. All rights reserved.
 * Euler link - https://projecteuler.net/problem=1
*/

public class euler1 
{
    public static void main(String[] args) 
    {
        int result = 0;
        for (int i = 1; i < 1000; i++) 
        {
            if ((i % 3 == 0) || (i % 5 == 0)) 
            {
                result += i;
            }
        }
        System.out.print(result);
    }
}
