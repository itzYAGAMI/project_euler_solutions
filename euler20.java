/*
 * Solution to Project Euler problem 28
 * Copyright (c) Project of thomas_fking_shelby. All rights reserved.
 * Euler link - https://projecteuler.net/problem=20
 */
import java.math.*;

public class euler20 {
    public static void main(String[] args) {
        long starttime = System.currentTimeMillis();
        BigInteger f = BigInteger.ONE;
        for(int i = 1;i <= 100;i++)
        {
            f = f.multiply(BigInteger.valueOf(i));
        }

        String num = new String(f.toString());
        // System.out.println(num);
        int sum = 0;
        for(int i = 0;i < num.length(); i++)
        {
            int d = Integer.parseInt(""+num.charAt(i));
            sum = sum + d;
        }
        System.out.println(sum);
        long end = System.currentTimeMillis();
        System.out.println(end-starttime + "ms");
    }
}
