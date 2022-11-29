/*
 * Solution to Project Euler problem 7
 * Copyright (c) Project of Tommy_fking_Shelby. All rights reserved.
 * Euler link - https://projecteuler.net/problem=7
 */
public class euler7 {
    static boolean prime(long n)
    {
        long a = Math.round((n/2.0)+1);
        boolean prime = true;
        for(long i = 2; i <= a; i++)
        {
            if(n == 2)
            break;
            
            if(n%i==0)
            {
                prime = false;
                break;
            }
        }
        return prime;
    }
    public static void main(String[] args) {
        long c = 1;
        long prime = 1;
        do
        {
            prime++;
            if(prime(prime))
                c++;
        }
        while(c < 10001);
        System.out.print(prime);
    }
}
