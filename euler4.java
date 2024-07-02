/*
 * Solution to Project Euler problem 4
 * Copyright (c) Project of Tommy_fking_Shelby. All rights reserved.
 * Euler link - https://projecteuler.net/problem=4
 */
public class euler4 {
    static boolean isPalindrome(long n)
    {
        String s = n+"";
        StringBuilder og = new StringBuilder();
        og.append(s);
        og = og.reverse();
        String rev = og.toString();
        if(rev.equalsIgnoreCase(s))
        return true;
        else
        return false;
    }
    public static void main(String[] args) {
        int[] a = new int[100];
        int[] b = new int[100];
        for(int i = 999;i >= 900; i--)
        {
            a[999-i]=i;
            b[999-i]=i;
        }
        int c = 0, d = 0, e = 0;
        long greatest = 1;
        while(true)
        {
            for(c = e; c <= 99; c++)
            {
                if(greatest <(a[c]*b[d]) && isPalindrome(a[c]*b[d]))
                greatest = a[c] * b[d];
                // System.out.println(greatest);

            }
            e++;
            c = e;
            d++;
            if(greatest != 1)
            break;
        }
        System.out.print(greatest);
    }
}
