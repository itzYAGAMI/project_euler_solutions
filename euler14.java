/*
 * Solution to Project Euler problem 14
 * Copyright (c) Project of Tommy_fking_Shelby. All rights reserved.
 * Euler link - https://projecteuler.net/problem=14
 */
import java.util.HashMap;
public class euler14 {
    public static void main(String[] args) {
        HashMap<Long, Long> hm = new HashMap<Long, Long>();
        long starttime = System.currentTimeMillis();
        long temp = 0, max = 0, k = 1, maxcont = 0;
        long i = 1;
        for(i = 1;i <= 1000000; i++)
        {
            k = i;
            while(k != 1)
            {
                if(hm.containsKey(k))
                {
                    temp = temp + (hm.get(k));
                    k = 1;
                    continue;
                }
                if(k % 2 == 0)
                    k /= 2;
                else
                    k = k * 3 + 1;
                temp++;
            }
            hm.put(i, temp);
            if(hm.containsKey(max))
            maxcont = hm.get(max);
            max = (temp > maxcont)?i:max;
            temp = 0;
        }
        System.out.println(max+ "\t" +maxcont);
        long end = System.currentTimeMillis();
        System.out.println(end-starttime + "ms");
    }
}
