/*
 * Solution to Project Euler problem 5
 * Copyright (c) Project of Tommy_fking_Shelby. All rights reserved.
 * Euler link - https://projecteuler.net/problem=5
 */
public class euler5 {
    static long Lcm(long a, long b)
    {
        long lcm = (a>b)?a:b;
        while(true)
        {
            if(lcm % a == 0 && lcm % b == 0)break;
            lcm++;
        }
        return lcm;
    }
    public static void main(String[] args) {
        long a = 1;
        long b = 2;
        long lcm = 0;
        while(b <= 20)
        {
            lcm = Lcm(a, b);
            a = lcm;
            b++;
        }
        System.out.println(lcm);
    }
}
