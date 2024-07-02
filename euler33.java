import java.math.BigInteger;

public class euler33 {
    public static BigInteger findHCF(BigInteger n1, BigInteger n2) {
        if(n1.compareTo(n2) < 0){
            BigInteger t = n1;
            n1 = n2;
            n2 = t;
        }
        BigInteger r;
        while(n2.mod(n1) != BigInteger.ZERO)
        {
            r = n2.mod(n1);
            n2 = n1;
            n1 = r;
        }
        return n1;
    }
    public static void main(String[] args) {
        int n0,n1,d0,d1;
        BigInteger num = BigInteger.ONE;
        BigInteger denum = BigInteger.ONE;
        for(int d = 10; d <= 99; d++)
        {
            for(int n = 10; n < d;n++)
            {
                n0 = n / 10;n1 = n % 10;
                d0 = d / 10; d1 = d % 10;
                
                if(n1 == 0 && d1 == 0)continue;

                if(n0 == d0 || n0 == d1)
                {
                    if(n0 == d0) d0 = 0;
                    else d1 = 0;
                    n0 = 0;
                }
                if(n1 == d0 || n1 == d1)
                {
                    if(n1 == d0) d0 = 0;
                    else d1 = 0;
                    n1 = 0;
                }
                if(n/d == simplest(n0, n1)/simplest(d0, d1))
                {
                    num = num.multiply(BigInteger.valueOf(n));
                    denum = denum.multiply(BigInteger.valueOf(d));
                }
                // System.out.println(((n0*10)+n1) +"/"+ ((d0*10)+d1));
                // num = num.multiply(BigInteger.valueOf(n));
                // denum = denum.multiply(BigInteger.valueOf(d));
                // System.out.println(num+"/"+denum);
                // if(num == 0 || denum == 0)
                // return;
                // System.out.println(n+"/"+d);
                // System.out.println(num+"/"+denum);
            }
        }
        System.out.println(denum.divide(findHCF(num, denum)));
        // System.out.println(denum);
    }
    public static int simplest(int n0, int n1)
    {
        return Integer.parseInt(new StringBuilder(n0*10+n1).reverse().toString());

    }
}
