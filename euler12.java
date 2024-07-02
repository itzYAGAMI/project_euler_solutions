//import java.util.*;
public class euler12 {
    //public static HashMap<Long, Long> hm = new HashMap<>();
    public static long factorsandshit(long n)
    {
        
        long factors = 0;
        long bound = (long)(Math.sqrt(n));
        for (long i = 1; i <= bound; i++) {
            if (n % i == 0) {
                factors+=2;
            }
        }
        return factors - 1;
    }
        

    public static void main(String[] args) {
        
        long i = 1,sum = 0;
        while(true)
        {
            sum += i;
            // System.out.println(sum);
            if(factorsandshit(sum) > 500)
                break;
            i++;
        }
        System.out.println(sum);
    }
}