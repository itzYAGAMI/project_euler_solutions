/*
 * Solution to Project Euler problem 2
 * Copyright (c) Project of Tommy_fking_Shelby. All rights reserved.
 * Euler link - https://projecteuler.net/problem=2
 */
public class euler2 {
    public static void main(String[] args) {
        long a = 0;
        long b = 1;
        long s = 0;
        long sum = 0;
        while(b <= 4000000)
        {
            s = a + b;
            a = b;
            b = s;
            if(b % 2 == 0)
            sum += b;
        }
        System.out.println(sum);
    }

}
