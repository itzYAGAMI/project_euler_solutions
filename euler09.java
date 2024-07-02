/*
 * Solution to Project Euler problem 9
 * Copyright (c) Project of Tommy_fking_Shelby. All rights reserved.
 * Euler link - https://projecteuler.net/problem=9
 */
public class euler9 {
    public static void main(String[] args) {
        int a = 1, b = 1, c = 1;
        for(a = 1;a <= 1000;a++)
        {
            for(b = a;b <= 1000;b++)
            {
                c = 1000 - a - b;
                    if (c>0)
                    {
                        if(c*c == a*a + b*b)
                        {
                            System.out.print(a*b*c);
                            break;
                        }
                    }
            }
        }
    }
}
