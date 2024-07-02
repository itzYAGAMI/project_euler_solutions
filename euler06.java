/*
 * Solution to Project Euler problem 6
 * Copyright (c) Project of Tommy_fking_Shelby. All rights reserved.
 * Euler link - https://projecteuler.net/problem=6
 */
public class euler6 {
    static long sumSquare(long n)
    {
        long sum = 0;
        for(long i = 1;i <= n;i++)
        {
            sum += i*i;
        }
        return sum;
    }
    static long squareSum(long n)
    {
        long sum = 0;
        for(long i = 1;i <= n;i++)
        sum+= i;
        return sum*sum;
    }
    public static void main(String[] args) {
        System.out.print(squareSum(100) - sumSquare(100));
    }
}
