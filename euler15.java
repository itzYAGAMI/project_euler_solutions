import java.util.*;
import java.math.BigInteger;
public class euler15 {
    public static BigInteger fact(int n)
    {
        BigInteger f = BigInteger.ONE;
        for(int i = 1;i <=n;i++)
        {
            f = f.multiply(BigInteger.valueOf(i));
        }
        return f;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //The number of boxes in the vertical or horizantal
        int n = 20;
        
        BigInteger factorial1 = fact(2*n);
        BigInteger factorial2 = fact(n);

        BigInteger number = factorial1.divide(factorial2.multiply(factorial2));
        System.out.println(number);
        // System.out.print(f);
        sc.close();

    }
}
