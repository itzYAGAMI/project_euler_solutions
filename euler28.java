/*
 * Solution to Project Euler problem 28
 * Copyright (c) Project of thomas_fking_shelby. All rights reserved.
 * Euler link - https://projecteuler.net/problem=28
 */
public class euler28 {
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();
        int sum = 0, sq;
        for(int i = 2; i <= 1001;i++)
        {
            sq = i * i;
            sum += sq + ((i%2==0)?1:0);
            // if(i % 2 == 0)
            //     sum += sq + 1;
            // else
            //     sum += sq;
            sum += (sq+1)-i;
        }
        sum = sum + 1;//as 1 was not calculated in loop
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end-starttime + "ms");
    }
}
