/*
 * Solution to Project Euler problem 10
 * Copyright (c) Project of Tommy_fking_Shelby. All rights reserved.
 * Euler link - https://projecteuler.net/problem=10
 */
public class euler10 {
    static boolean prime(long n)
    {
        long a = (long)Math.sqrt(n);
        boolean prime = true;
        for(long i = 3; i <= a; i+=2)
        {
            if(n%i==0)
            {
                prime = false;
                break;
            }
        }
        return prime;
    }
    public static void main(String[] args) 
    {
        long sum = 0;
        for(long i = 3;i <= 2000000;i+=2)
        {
            if(prime(i))
            {
                sum = sum + i;
            }            
            
        }
        sum += 2; //as we are not counting 2 in the loop but it is prime
        System.out.println(sum);
    }
}
